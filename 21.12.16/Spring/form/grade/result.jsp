<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	국어 : ${grade.kor}<br> 
	영어 : ${grade.eng}<br> 
	수학 : ${grade.math}<br>
	
	합계 : ${grade.total()}<br>
	평균 : ${grade.avg()}<br>
	등급: ${grade.getGrade() }
</h1>

</body>
</html>
