<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies(); // request요청할때 cookie도 함께
	
	for(int i=0; i<cookies.length;i++){
		String str = cookies[i].getName();
		System.out.println(cookies[i].getName() + ":" + cookies[i].getValue());
		
		if(str.equals("CookieN")) {
			out.println("cookies[" + i + "] name : " + cookies[i].getName() + "<br />");
			out.println("cookies[" + i + "] value : " + cookies[i].getValue() + "<br />");
			out.println("=====================<br />");
			
			cookies[i].setMaxAge(0); //쿠키 내가 입력한거 삭제
			response.addCookie(cookies[i]); // 삭제 값 입력, 실제는 웹브라우저에서 조절
			
		}
		
	}

%>

	<a href="cookie_get.jsp">cookie get</a>

</body>
</html>
