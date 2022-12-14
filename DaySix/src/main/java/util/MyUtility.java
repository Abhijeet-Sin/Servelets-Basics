package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyUtility {
	private static Connection con=null;
	public static Connection cono() {
		String url="jdbc:mysql://localhost:3306/bankofwonders";
		String user="root";
		String pass="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		if(con==null)
		{
			
				con=DriverManager.getConnection(url,user,pass);	
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

}
