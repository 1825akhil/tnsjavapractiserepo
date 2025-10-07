package jdbcprograms.services;

import java.sql.*;
import javax.sql.*;
import jdbcprograms.dao.DButil;

public class CurdOperations {
	static Connection con;
	static PreparedStatement pst;
	static {
		con=DButil.getConnection();
		if(con!=null) {
			System.out.println("Coonection is Sucess");
		}
	}
		//insert values into the table
		public static int addStudent(int sid, String sname) {
			int n=0;
			try {
				pst = con.prepareStatement("INSERT INTO students VALUES(?,?)");
				pst.setInt(1, sid);
				pst.setString(2, sname);
				pst.executeUpdate();
			}catch(Exception e) {
				
			}
			return n;
		}
		
		//update the values
		public static int updateStudent(int sid, String sname) {
			int n=0;
			try {
				pst = con.prepareStatement("UPDATE students SET sname = ? WHERE sid = ?");
				pst.setInt(2, sid);
				pst.setString(1, sname);
				pst.executeUpdate();
			}catch(Exception e) {
				
			}
			return n;
		}
		
		//Delete the values
				public static int deleteStudent(int sid) {
					int n=0;
					try {
						pst = con.prepareStatement("DELETE FROM students WHERE sid = ?");
						pst.setInt(1, sid);
						
						pst.executeUpdate();
					}catch(Exception e) {
						
					}
					return n;
				}
				
				//Select the values
				public static int selectStudent(int sid) {
					int n=0;
					try {
						pst = con.prepareStatement("SELECT sid, sname FROM students WHERE sid = ?");
						pst.setInt(1, sid);
						
						pst.executeUpdate();
					}catch(Exception e) {
						
					}
					return n;
				}
	}

