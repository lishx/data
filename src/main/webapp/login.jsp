<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath  }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>QUI网页界面集成框架JAVA示例版</title>
<link href="${path}/system/login/style.css" rel="stylesheet" type="text/css" id="skin"/>
<script type="text/javascript" src="${path}/libs/js/jquery.js"></script>
<script type="text/javascript" src="${path}/libs/js/login.js"></script>

<!--居中显示start-->
<script type="text/javascript" src="${path}/libs/js/method/center-plugin.js"></script>
<!--居中显示end-->
<style>
/*提示信息*/	
#cursorMessageDiv {
	position: absolute;
	z-index: 99999;
	border: solid 1px #cc9933;
	background: #ffffcc;
	padding: 2px;
	margin: 0px;
	display: none;
	line-height:150%;
}
/*提示信息*/
</style>
</head>
<body >
	<div class="login_main">
		<div class="login_top">
		</div>
		<div class="login_middle">
			<div class="login_middleleft"></div>
			<div class="login_middlecenter">
					<form id="loginForm" class="login_form" method="post">
					<div class="login_user"><input type="text" id="username"></div>
					<div class="login_pass"><input type="password" id="password"></div>
					<div class="clear"></div>
					<div class="login_button">
						<div class="login_button_left"><input type="button" onclick="login()"/></div>
						<div class="login_button_right"><input type="reset" value=""/></div>
						<div class="clear"></div>
					</div>
					</form>
					<div class="login_info" style="display:none;"></div>
					<div class="login_info2">&nbsp;&nbsp;测试用户名:guest 密码：123456</div>
			</div>
			<div class="login_middleright"></div>
			<div class="clear"></div>
		</div>
		<div class="login_bottom">
			<div class="login_copyright">版权所有：http://www.quickui.net</div>
		</div>
	</div>
<script type="text/javascript">

	$(function(){
		//居中
		 $('.login_main').center();
		 document.getElementById("username").focus();
		 $("#username").keydown(function(event){
		 	if(event.keyCode==13){
				login()
			}
		 })
		 $("#password").keydown(function(event){
		 	if(event.keyCode==13){
				login()
			}
		 })
		 
	})

	//登录
	function login() {
		var errorMsg = "";
		var loginName = document.getElementById("username");
		var password = document.getElementById("password");
		if(!loginName.value){
			errorMsg += "&nbsp;&nbsp;用户名不能为空!";
		}
		if(!password.value){
			errorMsg += "&nbsp;&nbsp;密码不能为空!";
		}

		if(errorMsg != ""){
			$(".login_info").html(errorMsg);
			$(".login_info").show();
		}
		else{
			$(".login_info").show();
			$(".login_info").html("&nbsp;&nbsp;正在登录中...");
			//登录处理
			$.post("${path}/login",
				  {"username":loginName.value,"userpsd":password.value},
				  function(result){
					  $(".login_info").html("&nbsp;&nbsp;登录成功，正在转到主页...");
					  window.location="${path}/index";  
					  if(result == null){
						  $(".login_info").html("&nbsp;&nbsp;登陆失败！");
						  return false;
					  }
					  if(result.status=="true"||result.status==true){
					  	  $(".login_info").html("&nbsp;&nbsp;登录成功，正在转到主页...");
						  window.location="${path}/index";  
					  }
					  else{
					  	 $(".login_info").html("&nbsp;&nbsp;"+result.message);
					  }
					  
				  },"json");
		}
	}
</script>
</body>
</html>


<!-- 	<a href="user/list">列表</a> -->
<!-- 	<br /> -->
<!-- 	<br /> -->
<!-- 	<br /> -->
<!-- 	<a href="user/add">添加 </a> -->
<!-- 	<br /> -->
<!-- 	<br /> -->
<!-- 	<br /> -->
<!-- 	<a href="user/index">添加 </a> -->
