<%@page import="edu.kosmo.ex.dto.EmpDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.kosmo.ex.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empSelect3입니다</title>
</head>
<body>
	
	</br>
	<% 
	EmpDao empDao = new EmpDao(); 
	ArrayList<EmpDto> dtos = empDao.empSelect();
	pageContext.setAttribute("empList", 
			empDao.empSelect()); %>


    <c:forEach var="emp" items= "${empList}">
      이름: ${emp.ename} 번호: ${emp.empno }  직업: ${emp.job}  </br>
    </c:forEach>

</body>
</html>
