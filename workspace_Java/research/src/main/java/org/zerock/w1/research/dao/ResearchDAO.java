package org.zerock.w1.research.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.research.dto.ResearchDTO;

public class ResearchDAO {
	// 데이터베이스 연결
	public Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user = "scott2_21";
		String password = "tiger";

		try {
			Class.forName(driver);
			// DB 접속
			Connection con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 설문조사 목록 가져오기
	public List<ResearchDTO> getResearches() {
		List<ResearchDTO> researches = new ArrayList<>();
		String sql = "select * from research";

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String question = rs.getString("question");
				String optionText = rs.getString("option_text");
				researches.add(new ResearchDTO(1, question, optionText));
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return researches;
	}
}