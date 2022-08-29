<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Canvas测试</title>
    <meta charset="utf-8">

</head>
<body>
<h3>客户信息来源统计</h3>
<p>
    <canvas id="canvas_circle" width="500" height="300" style="border:2px solid #0026ff;" >
        浏览器不支持canvas
    </canvas>
    <input id="phone" value="${sources.phone}" style="display: none">
    <input id="internet" value="${sources.internet}" style="display: none">
</p>
</body>
<script>
    //绘制饼图
    function drawCircle(canvasId, data_arr, color_arr, text_arr)
    {
        var c = document.getElementById(canvasId);
        var ctx = c.getContext("2d");

        var radius = c.height / 2 - 20; //半径
        var ox = radius + 20, oy = radius + 20; //圆心

        var width = 30, height = 10; //图例宽和高
        var posX = ox * 2 + 20, posY = 30;   //
        var textX = posX + width + 5, textY = posY + 10;

        var startAngle = 0; //起始弧度
        var endAngle = 0;   //结束弧度
        for (var i = 0; i < data_arr.length; i++)
        {
            //绘制饼图
            endAngle = endAngle + data_arr[i] * Math.PI * 2; //结束弧度
            ctx.fillStyle = color_arr[i];
            ctx.beginPath();
            ctx.moveTo(ox, oy); //移动到到圆心
            ctx.arc(ox, oy, radius, startAngle, endAngle, false);
            ctx.closePath();
            ctx.fill();
            startAngle = endAngle; //设置起始弧度

            //绘制比例图及文字
            ctx.fillStyle = color_arr[i];
            ctx.fillRect(posX, posY + 20 * i, width, height);
            ctx.moveTo(posX, posY + 20 * i);
            ctx.font = 'bold 12px 微软雅黑';    //斜体 30像素 微软雅黑字体
            ctx.fillStyle = color_arr[i]; //"#000000";
            var percent = text_arr[i] + "：" + 100 * data_arr[i] + "%";
            ctx.fillText(percent, textX, textY + 20 * i);
        }
    }

    var phone = document.getElementById('phone').value;
    var internet = document.getElementById('internet').value;
    var total = parseInt(phone)+parseInt(internet);

    function init() {
        //绘制饼图
        //比例数据和颜色
        var data_arr = [(phone/total).toFixed(2), (internet/total).toFixed(2)];
        var color_arr = ["#00AABB", "#FF4400"];
        var text_arr = ["电话营销", "网络营销"];

        drawCircle("canvas_circle", data_arr, color_arr, text_arr);
    }

    //页面加载时执行init()函数
    window.onload = init;
</script>
</html>
