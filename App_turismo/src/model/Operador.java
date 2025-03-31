package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Operador {

	Conexion conector = new Conexion();

	int tipodocumento;
	int numerodocumento;
	String nombre;
	String apellido;
	String direccion;
	String correo;
	String correocorporativo;
	String fechanacimiento;
	String telefono;
	String matricula;

	public Operador(int tipodocumento, int numerodocumento, String nombre, String apellido, String direccion,
			String correo, String correocorporativo, String fechanacimiento, String telefono, String matricula) {
		super();
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.correocorporativo = correocorporativo;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.matricula = matricula;
	}

	public Operador() {
		super();
	}

	public Conexion getConector() {
		return conector;
	}

	public void setConector(Conexion conector) {
		this.conector = conector;
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

	public String getCorreocorporativo() {
		return correocorporativo;
	}

	public void setCorreocorporativo(String correocorporativo) {
		this.correocorporativo = correocorporativo;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
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
			String correo, String correocorporativo, String fechanacimiento, String telefono, String matricula) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "insert into tblpromotores(tipodocumento,numerodocumento,nombre,apellido,direccion,correo,correocorporativo,fechanacimiento,telefono) values (?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarDB();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, correocorporativo);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			pst.setString(10, matricula);
			
			

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
