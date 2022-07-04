package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Admin;


public class DaoAdminImpl implements DaoAdmin{

	@Override
	public ArrayList findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(Object id) throws ClassNotFoundException, SQLException {
		Admin a = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from admin where id=" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			a = new Admin();
			a.setIdentifiant(rs.getInt("id"));
			a.setMotDePasse(rs.getString("pass"));
			a.setActif(rs.getString("actif").equals("actif") ? true: false);
		}
		conn.close();
		return a;
	}

	@Override
	public void create(Object obj) throws ClassNotFoundException, SQLException {
		
		
	}

	@Override
	public void update(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
