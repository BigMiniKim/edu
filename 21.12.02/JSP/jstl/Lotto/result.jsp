<%@page import="edu.kosmo.ex.LottoGame"%>
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
<%Lotto lotto = new Lotto();
	 pageContext.setAttribute("lotto", lotto);
	 %>
	 <c:forEach var="num" items = "${lotto.lottoSet}">
	 번호: ${num}></br>
	 </c:forEach>
  </body>
</html>
