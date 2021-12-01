<%@page import="java.util.ArrayList"%>
<%@page import="edu.kosmo.ex.LottoGame"%>
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
	String lottoNum = request.getParameter("lottoNum");
	int lottoBall = Integer.valueOf(lottoNum);
	%>

<% int[] lottoBalls= new int[6];
	out.println(ArrayList.toString(lottoBalls));
			%> 
</body>
</html>
