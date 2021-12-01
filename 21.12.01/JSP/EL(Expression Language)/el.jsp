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
	<jsp:useBean id="member" class="edu.kosmo.ex.MemberInfo"/>
<!--member.setName("홍길동");-->
	<jsp:setProperty name="member" property="name" value="홍길동"/>
	<jsp:setProperty name="member" property="id" value="abc"/>
	<jsp:setProperty name="member" property="pw" value="1234"/>
 이름2: <%= member.getName()%>	 <br/>
 
 이름3: ${ member.name }<br/>
  이름3: ${ member.id }<br/>
   이름3: ${ member.pwz }<br/>
 이름: <jsp:getProperty name = "member" property="name"/> <br/>
 아이디: <jsp:getProperty name = "member" property="id"/> <br/>
 비밀번호: <jsp:getProperty name = "member" property="pw"/> <br/>
	<% System.out.print(1+2); %>
	${10 }<br>
	${99.99 }<br>
	${"ABC" }<br>
	${true }<br>
	${1+2 }<br>
	${1*2 }<br>
	${1>2 }<br>
	${1-2 }<br>
	
	
	
</body>
</html>
