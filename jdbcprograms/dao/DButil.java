package jdbcprograms.dao;

import java.sql.*;
import javax.sql.*;

public class DButil {
	
	private static Connection con;
	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Akhil@6304";
	private static final String URL = "jdbc:mysql://localhost:3306/firstdb";
	
	public static Connection getConnection(){
		try {
			//step1
			Class.forName(Driver);
			System.out.println("Driver is loaded Sucessfully");
			
			//step2
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection Established Sucessfully");
			
			}catch(Exception e) {
				
			}
		return con;
		
	}
	
}
