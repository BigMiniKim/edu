<%@page import="org.apache.coyote.http11.filters.VoidInputFilter"%>
<%@page import ="edu.kosmo.ex.RPSGame"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
String rps = request.getParameter("RPS");
RPSGame rpsgame = new RPSGame(rps);
%>
<%=rpsgame.result(player);
%>



</body>
</html>
