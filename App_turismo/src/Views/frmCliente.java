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

import model.Cliente;

public class frmCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente frame = new frmCliente();
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
	public frmCliente() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(112, 32, 86, 20);
		contentPane.add(txtDocumento);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(112, 63, 86, 20);
		contentPane.add(txtApellido);
		
		JTextField txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBounds(112, 94, 86, 20);
		contentPane.add(txtAlergias);
		
		JTextField txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(112, 125, 86, 20);
		contentPane.add(txtCorreo);
		
		JTextField txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(112, 156, 86, 20);
		contentPane.add(txtDireccion);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(112, 187, 86, 20);
		contentPane.add(txtTelefono);
		
		JTextField txtEstadoCivil = new JTextField();
		txtEstadoCivil.setColumns(10);
		txtEstadoCivil.setBounds(342, 156, 86, 20);
		contentPane.add(txtEstadoCivil);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(342, 63, 86, 20);
		contentPane.add(txtNombre);
		
		JTextField txtEps = new JTextField();
		txtEps.setColumns(10);
		txtEps.setBounds(342, 94, 86, 20);
		contentPane.add(txtEps);
		
		JTextField txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(342, 125, 86, 20);
		contentPane.add(txtFechaNacimiento);
		
		JTextField txtTipoDocumento = new JTextField();
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(342, 32, 86, 20);
		contentPane.add(txtTipoDocumento);
		
		JLabel lblTipoDeId = new JLabel("Tipo de documento");
		lblTipoDeId.setBounds(220, 35, 112, 14);
		contentPane.add(lblTipoDeId);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(28, 35, 74, 14);
		contentPane.add(lblDocumento);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(28, 66, 74, 14);
		contentPane.add(lblApellido);
		
		JLabel lblFechanacimiento = new JLabel("Fecha de Nacimiento");
		lblFechanacimiento.setBounds(218, 128, 114, 14);
		contentPane.add(lblFechanacimiento);
		
		JLabel lblEstadocivil = new JLabel("Estado Civil");
		lblEstadocivil.setBounds(220, 159, 78, 14);
		contentPane.add(lblEstadocivil);
		
		JButton btnNewButton = new JButton("Guardar");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente cr = new Cliente();
				cr.create(Integer.parseInt(txtTipoDocumento.getText()), Integer.parseInt(txtDocumento.getText()), txtNombre.getText(),
						txtApellido.getText(), txtEps.getText(), txtAlergias.getText(),txtFechaNacimiento.getText(),
						txtCorreo.getText(), txtEstadoCivil.getText(), txtTelefono.getText(), txtDireccion.getText());
				
				txtTipoDocumento.setText("");
				txtDocumento.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtEps.setText("");
				txtAlergias.setText("");
				txtFechaNacimiento.setText("");
				txtCorreo.setText("");
				txtEstadoCivil.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
			}
		});
		btnNewButton.setBounds(237, 204, 112, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(220, 66, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCorreo = new JLabel("Eps");
		lblCorreo.setBounds(220, 97, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Alergias");
		lblTelefono.setBounds(28, 97, 62, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Correo");
		lblDireccion.setBounds(28, 128, 74, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("Direccion");
		lblWeb.setBounds(28, 159, 62, 14);
		contentPane.add(lblWeb);
		
		JLabel lblIdcompania = new JLabel("Telefono");
		lblIdcompania.setBounds(28, 190, 60, 14);
		contentPane.add(lblIdcompania);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(112, 218, 86, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID Cliente");
		lblNewLabel.setBounds(28, 224, 62, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente cliente = new Cliente();
				
				cliente.delete(Integer.parseInt(txtIdCliente.getText()));
				
				txtIdCliente.setText("");
			}
		});
		btnEliminar.setBounds(372, 249, 102, 34);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente cliente = new Cliente();
				
				cliente.readOne(Integer.parseInt(txtIdCliente.getText()), txtTipoDocumento, txtDocumento, txtNombre, txtApellido, 
						txtEps, txtAlergias, txtFechaNacimiento, txtCorreo, txtEstadoCivil,
						txtTelefono, txtDireccion);
			}
		});
		btnConsultar.setBounds(372, 204, 102, 34);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cliente cliente = new Cliente();
				
				cliente.update(Integer.parseInt(txtIdCliente.getText()),Integer.parseInt(txtTipoDocumento.getText()), Integer.parseInt(txtDocumento.getText()), txtNombre.getText(),
						txtApellido.getText(), txtEps.getText(), txtAlergias.getText(),txtFechaNacimiento.getText(),
						txtCorreo.getText(), txtEstadoCivil.getText(), txtTelefono.getText(), txtDireccion.getText());
				
			}
		});
		btnActualizar.setBounds(237, 249, 112, 34);
		contentPane.add(btnActualizar);
		
		
		
		
	}

}
