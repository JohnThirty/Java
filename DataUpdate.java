	import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
public class DataUpdate {
	
		public static void main(String[] args) throws SQLException {
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?serverTimezone=UTC","root","");
			
			Statement stm	= con.createStatement();
			
			String s = "update employees set salary = 60000 where employee_id = 10";

			stm.execute(s);
			
			con.close();
			
		}}		


