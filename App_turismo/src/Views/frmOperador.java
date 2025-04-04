package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Operador;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmOperador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipoDocumento;
	private JTextField txtNumeroDocumento;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JLabel lblNewLabel_6;
	private JTextField txtMatricula;
	private JTextField txtIdOperador;
	private JLabel lblNewLabel_7;
	private JButton btnEliminar;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmOperador frame = new frmOperador();
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
	public frmOperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setBounds(215, 37, 86, 20);
		contentPane.add(txtTipoDocumento);
		txtTipoDocumento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo de Documento");
		lblNewLabel.setBounds(45, 40, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero Documento");
		lblNewLabel_1.setBounds(45, 76, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNumeroDocumento = new JTextField();
		txtNumeroDocumento.setBounds(215, 68, 86, 20);
		contentPane.add(txtNumeroDocumento);
		txtNumeroDocumento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(45, 104, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(215, 101, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setBounds(45, 129, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(215, 132, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion");
		lblNewLabel_4.setBounds(45, 161, 57, 14);
		contentPane.add(lblNewLabel_4);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(215, 158, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Correo");
		lblNewLabel_5.setBounds(45, 186, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(215, 183, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Telefono");
		lblNewLabel_8.setBounds(45, 211, 75, 14);
		contentPane.add(lblNewLabel_8);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(215, 208, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operador operador = new Operador();
				
				operador.create(Integer.parseInt(txtTipoDocumento.getText()),Integer.parseInt(txtNumeroDocumento.getText()), 
						txtNombres.getText(), txtApellidos.getText(),txtDireccion.getText(), txtCorreo.getText(),
						txtTelefono.getText(),txtMatricula.getText());
				
				txtTipoDocumento.setText("");
				txtNumeroDocumento.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
				txtMatricula.setText("");
				
			}
		});
		btnGuardar.setBounds(385, 52, 125, 63);
		contentPane.add(btnGuardar);
		
		lblNewLabel_6 = new JLabel("Matricula");
		lblNewLabel_6.setBounds(45, 243, 75, 14);
		contentPane.add(lblNewLabel_6);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(215, 240, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtIdOperador = new JTextField();
		txtIdOperador.setBounds(215, 271, 86, 20);
		contentPane.add(txtIdOperador);
		txtIdOperador.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Id Operador");
		lblNewLabel_7.setBounds(45, 271, 86, 20);
		contentPane.add(lblNewLabel_7);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operador operador = new Operador();
				
				operador.delete(Integer.parseInt(txtIdOperador.getText()));
				
				txtIdOperador.setText("");
				
			}
		});
		btnEliminar.setBounds(385, 259, 125, 44);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operador operador = new Operador();
				
				operador.readOne(Integer.parseInt(txtIdOperador.getText()), txtTipoDocumento, txtNumeroDocumento, txtNombres,
						txtApellidos, txtDireccion, txtCorreo, txtTelefono, txtMatricula);
				
			}
		});
		btnConsultar.setBounds(385, 129, 125, 46);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operador operador = new Operador();
				
				operador.update(Integer.parseInt(txtIdOperador.getText()), Integer.parseInt(txtTipoDocumento.getText()),Integer.parseInt(txtNumeroDocumento.getText()), 
						txtNombres.getText(), txtApellidos.getText(),txtDireccion.getText(), txtCorreo.getText(),
						txtTelefono.getText(),txtMatricula.getText());
				
			}
		});
		btnActualizar.setBounds(385, 197, 125, 43);
		contentPane.add(btnActualizar);
	}
}
