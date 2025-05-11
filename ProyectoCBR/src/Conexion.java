public class Conexion {
	
	static final String DB_URL = "jdbc:postgresql://localhost:3306/dbcultura2";
	static final String USER = "rafa06";
	static final String PASS = "123456";
	
	public Connection getConexionPg() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;
	}

}
