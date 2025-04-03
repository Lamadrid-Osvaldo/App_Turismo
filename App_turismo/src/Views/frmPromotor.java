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
		setBounds(100, 100, 493, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(98, 46, 86, 20);
		contentPane.add(txtNombre);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(98, 77, 86, 20);
		contentPane.add(txtApellido);
		
		JTextField txtTipoDocumento = new JTextField();
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(98, 108, 86, 20);
		contentPane.add(txtTipoDocumento);
		
		JTextField txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(98, 139, 86, 20);
		contentPane.add(txtDocumento);
		
		JTextField txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(98, 170, 86, 20);
		contentPane.add(txtDireccion);
		
		JTextField txtCorreoPersonal = new JTextField();
		txtCorreoPersonal.setColumns(10);
		txtCorreoPersonal.setBounds(98, 201, 86, 20);
		contentPane.add(txtCorreoPersonal);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(44, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCorreo = new JLabel("apellido:");
		lblCorreo.setBounds(44, 80, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("tipodocumento:");
		lblTelefono.setBounds(10, 111, 81, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("documento:");
		lblDireccion.setBounds(28, 142, 60, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("direccion:");
		lblWeb.setBounds(44, 173, 46, 14);
		contentPane.add(lblWeb);
		
		JLabel lblIdcompania = new JLabel("correopersonal:");
		lblIdcompania.setBounds(10, 204, 86, 14);
		contentPane.add(lblIdcompania);
		
		JLabel lblCorreocorp = new JLabel("correocorp:");
		lblCorreocorp.setBounds(199, 46, 86, 14);
		contentPane.add(lblCorreocorp);
		
		JLabel lblFechanacimiento = new JLabel("fechanacimiento:");
		lblFechanacimiento.setBounds(199, 77, 86, 14);
		contentPane.add(lblFechanacimiento);
		
		JLabel lblTelefono_1 = new JLabel("telefono:");
		lblTelefono_1.setBounds(199, 105, 86, 14);
		contentPane.add(lblTelefono_1);
		
		JTextField txtCorreoCorp = new JTextField();
		txtCorreoCorp.setColumns(10);
		txtCorreoCorp.setBounds(286, 43, 86, 20);
		contentPane.add(txtCorreoCorp);
		
		JTextField txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(286, 74, 86, 20);
		contentPane.add(txtFechaNacimiento);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(286, 102, 86, 20);
		contentPane.add(txtTelefono);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotor cr = new Promotor();
				cr.create(Integer.parseInt(txtTipoDocumento.getText()), Integer.parseInt(txtDocumento.getText()),txtNombre.getText(), 
						txtApellido.getText() , txtDireccion.getText(), txtCorreoPersonal.getText(),
						txtCorreoCorp.getText(), txtFechaNacimiento.getText(), txtTelefono.getText());
				
				txtTipoDocumento.setText("");
				txtDocumento.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtDireccion.setText("");
				txtCorreoPersonal.setText("");
				txtCorreoCorp.setText("");
				txtFechaNacimiento.setText("");
				txtTelefono.setText("");
			}
		});
		btnGuardar.setBounds(269, 139, 110, 37);
		contentPane.add(btnGuardar);
		
		txtIdPromotor = new JTextField();
		txtIdPromotor.setBounds(98, 232, 86, 20);
		contentPane.add(txtIdPromotor);
		txtIdPromotor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id promotor");
		lblNewLabel.setBounds(17, 235, 73, 14);
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
		btnEliminar.setBounds(279, 193, 110, 37);
		contentPane.add(btnEliminar);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(98, 267, 86, 20);
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
		btnConsultar.setBounds(283, 246, 106, 37);
		contentPane.add(btnConsultar);
		
		
	}
}
