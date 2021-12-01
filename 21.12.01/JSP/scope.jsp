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
 String id = request.getParameter("id");

 int count = 200; //디비로 갖고 오든지 
 session.setAttribute("id", "홍길동");
 session.setAttribute("count", count++);%>
 
방문자수 <%=count %>
	
	<%= session.getAttribute("count")%>
	<%=count %>

<%
 application.setAttribute("application_name", appl
 session.setAttribute(arg0, arg1)
pageContext.setAttribute(arg0, arg1)
request.setAttribute(arg0, arg1))
%>
	<!--int a= reuqest.getContentLength();-->
</body>
</html>
