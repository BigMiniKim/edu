<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--MemeberInfo member =new edu.kosmo.ex.MemberInfo()-->
	<jsp:useBean id="empDao" class="edu.kosmo.ex.dao.EmpDao"/>
	<% ArrayList<EmpDto> dtos = empDao.empSelect(); 
		%>
	 ${ empDto.ename }<br/>
	
</body>
</html>
