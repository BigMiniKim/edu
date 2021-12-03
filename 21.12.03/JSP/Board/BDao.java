package edu.kosmo.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.kosmo.ex.dto.BDto;

public class BDao {
	private DataSource dataSource; // 암기. 자바소스 코드상에서 커넥션 풀이라는 객체. Servers>tomcat> context.xml에서 함.

	public BDao() {
		try {
			Context context = new InitialContext(); // 서버의context, context.xml 설정을 읽어옴
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");// connection 객체에서 name=jdbc.oracle 를
																					// 설정에서 끌고옴

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<BDto>(); // 게시판의 글들을 하나하나 arraylist에 담음

		Connection connection = null;
		PreparedStatement preparedStatement = null; // statement보다 보안등 더 좋음
		ResultSet rs = null;

		try {
			String query = "select * from mvc_board order by bgroup desc, bstep asc";
			connection = dataSource.getConnection(); // dataSource가 알아서, drivemanager쓸 필요 없음
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("broup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				BDto dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
				dtos.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return dtos;

	}

}
