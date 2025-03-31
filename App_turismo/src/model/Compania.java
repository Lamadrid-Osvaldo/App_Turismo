package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Compania {

	
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
	
}
