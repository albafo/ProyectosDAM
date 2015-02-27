package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioController {
	
	public static int checkRegistro(String email, String password) {
		MySqlController mysql=new MySqlController("localhost", "mycoach", "root", "");
		ResultSet rs=mysql.query("SELECT id_usuario FROM usuarios WHERE correo='"+email+"' and contrasenya='"+password+"' LIMIT 0, 1");
		int id=-1;
		try {
			if (rs.next()) {
				id= (int) rs.getObject("id_usuario");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return id;
	}

}
