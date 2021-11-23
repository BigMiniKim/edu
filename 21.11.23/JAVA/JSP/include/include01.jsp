<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>include01.jsp 페이지 입니다.</h1>
	<jsp:include page="include02.jsp" flush="true"/>
	<%--flush true 포함할 페이지의 내용을 삽입하기 이전에 현재 페이지가 지금까지 버퍼에 저장한 내용을 출력하게 만드려면--%>
	<%--flush false 헤더 정보가 웹 브라우저에 전송이 되고 나면 헤더 정보를 추가해도 결과가 반영되지 않는다--%>
	<h1> 다시 include01.jsp 페이지 입니다.</h1>
	

</body>
</html>
