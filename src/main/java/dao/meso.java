package dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.Snack;
import dto.delesna;

public class meso {
	private static Connection getConnection() throws URISyntaxException, SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    URI dbUri = new URI(System.getenv("DATABASE_URL"));

	    String username = dbUri.getUserInfo().split(":")[0];
	    String password = dbUri.getUserInfo().split(":")[1];
	    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

	    return DriverManager.getConnection(dbUrl, username, password);
	    }

	
	public static int deletesna(delesna syo) {
		String sql = "delete from snack where id = ?";
		int result = 0;
		
		try(
				Connection com = getConnection();
				PreparedStatement pstmt = com.prepareStatement(sql);
				){
			pstmt.setLong(1, syo.getId());
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(URISyntaxException e) {
			e.printStackTrace();
		}finally {
			System.out.println(result+ "件削除しました");
		}
		return result;
	}

	public static int regiesna(Snack gi) { 
		String sql = "INSERT INTO hin values(defalt,?, ?, ?, current_timestamp)";
		int result = 0 ;
		
		try(
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setString(1, gi.getName());
			pstmt.setString(2, gi.getSyousai());
			pstmt.setString(3, gi.getNedan());
			
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(URISyntaxException e) {
			e.printStackTrace();
		}finally {
			System.out.println(result+"件更新しました");
		}
		return result;
	}
}
