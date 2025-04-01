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

import model.TipoMedio;

public class frmTipoMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoMedio frame = new frmTipoMedio();
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
	public frmTipoMedio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(108, 74, 86, 20);
		contentPane.add(txtNombre);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(39, 77, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Observacion:");
		lblNewLabel_1_1.setBounds(39, 108, 74, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JTextField txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(108, 105, 86, 20);
		contentPane.add(txtObservacion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoMedio cr = new TipoMedio();
				cr.create(txtNombre.getText(), txtObservacion.getText());					
				
			}
		});
		btnGuardar.setBounds(237, 69, 108, 31);
		contentPane.add(btnGuardar);
		
		
	}

}
