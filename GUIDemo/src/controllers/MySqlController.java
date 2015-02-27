package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlController {
	private Connection conn;
	public  MySqlController(String server, String bbdd, String user, String password){
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        	System.out.println("Error!!!");
        }
		
		try {
		     conn = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd+"?" +
		                                   "user="+user+"&password="+password);

		    // Do something with the Connection

		  
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public ResultSet query(String query) {
		
		Statement st;
		ResultSet rs=null;
		try {
			st = conn.createStatement();
			try {
				rs = st.executeQuery(query);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQLException: " + e.getMessage());
			    System.out.println("SQLState: " + e.getSQLState());
			    System.out.println("VendorError: " + e.getErrorCode());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("SQLException: " + e.getMessage());
		    System.out.println("SQLState: " + e.getSQLState());
		    System.out.println("VendorError: " + e.getErrorCode());
		}

		return rs;

		
	}
}
