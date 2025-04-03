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

import model.TipoTransporte;

public class frmTipoTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdTipoTransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoTransporte frame = new frmTipoTransporte();
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
	public frmTipoTransporte() {
		setTitle("Tipo de Transporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(108, 41, 86, 20);
		contentPane.add(txtNombre);
		
		JTextField txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(108, 66, 86, 20);
		contentPane.add(txtObservacion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoTransporte cr = new TipoTransporte();
			
				cr.create(txtNombre.getText(), txtObservacion.getText());
				txtNombre.setText("");
				txtObservacion.setText("");
			}
		});
		btnGuardar.setBounds(285, 25, 110, 52);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(38, 44, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("observacion:");
		lblNewLabel.setBounds(24, 69, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Id tipo de transporte");
		lblNewLabel_2.setBounds(10, 97, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		txtIdTipoTransporte = new JTextField();
		txtIdTipoTransporte.setBounds(129, 94, 86, 20);
		contentPane.add(txtIdTipoTransporte);
		txtIdTipoTransporte.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoTransporte tipotransporte = new TipoTransporte();
				
				tipotransporte.delete(Integer.parseInt(txtIdTipoTransporte.getText()));
				
				txtIdTipoTransporte.setText("");
				
			}
			
		});
		btnEliminar.setBounds(295, 88, 93, 33);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoTransporte tipotransporte = new TipoTransporte();
				tipotransporte.readOne(Integer.parseInt(txtIdTipoTransporte.getText()), txtNombre, txtObservacion);
				
			}
		});
		btnConsultar.setBounds(299, 132, 96, 33);
		contentPane.add(btnConsultar);
	}
}
