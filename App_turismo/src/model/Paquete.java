package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Paquete {
	int codigo;
	int iddestino;
	int idorigen;
	String fechaventa;
	String horaventa;
	String fechaejecucion;
	String horasalida;
	String observaciones;
	int idclientes;
	int idagencia;
	String matricula;
	int idmedios;
	int idpromotor;
	String precio;

	Conexion conector = new Conexion();

	public Paquete(int iddestino, int idorigen, String fechaventa, String horaventa, String fechaejecucion,
			String horasalida, String observaciones, int idclientes, int idagencia, String matricula, int idmedios,
			int idpromotor, String precio) {
		super();
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.fechaejecucion = fechaejecucion;
		this.horasalida = horasalida;
		this.observaciones = observaciones;
		this.idclientes = idclientes;
		this.idagencia = idagencia;
		this.matricula = matricula;
		this.idmedios = idmedios;
		this.idpromotor = idpromotor;
		this.precio = precio;
	}

	public Paquete() {
		super();
	}

	public int getIddestino() {
		return iddestino;
	}

	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}

	public int getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}

	public String getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}

	public String getHoraventa() {
		return horaventa;
	}

	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}

	public String getFechaejecucion() {
		return fechaejecucion;
	}

	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdmedios() {
		return idmedios;
	}

	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}

	public int getIdpromotor() {
		return idpromotor;
	}

	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void create(int iddestino, int idorigen, String fechaventa, String horaventa, String fechaejecucion,
			String horasalida, String observaciones, int idclientes, int idagencia, String matricula, int idmedios,
			int idpromotor, String precio) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "insert into tblpaquetes( iddestino, idorigen, fechaventa , horaventa , fechaejecucion , horasalida , observaciones, idclientes , idagencia , matricula , idmedios , idpromotor, precio) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarDB();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, fechaejecucion);
			pst.setString(6, horasalida);
			pst.setString(7, observaciones);
			pst.setInt(8, idclientes);
			pst.setInt(9, idagencia);
			pst.setString(10, matricula);
			pst.setInt(11, idmedios);
			pst.setInt(12, idpromotor);
			pst.setString(13, precio);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(int codigo) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblpaquetes WHERE codigo = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, codigo);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+codigo+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+codigo+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readOne(int codigo, JTextField iddestino, JTextField idorigen, JTextField fechaventa,
			JTextField horaventa, JTextField fechaejecucion, JTextField horasalida, JTextField observaciones, 
			JTextField idclientes, JTextField idagencia, JTextField matricula, JTextField idmedios, JTextField idpromotor, JTextField precio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblpaquetes WHERE codigo = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, codigo);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			while (rs.next()) {
				iddestino.setText(rs.getString(2));
				idorigen.setText(rs.getString(3));
				fechaventa.setText(rs.getString(4));
				horaventa.setText(rs.getString(5));
				fechaejecucion.setText(rs.getString(6));
				horasalida.setText(rs.getString(7));
				observaciones.setText(rs.getString(8));
				idclientes.setText(rs.getString(9));
				idagencia.setText(rs.getString(10));
				matricula.setText(rs.getString(11));
				idmedios.setText(rs.getString(12));
				idpromotor.setText(rs.getString(13));
				precio.setText(rs.getString(14));
				
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
