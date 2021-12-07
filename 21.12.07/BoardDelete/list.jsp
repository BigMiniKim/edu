<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<table width="500" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
		<c:forEach var="dto" items="${list}">
			<%-- blistcommand 에 있는 request.setAttribute에서 갖고옴 --%>
			<tr>
				<td>${dto.bid}</td>
				<td>${dto.bname}</td>
				<td><c:forEach begin="1" end="${dto.bindent}">[Re]</c:forEach> <%--댓글 ㄴ 가로 step처리--%>
					<a href="content_view.do?bid=${dto.bid}">${dto.btitle}</a></td>

				<td>${dto.bdate}</td>
				<td>${dto.bhit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">글작성</a></td>
		</tr>


	</table>


</body>
</html>