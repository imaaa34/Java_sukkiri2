package chapter12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc {
	public void jdbc() {
		try {
			Class.forName("org.h2.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME =?");
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ゾンビ");
			int r = pstmt.executeUpdate();
			if(r != 0) {
				System.out.println(r + "件のモンスターを削除しました。");
			} else {
				System.out.println("該当するモンスターはいませんでした。");
			}
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
