<%@page import="edu.kosmo.ex.dto.EmpDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.kosmo.ex.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empSelect2입니다</title>
</head>
<body>
	<%
	
	
	ArrayList<EmpDto> dtos = (ArrayList<EmpDto>)session.getAttribute("emplist");
	//콜렉션프레임
	for(EmpDto emp:dtos){
	//배열
		out.println("이름: " + emp.getEname() +
				" 사원번호: " + emp.getEmpno() + 
				"직종: " + emp.getJob() + "<br>"); // 표현
	
		
	}
	
	%>
</body>
</html>
