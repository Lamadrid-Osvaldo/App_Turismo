package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Medio {

	
	public String nombre;
	public String observaciones;
	public int idtipomedio;
	Conexion conector = new Conexion();
	
	
	
	public Medio(String nombre, String observaciones, int idtipomedio) {
		super();
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.idtipomedio = idtipomedio;
	}

	public Medio() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdtipomedio() {
		return idtipomedio;
	}

	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}

	public void create(String nombre, String observaciones ,int idtipomedio) {
			
			
			Connection dbConnection = null;
			PreparedStatement pst = null; 
			
			String script = "insert into tblmedios(nombre, observaciones, idtipomedios) values (?,?,?)";
			
			try {
				dbConnection = conector.conectarDB();
				pst = dbConnection.prepareStatement(script);
				
				pst.setString(1, nombre);
				pst.setString(2, observaciones);
				pst.setInt(3, idtipomedio);
				
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "registro con exito");
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
}
