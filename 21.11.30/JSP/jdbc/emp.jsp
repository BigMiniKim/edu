<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String upw = "tiger";

	Connection connect;//jdbc 핵심객체 3가지
	Statement statement;
	ResultSet rs;
	
	String query = "select * from emp";
	%>
	<%
	try {
		Class.forName(driver);
		connect = DriverManager.getConnection(url, uid, upw);
		statement = connect.createStatement();
		rs = statement.executeQuery(query);
		
		while(rs.next()) {
		String ename = rs.getString("ename");
		String job = rs.getString("job");
		int empno = rs.getInt("empno");
		
		out.print("이름: " + ename + " 사원번호: " + empno + " 직종: " + job + "<br>");
		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		
		try{
			if(rs !=null) rs.close();
			if(statement !=null) statement.close();
			if(connect!=null) connect.close();
		}catch(Exception e){
			
			
		}

	}
	%>
</body>
</html>
