package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MobileDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step1. register driver (driver class for ms sql server)
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		// step2. set connection
//		Connection con = DriverManager.getConnection("jdbc:sqlserver://IMCVBCP153-MSL2\\SQLEXPRESS2019;databaseName=javatalent;user=sa;password=Password_123");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=javatalent;user=sa;password=Password_123;instanceName=SQLEXPRESS2019");

		System.out.println("connected \n");
		
		// step3. create statement
		Scanner sc = new Scanner(System.in);
		
		// use id for update only for inserting data please comment it
//		System.out.println("enter mob_id : ");
//		int id = sc.nextInt();
		
//		System.out.println("enter mobile name : ");
//		String name = sc.next();
//		System.out.println("enter mobile color : ");
//		String color = sc.next();
//		System.out.println("enter battery capacity : ");
//		int battery = sc.nextInt();
//		System.out.println("enter mobile price : ");
//		int price = sc.nextInt();
		
//		Mobile mb = new Mobile();
//		mb.setMob_id(id);
//		mb.setMob_name(name);
//		mb.setMob_color(color);
//		mb.setMob_battery(battery);
//		mb.setMob_price(price);
		
//		PreparedStatement pst = con.prepareStatement("insert into mobile values(?,?,?,?)");
//		PreparedStatement pst = con.prepareStatement("update mobile set mob_name=?,mob_color=?,mob_battery=?,mob_price=? where mob_id=?");
//		pst.setString(1, mb.getMob_name());
//		pst.setString(2, mb.getMob_color());
//		pst.setInt(3, mb.getMob_battery());
//		pst.setInt(4, mb.getMob_price());
//		pst.setInt(5, mb.getMob_id());
		
//		PreparedStatement pst = con.prepareStatement("delete from mobile where mob_id=?");
//		pst.setInt(1, mb.getMob_id());
		
		Statement stmt = con.createStatement();
		
		// step4. excute query
		
//		int row = pst.executeUpdate();
//		System.out.println("data inserted and "+row+" row affected");
		
//		int row = pst.executeUpdate();
//		System.out.println(row+" row deleted");
		
		// fetch all data
		ResultSet rs = stmt.executeQuery("select * from mobile");
		while(rs.next())
		{
			System.out.println("mob id : "+rs.getInt(1) + 
					"\nmob name : "+rs.getString(2) + 
					"\nmob color : "+rs.getString(3) +
					"\nmob battery : "+rs.getInt(4)+
					"\nmob price : "+rs.getInt(5));
			System.out.println("=========================");
		}
		
//		ResultSet rs = stmt.executeQuery("select * from mobile where mob_id="+mb.getMob_id());
//		while(rs.next())
//		{
//			System.out.println("mob id : "+rs.getInt(1) + 
//					"\nmob name : "+rs.getString(2) + 
//					"\nmob color : "+rs.getString(3) +
//					"\nmob battery : "+rs.getInt(4)+
//					"\nmob price : "+rs.getInt(5));
//			System.out.println("=========================");
//		}
		
		// step5. close the connection 
		stmt.close();
		
	}

}
