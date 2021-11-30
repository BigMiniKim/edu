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

	Connection connect;
	Statement statement;
	ResultSet rs;
	
	String query = "select * from dept" ;
	%>
	<%
	try {
		Class.forName(driver);
		connect = DriverManager.getConnection(url, uid, upw);
		statement = connect.createStatement();
		rs = statement.executeQuery(query);
		
		while(rs.next()) {
		int deptno = rs.getInt("deptno");
		String dname = rs.getString("dname");
		String loc = rs.getString("loc");
		
		
		out.print("부서 번호: " + deptno + " 부서 이름: " + dname + " 위치: " + loc + "<br>");
		
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
