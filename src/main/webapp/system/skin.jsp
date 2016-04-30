﻿<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
session.setAttribute("skinName",request.getParameter("skinName"));
session.setAttribute("themeColor",request.getParameter("themeColor"));
%>
<% String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<script>
top.window.location="<%=path%>/sys/main.jsp";
</script>
</head>
<body>

</body>
</html>

