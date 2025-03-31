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
		setTitle("medio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(53, 44, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("observaciones");
		lblNewLabel_1.setBounds(53, 107, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id Tipo Medios");
		lblNewLabel_2.setBounds(53, 169, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(133, 41, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(151, 104, 86, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		txtIdTipoMedios = new JTextField();
		txtIdTipoMedios.setBounds(151, 166, 86, 20);
		contentPane.add(txtIdTipoMedios);
		txtIdTipoMedios.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medio medio = new Medio();
				
				medio.create(txtNombre.getText(), txtObservaciones.getText(), Integer.parseInt(txtIdTipoMedios.getText()));
				
				
			}
		});
		btnGuardar.setBounds(336, 129, 121, 54);
		contentPane.add(btnGuardar);
		
		
	}
}
