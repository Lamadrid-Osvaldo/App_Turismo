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

import model.Agencias;

public class frmAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdAgencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAgencia frame = new frmAgencia();
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
	public frmAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(99, 23, 111, 20);
		contentPane.add(txtNombre);
		
		JTextField txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(99, 47, 111, 20);
		contentPane.add(txtCorreo);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(99, 75, 111, 20);
		contentPane.add(txtTelefono);
		
		JTextField txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(99, 100, 111, 20);
		contentPane.add(txtDireccion);
		
		JTextField txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(99, 125, 111, 20);
		contentPane.add(txtWeb);
		
		JTextField txtIdCompania = new JTextField();
		txtIdCompania.setColumns(10);
		txtIdCompania.setBounds(99, 156, 111, 20);
		contentPane.add(txtIdCompania);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencias agencia = new Agencias();
				agencia.create(txtNombre.getText(), txtCorreo.getText(), txtTelefono.getText(), txtDireccion.getText(),
						txtWeb.getText(), Integer.parseInt(txtIdCompania.getText()));
				
				txtNombre.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
				txtWeb.setText("");
				txtIdCompania.setText("");
			}
		});
		btnGuardar.setBounds(249, 32, 111, 35);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(27, 26, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(27, 53, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(27, 78, 71, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(27, 103, 60, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setBounds(27, 128, 46, 14);
		contentPane.add(lblWeb);
		
		JLabel lblIdcompania = new JLabel("Idcompañia:");
		lblIdcompania.setBounds(27, 159, 69, 14);
		contentPane.add(lblIdcompania);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencias agencia = new Agencias();
				
				agencia.delete(Integer.parseInt(txtIdAgencia.getText()));
				
				txtIdAgencia.setText("");
				
			}
		});
		btnEliminar.setBounds(249, 85, 111, 35);
		contentPane.add(btnEliminar);
		
		txtIdAgencia = new JTextField();
		txtIdAgencia.setBounds(99, 187, 111, 20);
		contentPane.add(txtIdAgencia);
		txtIdAgencia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Agencia :");
		lblNewLabel.setBounds(27, 190, 71, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencias agencia = new Agencias();
				
				agencia.readOne(Integer.parseInt(txtIdAgencia.getText()), txtNombre, txtCorreo, txtTelefono, txtDireccion, txtWeb, txtIdCompania);
				
			}
		});
		btnConsultar.setBounds(249, 131, 111, 35);
		contentPane.add(btnConsultar);
	}

}
