
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
 EmpDao empDao = new EmpDao();

ArrayList<EmpDto> dtos = empDao.empSelect();

for(int i=0; i < dtos.size(); i++) {
	EmpDto dto = dtos.get(i);
	
	out.print("사원번호: " + dto.getEmpno() + " 이름: " + dto.getEname() + 
			" 직업 " + dto.getJob() +" 매니저 번호: " + dto.getMgr() +
			"고용날짜" + dto.getHiredate() +" 봉급: " + dto.getSal() +
			" 커미션: " + dto.getComm() +" 부서번호: " + dto.getDeptno() +"<br>");
}
%>
</body>
</html>
