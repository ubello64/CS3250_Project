
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
	static String IP_ADDRESS = "";
	static int PORT = 3306;
	static String DATABASE_NAME = "cs3250_project";
	
	public static final String URL = "jdbc:mysql://" + IP_ADDRESS + ":"+ PORT + "/" + DATABASE_NAME;
	public static final String USERNAME = "GalacticWafer";
	public static final String PASSWORD = "";
	
	public static void main(String[] args) {
		
		// auto close connection
		try {
			System.out.println(URL);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			if(conn != null) {
				System.out.println("Connected to the database!");
			}
			else {
				System.out.println("Failed to make connection!");
			}
		}
		catch(SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
