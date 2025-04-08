package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Medio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
	private JTextField txtIdTipoMedios;
	private JTextField txtIdMedios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMedio frame = new frmMedio();
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
	public frmMedio() {
		setTitle("Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(45, 44, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Observaciones");
		lblNewLabel_1.setBounds(45, 87, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id Tipo Medios");
		lblNewLabel_2.setBounds(45, 126, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(151, 41, 105, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(151, 84, 105, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		txtIdTipoMedios = new JTextField();
		txtIdTipoMedios.setBounds(151, 123, 105, 20);
		contentPane.add(txtIdTipoMedios);
		txtIdTipoMedios.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medio medio = new Medio();
				
				medio.create(txtNombre.getText(), txtObservaciones.getText(), Integer.parseInt(txtIdTipoMedios.getText()));
				
				txtNombre.setText("");
				txtObservaciones.setText("");
				txtIdTipoMedios.setText("");
				
			}
		});
		btnGuardar.setBounds(339, 67, 121, 54);
		contentPane.add(btnGuardar);
		
		txtIdMedios = new JTextField();
		txtIdMedios.setBounds(151, 178, 105, 20);
		contentPane.add(txtIdMedios);
		txtIdMedios.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Id Medios");
		lblNewLabel_3.setBounds(45, 181, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medio medio = new Medio();
				
				medio.delete(Integer.parseInt(txtIdMedios.getText()));
				
				txtIdMedios.setText("");
				
			}
			
		});
		btnEliminar.setBounds(355, 247, 105, 48);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medio medio = new Medio();
				
				medio.readOne(Integer.parseInt(txtIdMedios.getText()), txtNombre, txtObservaciones, txtIdTipoMedios);
				
			}
		});
		btnConsultar.setBounds(349, 135, 113, 48);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medio medio = new Medio();
				
				medio.update(Integer.parseInt(txtIdMedios.getText()),txtNombre.getText(), txtObservaciones.getText(), 
						Integer.parseInt(txtIdTipoMedios.getText()) );
				
			}
		});
		btnActualizar.setBounds(355, 194, 105, 42);
		contentPane.add(btnActualizar);
		
		
	}
}
