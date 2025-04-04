package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Operador {

	Conexion conector = new Conexion();
	int idoperador;
	int tipodocumento;
	int numerodocumento;
	String nombre;
	String apellido;
	String direccion;
	String correo;
	String telefono;
	String matricula;

	public Operador(int tipodocumento, int numerodocumento, String nombre, String apellido, String direccion,
			String correo,  String telefono, String matricula) {
		super();
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.matricula = matricula;
	}

	public Operador() {
		super();
	}

	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public int getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(int numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void create(int tipodocumento, int numerodocumento, String nombre, String apellido, String direccion,
			String correo, String telefono, String matricula) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "insert into tbloperadores(tipodocumento,numerodocumento,nombres,apellidos,direccion,correo,telefono,matricula) values (?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarDB();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			pst.setString(8, matricula);
			
			

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(int idoperador) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tbloperadores WHERE idoperador = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idoperador);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idoperador+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idoperador+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void readOne(int idoperador, JTextField tipoDocumento, JTextField numeroDocumento,
			JTextField nombres, JTextField apellidos , JTextField direccion ,JTextField correo, JTextField telefono, JTextField matricula) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tbloperadores WHERE idoperador = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idoperador );
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			while (rs.next()) {
				tipoDocumento.setText(rs.getString(2));
				numeroDocumento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correo.setText(rs.getString(7));
				telefono.setText(rs.getString(8));
				matricula.setText(rs.getString(9));
				
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
