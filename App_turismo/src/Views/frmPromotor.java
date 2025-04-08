package Views;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Promotor;

public class frmPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdPromotor;
	private JTextField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPromotor frame = new frmPromotor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPromotor() {
		
		setTitle("Promotor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(131, 46, 86, 20);
		contentPane.add(txtNombre);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(131, 77, 86, 20);
		contentPane.add(txtApellido);
		
		JTextField txtTipoDocumento = new JTextField();
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(131, 108, 86, 20);
		contentPane.add(txtTipoDocumento);
		
		JTextField txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(131, 139, 86, 20);
		contentPane.add(txtDocumento);
		
		JTextField txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(131, 170, 86, 20);
		contentPane.add(txtDireccion);
		
		JTextField txtCorreoPersonal = new JTextField();
		txtCorreoPersonal.setColumns(10);
		txtCorreoPersonal.setBounds(131, 201, 86, 20);
		contentPane.add(txtCorreoPersonal);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(44, 49, 52, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCorreo = new JLabel("Apellido");
		lblCorreo.setBounds(44, 80, 52, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Tipo de Documento");
		lblTelefono.setBounds(10, 111, 111, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Numero de Documento");
		lblDireccion.setBounds(10, 142, 118, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("Direccion:");
		lblWeb.setBounds(28, 173, 60, 14);
		contentPane.add(lblWeb);
		
		JLabel lblIdcompania = new JLabel("Correo Personal");
		lblIdcompania.setBounds(23, 204, 86, 14);
		contentPane.add(lblIdcompania);
		
		JLabel lblCorreocorp = new JLabel("Correo Corporativo");
		lblCorreocorp.setBounds(246, 49, 100, 14);
		contentPane.add(lblCorreocorp);
		
		JLabel lblFechanacimiento = new JLabel("Fecha de Nacimiento");
		lblFechanacimiento.setBounds(246, 80, 100, 14);
		contentPane.add(lblFechanacimiento);
		
		JLabel lblTelefono_1 = new JLabel("Telefono:");
		lblTelefono_1.setBounds(268, 111, 73, 14);
		contentPane.add(lblTelefono_1);
		
		JTextField txtCorreoCorp = new JTextField();
		txtCorreoCorp.setColumns(10);
		txtCorreoCorp.setBounds(351, 46, 86, 20);
		contentPane.add(txtCorreoCorp);
		
		JTextField txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(351, 74, 86, 20);
		contentPane.add(txtFechaNacimiento);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(351, 108, 86, 20);
		contentPane.add(txtTelefono);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotor cr = new Promotor();
				cr.create(Integer.parseInt(txtTipoDocumento.getText()), Integer.parseInt(txtDocumento.getText()),txtNombre.getText(), 
						txtApellido.getText() , txtDireccion.getText(), txtCorreoPersonal.getText(),
						txtCorreoCorp.getText(), txtFechaNacimiento.getText(), txtTelefono.getText(), txtContrasena.getText());
				
				txtTipoDocumento.setText("");
				txtDocumento.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtDireccion.setText("");
				txtCorreoPersonal.setText("");
				txtCorreoCorp.setText("");
				txtFechaNacimiento.setText("");
				txtTelefono.setText("");
				txtContrasena.setText("");
			}
		});
		btnGuardar.setBounds(251, 184, 110, 37);
		contentPane.add(btnGuardar);
		
		txtIdPromotor = new JTextField();
		txtIdPromotor.setBounds(131, 232, 86, 20);
		contentPane.add(txtIdPromotor);
		txtIdPromotor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Promotor");
		lblNewLabel.setBounds(28, 235, 73, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotor promotor = new Promotor();
				
				promotor.delete(Integer.parseInt(txtIdPromotor.getText()));
				
				txtIdPromotor.setText("");
				
			}
		});
		btnEliminar.setBounds(386, 246, 106, 37);
		contentPane.add(btnEliminar);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(131, 267, 86, 20);
		contentPane.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		JLabel fdef = new JLabel("Contrasena");
		fdef.setBounds(28, 270, 62, 14);
		contentPane.add(fdef);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotor promotor = new Promotor();
				
				promotor.readOne(Integer.parseInt(txtIdPromotor.getText()), txtNombre, txtApellido, 
						txtTipoDocumento, txtDocumento, txtDireccion, txtCorreoPersonal,
						txtCorreoCorp, txtFechaNacimiento, txtTelefono, txtContrasena);
			}
		});
		btnConsultar.setBounds(386, 184, 106, 37);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotor promotor = new Promotor();
				
				promotor.update(Integer.parseInt(txtIdPromotor.getText()), Integer.parseInt(txtTipoDocumento.getText()), Integer.parseInt(txtDocumento.getText()),
						txtNombre.getText(), txtApellido.getText() , txtDireccion.getText(), txtCorreoPersonal.getText(),
						txtCorreoCorp.getText(), txtFechaNacimiento.getText(), txtTelefono.getText(),txtContrasena.getText());
				
			}
		});
		btnActualizar.setBounds(255, 246, 106, 37);
		contentPane.add(btnActualizar);
		
		
	}
}
