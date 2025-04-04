package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Transporte {

	Conexion conector = new Conexion();

	public String Matricula;
	public String Marca;
	public int Asientos;
	public String Modelo;
	public String Categoria;
	public String NumeroMotor;
	public int IdTipoTransporte;

	public Transporte(String matricula, String marca, int asientos, String modelo, String categoria, String numeroMotor,
			int idTipoTransporte) {
		super();
		Matricula = matricula;
		Marca = marca;
		Asientos = asientos;
		Modelo = modelo;
		Categoria = categoria;
		NumeroMotor = numeroMotor;
		IdTipoTransporte = idTipoTransporte;
	}

	public Transporte() {
		super();
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getAsientos() {
		return Asientos;
	}

	public void setAsientos(int asientos) {
		Asientos = asientos;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getNumeroMotor() {
		return NumeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		NumeroMotor = numeroMotor;
	}

	public int getIdTipoTransporte() {
		return IdTipoTransporte;
	}

	public void setIdTipoTransporte(int idTipoTransporte) {
		IdTipoTransporte = idTipoTransporte;
	}

	public void create(String matricula, String marca, int asientos, String modelo, String categoria, String numeroMotor,
			int idTipoTransporte) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "insert into tbltransporte(matricula,marca,asientos,modelo,categoria,numeromotor,idtipotransportes) values (?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarDB();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, matricula);
			pst.setString(2, marca);
			pst.setInt(3, asientos);
			pst.setString(4, modelo);
			pst.setString(5, categoria);
			pst.setString(6, numeroMotor);
			pst.setInt(7, idTipoTransporte);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(String matricula) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tbltransporte WHERE matricula = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setString(1, matricula);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+matricula+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+matricula+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readOne(String matricula, JTextField Marca, JTextField Asientos,
			JTextField Modelo , JTextField Categoria , JTextField numeroMotor , JTextField idTipoTransportes) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tbltransporte WHERE matricula = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setString(1, matricula);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			while (rs.next()) {
				Marca.setText(rs.getString(2));
				Asientos.setText(rs.getString(3));
				Modelo.setText(rs.getString(4));
				Categoria.setText(rs.getString(5));
				numeroMotor.setText(rs.getString(6));
				idTipoTransportes.setText(rs.getString(7));
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void update(String matricula, String marca, int asientos, String modelo, String categoria, String numeroMotor,
			int idTipoTransporte) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "update tbltransporte set marca = ?, asientos = ?, modelo = ?, categoria = ?, numeromotor = ?, idtipotransportes = ?  where matricula = ?;";

		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setString(1, marca);
			pst.setInt(2, asientos);
			pst.setString(3, modelo);
			pst.setString(4, categoria);
			pst.setString(5, numeroMotor);
			pst.setInt(6, idTipoTransporte);
			pst.setString(7, matricula);
			
			
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