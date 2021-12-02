package edu.kosmo.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import edu.kosmo.ex.dto.EmpDto;

public class EmpDao { // db에 접속해서 data를 가져오겠다. 접속하기위한 코드들.
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";

	public EmpDao() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public ArrayList<EmpDto> empSelect() { //암기. query 정보 를 갖고 와서 ArrayLIst에 담아줌
		ArrayList<EmpDto> dtos = new ArrayList<EmpDto>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from emp";
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
								
				EmpDto dto = new EmpDto(empno,ename,job);
				dtos.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null) rs.close(); //위 try 객체생성과 반대로 close
				if(stmt !=null) stmt.close();
				if(con !=null) con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return dtos;
	}
	
}
