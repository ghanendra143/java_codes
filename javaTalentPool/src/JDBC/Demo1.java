package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step-1. register driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		// step-2. set connection
			Connection con = DriverManager.getConnection("jdbc:sqlserver://IMCVBCP153-MSL2\\SQLEXPRESS2019;databaseName=javatalent;user=sa;password=Password_123");
			System.out.println("connected");
		
		// step-3. create statement 
			Statement stmt = con.createStatement();
			
		// step-4. execute query
			// A. inserting data into database
//			int row = stmt.executeUpdate("insert into students values('kamla','mumbai',58)");
//			System.out.println("data inserted and "+row+" row afftected");
			
			// B. update the data
//			int row = stmt.executeUpdate("update students set stud_name='ramu',stud_add='goa',stud_marks=76 where stud_id=2");
//			System.out.println(row+" row updated");
			
			// C. delete the data
//			int row = stmt.executeUpdate("delete from students where stud_id=5");
//			System.out.println(row+" row deleted");
			
			// D. fetch single data by id
//			ResultSet rs = stmt.executeQuery("select * from students where stud_id = 2");
//			while(rs.next())
//			{
//				System.out.println("stud_id : " + rs.getInt("stud_id") + 
//								   " stud_name : " + rs.getString(2) +
//								   " stud_add : " + rs.getString(3) +
//								   " stud_marks : " + rs.getInt(4));
//			}
			
			// E. fetch all records from database
			ResultSet rs = stmt.executeQuery("select * from students");
			while(rs.next())
			{
				System.out.println("stud_id : " + rs.getInt("stud_id") + 
								   " stud_name : " + rs.getString(2) +
								   " stud_add : " + rs.getString(3) +
								   " stud_marks : " + rs.getInt(4));
			}
			
		// step-5. close the connection
			con.close();
	}
}
