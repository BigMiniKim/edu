<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Student = new Student();
	<jsp:useBean id = "student" class="edu.kosmo.ex.Student"> </jsp:useBean>
	student.setName(15);
	<jsp:setProperty name = "student" property="name" value="15"/>
	<jsp:setProperty name = "student" property="age" value="13"/>
	<jsp:setProperty name = "student" property="grade" value="6"/>
	<jsp:setProperty name = "student" property="num" value="7"/>
	student.getName();
	이름 : <jsp:getProperty name="student" property="name"></jsp:getProperty><br/>
	나이 : <jsp:getProperty name="student" property="age"></jsp:getProperty><br/>
	학년: <jsp:getProperty name="student" property="grade"></jsp:getProperty><br/>
	번호 : <jsp:getProperty name="student" property="num"></jsp:getProperty><br/>
</body>
</html>
