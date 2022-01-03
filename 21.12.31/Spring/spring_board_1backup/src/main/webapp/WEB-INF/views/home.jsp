<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<img src = "http://localhost:8282/ex/resources/a.png" width="100">
<img src="a.png" width="100">

<!-- / = 절대경로 ${pageContext.request.contextPath} = /ex-->
<img src="/ex/resources/a.png" width = "100">
<img src ="${pageContext.request.contextPath}/resources/img/a.png" width = "150" border ="20" >
<!-- /없음 = 상대경로 http://localhost:8282/ex/ -->
<img src="ex/resources/a.png" width = "100">

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
