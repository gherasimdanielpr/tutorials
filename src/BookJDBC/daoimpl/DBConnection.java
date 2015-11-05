package BookJDBC.daoimpl;

import java.sql.*;

public class DBConnection {
	private static DBConnection instance;
	Statement stmt = null;
	ResultSet rs = null;
	private Connection conn = null;

	private DBConnection() {
		conn = null;
	}

	public static synchronized DBConnection getInstance() {
		if (instance == null) // Lazy instantiation
		{
			instance = new DBConnection();
			instance.connect();
		}
		return instance;
	}
	
	public static void main(String ...args) {
		DBConnection instance2 = DBConnection.getInstance();
		instance2.connect();
	}

	// Connects to the DB
	public void connect() {

		String url = "jdbc:mysql://localhost:3306/test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";

		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Executes a query on the DB
	public ResultSet executeQuery(String sqlComanda) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sqlComanda);
		return rs;
	}

	// Executes an update of the DB
	public void execute(String sqlComanda) throws SQLException {
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sqlComanda);
	}

	// Executes a prepared query on the DB - not used here
	public PreparedStatement prepareStatement(String sqlComanda)
			throws SQLException {
		PreparedStatement prest = conn.prepareStatement(sqlComanda);
		return prest;
	}

	
}
