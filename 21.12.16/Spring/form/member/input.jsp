<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<form action = "/ex/member/join">
	이름<input type = "text" name = "name"><br> <!-- name는 java 생성자와 맞춰줄것 -->
	아이디<input type = "text" name = "id"><br>
	비밀번호<input type = "password" name = "pw"><br>
		
	<input type = "submit">
	</form>
</h1>

</body>
</html>
