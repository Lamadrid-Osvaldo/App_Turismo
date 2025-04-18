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

import model.Compania;

public class frmCompania extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdCompania;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompania frame = new frmCompania();
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
	public frmCompania() {
		setTitle("Compañias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(137, 33, 86, 20);
		contentPane.add(txtNombre);
		
		JTextField txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(137, 64, 86, 20);
		contentPane.add(txtDireccion);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(137, 95, 86, 20);
		contentPane.add(txtTelefono);
		
		JTextField txtFechaCreacion = new JTextField();
		txtFechaCreacion.setColumns(10);
		txtFechaCreacion.setBounds(137, 126, 86, 20);
		contentPane.add(txtFechaCreacion);
		
		JTextField txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(137, 157, 86, 20);
		contentPane.add(txtCorreo);
		
		JTextField txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(137, 188, 86, 20);
		contentPane.add(txtWeb);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Compania cr = new Compania();
				cr.create(txtNombre.getText(), txtCorreo.getText(), txtTelefono.getText(), 
						txtDireccion.getText(), txtWeb.getText(),txtFechaCreacion.getText());
				
				txtNombre.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
				txtWeb.setText("");
				txtFechaCreacion.setText("");
				
			}
		});
		btnNewButton.setBounds(270, 46, 110, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(26, 36, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCorreo = new JLabel("Direccion");
		lblCorreo.setBounds(26, 67, 60, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(26, 98, 60, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Fecha de Creacion");
		lblDireccion.setBounds(26, 129, 101, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("Correo");
		lblWeb.setBounds(26, 160, 46, 14);
		contentPane.add(lblWeb);
		
		JLabel lblIdcompania = new JLabel("Pagina Web");
		lblIdcompania.setBounds(26, 191, 74, 14);
		contentPane.add(lblIdcompania);
		
		txtIdCompania = new JTextField();
		txtIdCompania.setBounds(137, 219, 86, 20);
		contentPane.add(txtIdCompania);
		txtIdCompania.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Compania");
		lblNewLabel.setBounds(24, 216, 74, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Compania compania = new Compania();
				
				compania.delete(Integer.parseInt(txtIdCompania.getText()));
				txtIdCompania.setText("");
				
			}
		});
		btnEliminar.setBounds(270, 179, 110, 35);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Compania compania = new Compania();
				
				compania.readOne(Integer.parseInt(txtIdCompania.getText()), txtNombre, txtCorreo,
						txtTelefono, txtDireccion, txtWeb, txtFechaCreacion);
				
			}
		});
		btnConsultar.setBounds(270, 91, 110, 35);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Compania compania = new Compania();
				
				compania.update(Integer.parseInt(txtIdCompania.getText()), txtNombre.getText(), txtCorreo.getText(), txtTelefono.getText(), 
						txtDireccion.getText(), txtWeb.getText(),txtFechaCreacion.getText() );
				
			}
		});
		btnActualizar.setBounds(270, 137, 110, 37);
		contentPane.add(btnActualizar);
	}
}
