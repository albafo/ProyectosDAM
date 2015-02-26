import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelos.*;






public class MysqlPrueba {
	private static Connection conn = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        	System.out.println("Error!!!");
        }
		
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/empleados?" +
		                                   "user=root&password=tonphp");

		    // Do something with the Connection

		  
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs;
			try {
				rs = st.executeQuery("SELECT * FROM empleado");
				ArrayList<Empleado> empleados = new ArrayList<Empleado>();
				while (rs.next())
				{
					
				   System.out.println("nombre="+rs.getObject("nombre")+
				      ", edad="+rs.getObject("edad")+
				      ", alojamiento="+rs.getObject("alojamiento"));
				   
				   Empleado empleado = new Empleado((String)rs.getObject("nombre"), (int)rs.getObject("edad"), (String)rs.getObject("alojamiento"));
				   empleados.add(empleado);
				}
				empleados.get(0).setEdad(24);
				for(int i=0; i<empleados.size(); i++) {
					
					String query="UPDATE empleado set nombre='"+empleados.get(i).getNombre()+"', edad='"+empleados.get(i).getEdad()+"', alojamiento='"+empleados.get(i).getAlojamiento()+"' where nombre='"+empleados.get(i).getNombre()+"'";
					
					st.executeUpdate(query);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} 
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		

	}

}
