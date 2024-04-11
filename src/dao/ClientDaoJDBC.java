package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Client;
import server.Server;

public class ClientDaoJDBC implements ClientDao {
	
	public void insert(Client obj) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn.setAutoCommit(false);
			conn = Server.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM ");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			Server.closeResultSet(rs);
			Server.closeStatement(st);
			Server.closeConnection();;
		}
	}
}
