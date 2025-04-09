package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Agencias {

	public String nombre;
	public String correo;
	public String telefono;
	public String direccion;
	public String web;
	public int idcompania;
	public int idagencia;
	Conexion conector = new Conexion();
	
	
	
	public Agencias(String nombre, String correo, String telefono, String direccion, String web, int idcompania) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.web = web;
		this.idcompania = idcompania;
		
	}


	public Agencias() {
		super();
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	
	
	
	public void create(String nombre, String correo, String telefono, String direccion, String web, int idcompania) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		
		String script = "insert into tblagencias(nombre, correo, telefono, direccion, web, idcompania) values (?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarDB();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, nombre);
			pst.setString(2, correo);
			pst.setString(3, telefono);
			pst.setString(4, direccion);
			pst.setString(5, web);
			pst.setInt(6, idcompania);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "registro con exito");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete(int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblagencias WHERE idagencia = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idagencia);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idagencia+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idagencia+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void readOne(int idagencia, JTextField nombre, JTextField correo, JTextField telefono, JTextField direccion,  
			JTextField web, JTextField idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblagencias WHERE idagencia = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idagencia);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			if (rs.next()) {
				
				do {
				nombre.setText(rs.getString(2));
				correo.setText(rs.getString(3));
				telefono.setText(rs.getString(4));
				direccion.setText(rs.getString(5));
				web.setText(rs.getString(6));
				idcompania.setText(rs.getString(7));
				}while(rs.next());
			}else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro en la base de datos.");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void update(int idagencia, String nombre, String correo, String telefono, String direccion, String web, int idcompania) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "update tblagencias set nombre = ?, correo = ?, telefono = ?, direccion = ?, web = ?, idcompania = ?  where idagencia = ?;";

		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setString(1, nombre);
			pst.setString(2, correo);
			pst.setString(3, telefono);
			pst.setString(4, direccion);
			pst.setString(5, web);
			pst.setInt(6, idcompania);
			pst.setInt(7, idagencia);
			
			
			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿desea actualizar esta fila?");

			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila actualizada");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
