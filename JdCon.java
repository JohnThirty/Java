import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdCon {
	public static void main(String[] args) throws SQLException {
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?serverTimezone=UTC","root","");
		
		Statement stm	=con.createStatement();
		
		String s = "select * from employees";
		
		ResultSet rs = stm.executeQuery(s);	
		
		while(rs.next()) {
            int eid =rs.getInt("employee_id");
            String fname = rs.getString("employee_name");
            String fdp = rs.getString("department");
            int esa = rs.getInt("salary");
            System.out.println(eid + "," + fname + "," + fdp + "," + esa);
		}
		
	}}		

	


