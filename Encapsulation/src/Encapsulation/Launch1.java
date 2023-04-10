package Encapsulation;

import java.sql.*;
import java.sql.Connection;

public final class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver not found");
			
			String url="jdbc:mysql://localhost:3306/manoja";
			String username="root";
			String password="Nethra@1982";
			con  = DriverManager.getConnection(url,username,password);
			System.out.println("the implement class name is "+con.getClass().getName());
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
