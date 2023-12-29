import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataDelete {
	public static void main(String[] args) throws SQLException {
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?serverTimezone=UTC","root","");
		
		Statement stm	= con.createStatement();
		
		String s = "delete from employees where employee_id = 5";

		stm.execute(s);
		
		con.close();
		
	}}		

	


