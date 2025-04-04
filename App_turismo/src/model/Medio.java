package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Medio {

	public int idmedio;
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
	public void delete(int idmedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblmedios WHERE idmedios = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idmedio);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idmedio+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idmedio+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readOne(int idmedio, JTextField Nombre, JTextField Observaciones, JTextField idTipoMedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblmedios WHERE idmedios = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idmedio);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			while (rs.next()) {
				Nombre.setText(rs.getString(2));
				Observaciones.setText(rs.getString(3));
				idTipoMedios.setText(rs.getString(4));
				
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void update(int idmedio, String nombre, String observaciones ,int idtipomedio) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "update tblmedios set nombre = ?, observaciones = ?, idtipomedios = ?  where idmedios = ?;";

		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			pst.setInt(3, idtipomedio);
			pst.setInt(4, idmedio);
			
			
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
