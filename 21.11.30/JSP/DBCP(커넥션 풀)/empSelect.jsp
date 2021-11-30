<%@page import="edu.kosmo.ex.dto.EmpDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.kosmo.ex.dao.EmpDao"%>
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
	EmpDao empDao = new EmpDao(); //데이터 접속할 수 있는 함수 가져옴, 실무에서는 jsp안에 new 가 보여서는 안됨.
	
	ArrayList<EmpDto> dtos = empDao.empSelect(); //empSlect 함수 호출
	
	for(int i = 0 ; i < dtos.size(); i ++ ) { //1. (for문)i로 돌리기 2. foreach활용 3.literate? 배열 구현 방법 3가지 복습
		EmpDto dto = dtos.get(i);
	
		out.println("이름: " + dto.getEname() + " 사원번호: " + dto.getEmpno() + "직종: " + dto.getJob() + "<br>"); // 표현
		
	}
	
	%>
</body>
</html>
