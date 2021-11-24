<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie cookie = new Cookie("CookieN","CookieV"); //쿠키객체생성 (key,value) (cookieN,cookieV)를 client에 심어놓음
	cookie.setMaxAge(60*60); //쿠키 시간 (1시간) 설정
	
	response.addCookie(cookie); //client 안에 심어놓음
%>

	<a href="cookie_get.jsp">cookie get</a> 

</body>
</html>
