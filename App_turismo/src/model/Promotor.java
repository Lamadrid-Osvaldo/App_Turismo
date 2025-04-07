package model;

import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Views.frmLogin;
import Views.frmPrincipal;
import Views.frmPromotor;
import controler.Conexion;

public class Promotor {
	
	
	public String contrasena;
	public int idPromotor;
	public String nombre;
	public String apellido;
	public int tipodocumento; 
	public int documento;
	public String direccion; 
	public String correopersonal;
	public String correocorp;
	public String fechanacimiento; 
	public String telefono;
	Conexion conector = new Conexion();
	
	public Promotor( int tipodocumento, int documento, String nombre, String apellido ,String direccion,
			String correopersonal, String correocorp, String fechanacimiento, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	}
	
	
	public Promotor() {
		super();
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
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
	
	public void create(int tipodocumento, int documento, String nombre, String apellido ,String direccion,
			String correopersonal, String correocorp, String fechanacimiento, String telefono) {
			
			
			Connection dbConnection = null;
			PreparedStatement pst = null; 
			
			String script = "insert into tblpromotores(tipodocumento,numerodocumento,nombre,apellido,direccion,correo,correocorporativo,fechanacimiento,telefono) values (?,?,?,?,?,?,?,?,?)";
			
			try {
				dbConnection = conector.conectarDB();
				pst = dbConnection.prepareStatement(script);
				
				
				pst.setInt(1, tipodocumento);
				pst.setInt(2, documento);
				pst.setString(3, nombre);
				pst.setString(4, apellido);
				pst.setString(5, direccion);
				pst.setString(6, correopersonal);
				pst.setString(7, correocorp);
				pst.setString(8, fechanacimiento);
				pst.setString(9, telefono);
				
				pst.executeUpdate();
				
				JOptionPane.showConfirmDialog(null, "registro con exito");
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	public void delete(int idPromotor) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblpromotores WHERE idpromotor = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idPromotor);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No."+idPromotor+ " ?" );
			
			if (resp == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. "+idPromotor+" Eliminado");
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readOne(int idPromotor, JTextField Nombre, JTextField Apellido, 
			JTextField txtTipoDocumento, JTextField txtDocumento, JTextField txtDireccion,
			JTextField txtCorreoPersonal, JTextField txtCorreoCorp, JTextField txtFechaNacimiento,
			JTextField txtTelefono, JTextField txtContrasena) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblpromotores WHERE idpromotor = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); //Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar el campo
			pst.setInt(1, idPromotor);
			
			ResultSet rs = pst.executeQuery(); //Almacenamiento Temporal
			
			while (rs.next()) {
				txtTipoDocumento.setText(rs.getString(2));
				txtDocumento.setText(rs.getString(3));
				Nombre.setText(rs.getString(4));
				Apellido.setText(rs.getString(5));
				txtDireccion.setText(rs.getString(6));
				txtCorreoPersonal.setText(rs.getString(7));
				txtCorreoCorp.setText(rs.getString(8));
				txtFechaNacimiento.setText(rs.getString(9));
				txtTelefono.setText(rs.getString(10));
				txtContrasena.setText(rs.getString(11));	
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void update(int idPromotor , int tipodocumento, int documento, String nombre, String apellido ,String direccion,
			String correopersonal, String correocorp, String fechanacimiento, String telefono) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "update tblpromotores set tipodocumento = ?, numerodocumento = ?, nombre = ?, apellido = ?, direccion = ?, correo = ?, correocorporativo = ?, fechanacimiento = ?, telefono = ?  where idpromotor = ?;";

		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorp);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			pst.setInt(10, idPromotor);
			
			
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
	
	public void controlAcceso(int documento, String contrasena) {
		frmPromotor promotor = new frmPromotor();

		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblpromotores WHERE numerodocumento = ? and contrasena = ?" ;
		
		try {
			dbConnection = conector.conectarDB(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer
			
			pst.setInt(1, documento);
			pst.setString(2, contrasena);
			ResultSet rs = pst.executeQuery(); //Almacenamiento temporal
			
			if (rs.next()) {
			frmPrincipal principal = new frmPrincipal();
			principal.show();
			
				
			}else {
				JOptionPane.showMessageDialog(null,"Usuario no existente..");
			}
		
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	
	
	}
	
}
