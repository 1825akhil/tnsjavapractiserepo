package jdbcprograms;
import java.sql.*;
import javax.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		//create parameter strings for establishing connections
		String URL = "jdbc:mysql://localhost:3306/firstdb";
		String USER  = "root";
		String PASSWORD = "Akhil@6304";
		//step1: Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded Sucessfully");
		
		//step2: Establishing the connection
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connection Established Sucessfully");
		
		//step3: Creating of statements 
		Statement st = con.createStatement();
		
		//step4: Executing of statements/query
		st.executeUpdate("CREATE TABLE students(sid int, sname varchar(20))");
		System.out.println("Query executed Sucessfully: student table created");
		
		//step5: closing the statement & connection
		st.close();
		con.close();
	}

}
