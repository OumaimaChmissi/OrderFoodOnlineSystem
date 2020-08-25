package application;

import java.sql.*;
 
 
//import com.mysql.jdbc.Statement;

 
//import com.mysql.jdbc.Statement;
 

public class Connexion {
 
	public static Connection connecterDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Installing ...");
			String url="jdbc:mysql://localhost:3308/client";
			String user="root";
			String password="";
			
			Connection cnx=DriverManager.getConnection(url, user, password);
				System.out.println("Connecting to database... ");

  					return cnx;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}

	 



