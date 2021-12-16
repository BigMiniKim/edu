<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	이름 : ${member.name}<br>  <!-- 커맨드 객체가 넘겨줌 mamber.getName()과 같음 -->
	아이디 : ${member.id}<br> <!-- mamber.getId() -->
	패스워드 : ${member.pw}<br>
	
</h1>

</body>
</html>
