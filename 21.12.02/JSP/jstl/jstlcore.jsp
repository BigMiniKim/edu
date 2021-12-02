<%@page import="edu.kosmo.ex.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var = "name" value = "홍길동"/>   <!-- 변수명key=name 값value="홍길동" -->
name: ${name} 
<c:out value ="${name}"/><!-- 변수명을 EL로 -->
<br>

<c:remove var="name"/>
두번째 name: ${name} <c:out value ="${name}"/>
<hr/>

<c:set var="name2">톰캣</c:set>
name2: ${name2} 
<c:out value="${name2}"/>
<hr/>

<%
	Member member = new Member("abcd","1234");
	pageContext.setAttribute("member", member);
%>

${member.id }
${member.pw }
<c:set target="${member }" property="id" value="박지성"/>
${member.id }

<hr/>
<%-- <c:if 태그--%>
<c:if test="${ 10 > 20 }" var = "result">
10은 20보다 크다<br>
</c:if>
result : ${result }<br>
<hr/>
<c:if test="${ 10 < 20 }" var = "result">
10은 20보다 크다<br>
</c:if>
result : ${result }<br>

<hr/>
${ 10 < 20 }
<c:if test="true" var = "result">
10은 20보다 크다<br>
</c:if>
result : ${result }<br>
<hr/>
<hr/>
<c:set var = "userid" value="hello"/>

<c:choose>
	<c:when test = "${userid=='admin' }">
		관리자 페이지
	</c:when>
	<c:otherwise>
		${userid}님 반갑습니다.
	</c:otherwise>
</c:choose>
<hr/>
<c:choose>
	<c:when test = "${userid=='hello' }">
		관리자 페이지
	</c:when>
	<c:otherwise>
		${userid}님 반갑습니다.
	</c:otherwise>
</c:choose>

<hr/>
<hr/>

<c:forEach var="i" begin="0" end ="30" step="1">
값은: ${i} <br>
</c:forEach>

<hr/>
<c:forEach var="i" begin="1" end ="9" >
	<c:forEach var="j" begin="2" end ="9" >
	${i} * ${j} = ${i*j} <br> 
	</c:forEach>
</c:forEach>

<hr/>
<% pageContext.setAttribute("numList", 
		new String[]{"1", "2", "3", "4", "5"}); %>

    <c:forEach var="num" items="${numList}">
       ${num}
    </c:forEach>

</body>
</html>
