package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Cliente {

	public int tipodocumento;
	public int documento ;
	public String nombre;
	public String apellidos;
	public String eps ;
	public String alergias; 
	public String fechanacimiento;
	public String correo;
	public String estadocivil;
	public String direccion ;
	public String telefono ;
	public int idcliente;
	Conexion conector = new Conexion();
	
	public Cliente(int tipodocumento, int documento, String nombre, String apellidos, String eps, String alergias,
			String fechanacimiento, String correo, String estadocivil, String direccion, String telefono) {
		super();
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.correo = correo;
		this.estadocivil = estadocivil;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	
	public Cliente() {
		super();
	}



	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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
	
	public void create(int tipodocumento, int documento, String nombre, String apellidos, String eps, String alergias,
		String fechanacimiento, String correo, String estadocivil, String direccion, String telefono) {
		
		
		Connection dbConnection = null;
		PreparedStatement pst = null; 
		
		String script = "insert into tblclientes(tipodocumento,numerodocumento,nombres,apellidos,eps,alergias,fechanacimiento,correo,estadocivil,telefono,direccion) values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarDB();
			pst = dbConnection.prepareStatement(script);
			
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechanacimiento);
			pst.setString(8, correo);
			pst.setString(9, estadocivil);
			pst.setString(10, telefono);
			pst.setString(11, direccion);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "registro con exito");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete(int idcliente) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblclientes WHERE idclientes = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idcliente);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idcliente+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idcliente+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
