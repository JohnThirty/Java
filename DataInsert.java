import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsert {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?serverTimezone=UTC","root","");

		Statement stm	= con.createStatement();

		String s = "INSERT INTO employees VALUES(3,'Jon Doen','sales','90000')";

		stm.execute(s);

		con.close();
		
	}
	

}
