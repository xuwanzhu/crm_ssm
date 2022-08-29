<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/crm_ssm/js/jquery-2.1.0.js"></script>
<script type="text/javascript">
	function login(){
		 var username = $("#txtName").val();
	     var password = $("#txtPwd").val();
	     
	     if (username == "") {
	    	 alert("用户名不能为空！");
	         return false;
	     }
	     if(password == "") {
	    	alert("密码不能为空！");
	        return false;
	     }
	     if(username != "" && password != ""){
	   		/*  第一个位置：url路径（这里我们需要往后台传值）
	   			第二个位置：以键值对的形式(相当于数组)，发送给传输路径的值（这里是给后台的值）
	   			第三个位置：获取后台的值
	   			第四个位置：html*/
	   		
	   		$.post("/crm_ssm/user/login.do",{
	   			"userCode":$("#txtName").val(),
	   			"password":$("#txtPwd").val()
    		},function(date){
    			//alert(date);
    			if(date == 1) {
					alert("用户登录成功");
					window.location.href="/crm_ssm/jsp/index.jsp";
				} else {
					alert("账号或密码错误");
					window.location.href="/crm_ssm/jsp/login.jsp";
				}
    		});
	     }
	}
	
	
	function register(){
		window.location.href="/crm_ssm/jsp/register.jsp";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<STYLE type=text/css>
BODY {
	FONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体
}
TD {
	FONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体
}
<META content="MSHTML 6.00.6000.16809" name=GENERATOR></HEAD>
</STYLE>
</head>
<body>
<FORM id=form1 name=form1 action="${pageContext.request.contextPath }/user/login.do" method=post>

<DIV id=UpdatePanel1>
<DIV id=div1 
style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>
<DIV id=div2 
style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>


<DIV>&nbsp;&nbsp; </DIV>
<DIV>
<TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>
  <TBODY>
  <TR>
    <TD style="HEIGHT: 105px"><IMG src="${pageContext.request.contextPath }/images/login_1.gif" 
  border=0></TD></TR>
  <TR>
    <TD background="${pageContext.request.contextPath }/images/login_2.jpg" height=300>
      <TABLE height=300 cellPadding=0 width=900 border=0>
        <TBODY>
        <TR>
          <TD colSpan=2 height=35></TD></TR>
        <TR>
          <TD width=360></TD>
          <TD>
            <TABLE cellSpacing=0 cellPadding=2 border=0>
              <TBODY>
              <TR>
                <TD style="HEIGHT: 28px" width=80>登 录 名：</TD>
                <TD style="HEIGHT: 28px" width=150><INPUT id=txtName 
                  style="WIDTH: 130px" name="userCode"></TD>
                <TD style="HEIGHT: 28px" width=370><SPAN 
                  id=RequiredFieldValidator3 
                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入登录名</SPAN>
                  <p style="color: red;" id="show1"></p>
                </TD>
              </TR>
                  
              <TR>
                <TD style="HEIGHT: 28px">登录密码：</TD>
                <TD style="HEIGHT: 28px"><INPUT id=txtPwd style="WIDTH: 130px" 
                  type=password name="password"></TD>
                <TD style="HEIGHT: 28px"><SPAN id=RequiredFieldValidator4 
                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入密码</SPAN>
                  <p style="color: red;" id="show2"></p>
                  </TD></TR>
              <!-- <TR>
                <TD style="HEIGHT: 28px">验证码：</TD>
                <TD style="HEIGHT: 28px"><INPUT id=txtcode 
                  style="WIDTH: 130px" name=txtcode></TD>
                <TD style="HEIGHT: 28px">&nbsp;</TD></TR> -->
              <TR>
                <TD style="HEIGHT: 18px"></TD>
                <TD style="HEIGHT: 18px"></TD>
                <TD style="HEIGHT: 18px"></TD></TR>
              <TR>
                <TD></TD>
                <TD>
                <INPUT id=btn 
                  style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
                  onclick="login()"
                  type="submit" src="${pageContext.request.contextPath }/images/login_button.gif" name=btn> 
              </TD>
              
              <TD>
                <INPUT id=btn2 
                  style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
                  onclick="register()"
                  type="button" name=btn value="注册"> 
              </TD>
              
             
              
              </TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR>
  <TR>
    <TD><IMG src="${pageContext.request.contextPath }/images/login_3.jpg" 
border=0></TD></TR></TBODY></TABLE></DIV></DIV>
</FORM>
</body>


</html>