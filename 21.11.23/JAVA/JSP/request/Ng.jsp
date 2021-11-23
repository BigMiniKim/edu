<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int age;
%>
<%
	String str = request.getParameter("age");
	age = Integer.valueOf(str);
%>
<%=age %>살 <br>
미성년 입니다. 주류 구매가 불가능합니다.


</body>
</html>
