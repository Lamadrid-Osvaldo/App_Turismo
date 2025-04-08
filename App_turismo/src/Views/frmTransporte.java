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
	private JButton btnActualizar;

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
		setTitle("Transporte");
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
		txtMarca.setBounds(108, 74, 86, 20);
		contentPane.add(txtMarca);
		
		JTextField txtAsientos = new JTextField();
		txtAsientos.setColumns(10);
		txtAsientos.setBounds(108, 105, 86, 20);
		contentPane.add(txtAsientos);
		
		JTextField txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(108, 136, 86, 20);
		contentPane.add(txtModelo);
		
		JTextField txtNumeroMotor = new JTextField();
		txtNumeroMotor.setColumns(10);
		txtNumeroMotor.setBounds(108, 167, 86, 20);
		contentPane.add(txtNumeroMotor);
		
		JTextField txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(108, 202, 86, 20);
		contentPane.add(txtCategoria);
		
		JTextField txtIdTipoTransporte = new JTextField();
		txtIdTipoTransporte.setColumns(10);
		txtIdTipoTransporte.setBounds(318, 43, 86, 20);
		contentPane.add(txtIdTipoTransporte);
	
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transporte cr = new Transporte();
				cr.create(txtMatricula.getText(),txtMarca.getText(), Integer.parseInt(txtAsientos.getText()),
						txtModelo.getText(),txtCategoria.getText(),txtNumeroMotor.getText(),Integer.parseInt(txtIdTipoTransporte.getText()));
				
				txtMatricula.setText("");
				txtMarca.setText("");
				txtAsientos.setText("");
				txtModelo.setText("");
				txtCategoria.setText("");
				txtNumeroMotor.setText("");
				txtIdTipoTransporte.setText("");
				
			}
		});
		btnGuardar.setBounds(204, 97, 110, 36);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("Matricula:");
		lblNewLabel.setBounds(25, 46, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("Marca:");
		lblCorreo.setBounds(25, 71, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Asientos");
		lblTelefono.setBounds(25, 108, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Modelo:");
		lblDireccion.setBounds(25, 139, 60, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("Numero de Motor");
		lblWeb.setBounds(10, 167, 96, 14);
		contentPane.add(lblWeb);
		
		JLabel xd = new JLabel("Categoria:");
		xd.setBounds(25, 205, 60, 14);
		contentPane.add(xd);
		
		JLabel lblIdtipo = new JLabel("id Tipo Transporte");
		lblIdtipo.setBounds(212, 46, 96, 14);
		contentPane.add(lblIdtipo);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transporte transporte = new Transporte();
				transporte.delete(txtMatricula.getText());
				txtMatricula.setText("");
				
			}
		});
		btnEliminar.setBounds(318, 145, 106, 36);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transporte transporte = new Transporte();
				
				transporte.readOne(txtMatricula.getText(), txtMarca, txtAsientos, txtModelo, txtCategoria, txtNumeroMotor, txtIdTipoTransporte);
				
			}
		});
		btnConsultar.setBounds(321, 97, 103, 36);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transporte transporte = new Transporte();
				
				transporte.update(txtMatricula.getText(), txtMarca.getText(), Integer.parseInt(txtAsientos.getText()),
						txtModelo.getText(),txtCategoria.getText(),txtNumeroMotor.getText(),Integer.parseInt(txtIdTipoTransporte.getText()));
				
				
				
			}
		});
		btnActualizar.setBounds(204, 144, 110, 36);
		contentPane.add(btnActualizar);
		
	}	
}

