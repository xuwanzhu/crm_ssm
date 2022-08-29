<%@ page import="com.qidi.crm_ssm.bean.IndustryStatistics" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Canvas测试</title>
    <meta charset="utf-8">

</head>
<body>
<h3>客户行业统计</h3>
<input id="ed" value="${industrys.educate}" style="display: none">
<input id="el" value="${industrys.electric}" style="display: none">
<input id="ou" value="${industrys.outtrade}" style="display: none">
<input id="ho" value="${industrys.hotel}" style="display: none">
<input id="es" value="${industrys.estate}" style="display: none">
<p>
    <canvas id="canvas_circle" width="500" height="300" style="border:2px solid #0026ff;" >
        浏览器不支持canvas
    </canvas>
</p>
</body>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
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

    var ed = document.getElementById('ed').value;
    var el = document.getElementById('el').value;
    var ou = document.getElementById('ou').value;
    var ho = document.getElementById('ho').value;
    var es = document.getElementById('es').value;
    var total = parseInt(ed)+parseInt(el)+parseInt(ou)+parseInt(ho)+parseInt(es);

    var num1=(ed/total).toFixed(2);
    var num2=(el/total).toFixed(2);
    var num3=(ou/total).toFixed(2);
    var num4=(ho/total).toFixed(2);
    var num5=(es/total).toFixed(2);

    function init() {
        //绘制饼图
        //比例数据和颜色
        var data_arr = [num1, num2, num3, num4,num5];
        var color_arr = ["#00FF21", "#FFAA00", "#00AABB", "#FF4400","#B94FFF"];
        var text_arr = ["教育培训", "电子商务", "对外贸易", "酒店旅游","房地产"];

        drawCircle("canvas_circle", data_arr, color_arr, text_arr);
    }

    //页面加载时执行init()函数
    window.onload = init;
</script>
</html>
