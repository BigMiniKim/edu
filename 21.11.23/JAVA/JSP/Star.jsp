<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>별찍기</h1>
	<%
	for (int i = 1; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			out.print("*");
		}
		out.println("<br>");
	}
	%>

<%for (int i = 1; i < 5; i++){for (int j = 0; j < i; j++){%><%="*"%><%}%><%="</br>"%><%}%>
</body>
</html>
