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

import model.Transporte;

public class frmTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTransporte frame = new frmTransporte();
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
	public frmTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField txtMatricula = new JTextField();
		txtMatricula.setBounds(108, 43, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JTextField txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(108, 105, 86, 20);
		contentPane.add(txtMarca);
		
		JTextField txtAsientos = new JTextField();
		txtAsientos.setColumns(10);
		txtAsientos.setBounds(108, 136, 86, 20);
		contentPane.add(txtAsientos);
		
		JTextField txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(108, 167, 86, 20);
		contentPane.add(txtModelo);
		
		JTextField txtNumeroMotor = new JTextField();
		txtNumeroMotor.setColumns(10);
		txtNumeroMotor.setBounds(108, 198, 86, 20);
		contentPane.add(txtNumeroMotor);
		
		JTextField txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(108, 229, 86, 20);
		contentPane.add(txtCategoria);
		
		JTextField txtIdTipoTransporte = new JTextField();
		txtIdTipoTransporte.setColumns(10);
		txtIdTipoTransporte.setBounds(318, 43, 86, 20);
		contentPane.add(txtIdTipoTransporte);
	
		
		JButton btnGuardar = new JButton("guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transporte cr = new Transporte();
				cr.create(txtMatricula.getText(),txtMarca.getText(), Integer.parseInt(txtAsientos.getText()),
						txtModelo.getText(),txtCategoria.getText(),txtNumeroMotor.getText(),Integer.parseInt(txtIdTipoTransporte.getText()));
				
			}
		});
		btnGuardar.setBounds(231, 136, 110, 52);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("matricula:");
		lblNewLabel.setBounds(25, 46, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("Marca:");
		lblCorreo.setBounds(25, 108, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("puestos:");
		lblTelefono.setBounds(25, 139, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("modelo:");
		lblDireccion.setBounds(25, 170, 60, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("Numero de Motor");
		lblWeb.setBounds(10, 201, 96, 14);
		contentPane.add(lblWeb);
		
		JLabel lblIdcompania = new JLabel("categoria:");
		lblIdcompania.setBounds(25, 232, 60, 14);
		contentPane.add(lblIdcompania);
		
		JLabel lblIdtipo = new JLabel("id Tipo Transporte");
		lblIdtipo.setBounds(212, 46, 96, 14);
		contentPane.add(lblIdtipo);
		
	}	
}

