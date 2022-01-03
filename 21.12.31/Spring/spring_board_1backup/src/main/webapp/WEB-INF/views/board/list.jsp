<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<table width="500" border="1">
			<tr>
				<td>번호:</td>
				<td>이름:</td>
				<td>제목:</td>
				<td>날짜:</td>
				<td>히트:</td>
			
			</tr>
			
			
			<!-- 여기 또 핵심 3 -->
			<c:forEach var="board" items="${boardList}">
			<tr>
			
				<td>${board.bid}</td>
				<td>${board.bname}</td>
				<td>
					<c:forEach begin="1" end="${board.bindent}"> [Re] </c:forEach>
 						<a href="content_view?bid=${board.bid}">${board.btitle}</a>
				</td>
				
				
				<td>${board.bdate}</td>
				<td>${board.bhit}</td>
				
			</tr>	
			</c:forEach>
			
			<tr>
				<td colspan="5"> 
					<a href="write_view">글작성</a>
				</td>
			</tr>
		
		</table>

</body>
</html>
