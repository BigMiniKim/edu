<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main.jsp 페이지 입니다.</h1>
	<%--<jsp:forward page="sub.jsp"></jsp:forward> 주소느 --%>
<%
response.sendRedirect("sub.jsp");
%>
</body>
</html>
