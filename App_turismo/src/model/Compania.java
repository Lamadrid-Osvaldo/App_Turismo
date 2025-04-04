package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Compania {

	public int idCompania;
	public String nombre;
	public String direccion;
	public String telefono;
	public String fechacreacion;
	public String correo;
	public String web;
	Conexion conector = new Conexion();
	
	
	public Compania(String nombre, String direccion, String telefono, String fechacreacion, String correo, String web
			) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.correo = correo;
		this.web = web;
		
	}

	public Compania() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	


	public void create(String nombre, String correo, String telefono, String direccion, String web, String fechacreacion) {
			
			
			Connection dbConnection = null;
			PreparedStatement pst = null; 
			
			String script = "insert into tblcompania(nombre, correo, telefono, direccion, web, fechacreacion) values (?,?,?,?,?,?)";
			
			try {
				dbConnection = conector.conectarDB();
				pst = dbConnection.prepareStatement(script);
				
				pst.setString(1, nombre);
				pst.setString(2, correo);
				pst.setString(3, telefono);
				pst.setString(4, direccion);
				pst.setString(5, web);
				pst.setString(6, fechacreacion);
				
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "registro con exito");
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	public void delete(int idCompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblcompania WHERE idcompania = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idCompania);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idCompania+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idCompania+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readOne(int idCompania, JTextField Nombre, JTextField Correo, 
			JTextField Telefono, JTextField Direccion, JTextField Web, JTextField fechaCreacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblcompania WHERE idcompania = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idCompania);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			while (rs.next()) {
				Nombre.setText(rs.getString(2));
				Correo.setText(rs.getString(3));
				Telefono.setText(rs.getString(4));
				Direccion.setText(rs.getString(5));
				Web.setText(rs.getString(6));
				fechaCreacion.setText(rs.getString(7));
			}
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void update(int idCompania, String nombre ,String correo, String telefono, String direccion, String web, String fechacreacion) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "update tblcompania set nombre = ?, correo = ?, telefono = ?, direccion = ?, web = ?, fechacreacion = ?  where idcompania = ?;";

		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setString(1, nombre);
			pst.setString(2, correo);
			pst.setString(3, telefono);
			pst.setString(4, direccion);
			pst.setString(5, web);
			pst.setString(6, fechacreacion);
			pst.setInt(7, idCompania);
			
			
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
