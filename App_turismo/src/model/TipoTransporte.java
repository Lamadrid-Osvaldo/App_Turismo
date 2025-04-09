package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class TipoTransporte {

	public int idTipoTransporte;
	public String nombre;
	public String observacion;
	Conexion conector =  new Conexion();
	
	public TipoTransporte(String nombre, String observacion) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
	}
	
	
	public TipoTransporte() {
		super();
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public void create(String nombre, String observacion) {
			
			
			Connection dbConnection = null;
			PreparedStatement pst = null; 
			
			String script = "insert into tbltipotransportes(nombre, observaciones) values (?, ?)";
			
			try {
				dbConnection = conector.conectarDB();
				pst = dbConnection.prepareStatement(script);
				
				pst.setString(1, nombre);
				pst.setString(2, observacion);
				
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "registro con exito");
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	public void delete(int idTipoTransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tbltipotransportes WHERE idtipostransportes = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idTipoTransporte);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idTipoTransporte+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idTipoTransporte+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void readOne(int idTipoTransporte, JTextField nombre, JTextField observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tbltipotransportes WHERE idtipostransportes = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idTipoTransporte);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			if (rs.next()) {
				do {
				
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				
				} while (rs.next());
			}else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro en la base de datos.");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void update(int idTipoTransporte,String nombre, String observacion) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "update tbltipotransportes set nombre = ?, observaciones = ?  where idtipostransportes = ?;";

		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, idTipoTransporte);
			
			
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
