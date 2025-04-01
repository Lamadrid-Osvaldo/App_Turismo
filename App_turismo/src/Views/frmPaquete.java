package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Paquete;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmPaquete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdDestino;
	private JTextField txtIdOrigen;
	private JTextField txtFechaventa;
	private JTextField txtHoraventa;
	private JTextField txtFechaejecucion;
	private JTextField txtHorasalida;
	private JTextField txtObservaciones;
	private JTextField txtIdclientes;
	private JTextField txtIdagencia;
	private JTextField txtMatricula;
	private JTextField txtIdmedios;
	private JTextField txtIdpromotor;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPaquete frame = new frmPaquete();
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
	public frmPaquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdDestino = new JTextField();
		txtIdDestino.setBounds(251, 27, 86, 20);
		contentPane.add(txtIdDestino);
		txtIdDestino.setColumns(10);
		
		txtIdOrigen = new JTextField();
		txtIdOrigen.setColumns(10);
		txtIdOrigen.setBounds(251, 58, 86, 20);
		contentPane.add(txtIdOrigen);
		
		txtFechaventa = new JTextField();
		txtFechaventa.setColumns(10);
		txtFechaventa.setBounds(251, 89, 86, 20);
		contentPane.add(txtFechaventa);
		
		txtHoraventa = new JTextField();
		txtHoraventa.setColumns(10);
		txtHoraventa.setBounds(251, 120, 86, 20);
		contentPane.add(txtHoraventa);
		
		txtFechaejecucion = new JTextField();
		txtFechaejecucion.setColumns(10);
		txtFechaejecucion.setBounds(251, 151, 86, 20);
		contentPane.add(txtFechaejecucion);
		
		txtHorasalida = new JTextField();
		txtHorasalida.setColumns(10);
		txtHorasalida.setBounds(251, 182, 86, 20);
		contentPane.add(txtHorasalida);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);
		txtObservaciones.setBounds(251, 213, 86, 20);
		contentPane.add(txtObservaciones);
		
		txtIdclientes = new JTextField();
		txtIdclientes.setColumns(10);
		txtIdclientes.setBounds(251, 248, 86, 20);
		contentPane.add(txtIdclientes);
		
		txtIdagencia = new JTextField();
		txtIdagencia.setColumns(10);
		txtIdagencia.setBounds(251, 282, 86, 20);
		contentPane.add(txtIdagencia);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(251, 313, 86, 20);
		contentPane.add(txtMatricula);
		
		txtIdmedios = new JTextField();
		txtIdmedios.setColumns(10);
		txtIdmedios.setBounds(251, 344, 86, 20);
		contentPane.add(txtIdmedios);
		
		JLabel lblNewLabel = new JLabel("id destino");
		lblNewLabel.setBounds(68, 30, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("idorigen");
		lblNewLabel_1.setBounds(68, 61, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIdpromotor = new JTextField();
		txtIdpromotor.setBounds(251, 375, 86, 20);
		contentPane.add(txtIdpromotor);
		txtIdpromotor.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(251, 406, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Venta");
		lblNewLabel_2.setBounds(68, 92, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de venta");
		lblNewLabel_3.setBounds(68, 123, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de ejecucion");
		lblNewLabel_4.setBounds(68, 154, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hora de salida");
		lblNewLabel_5.setBounds(68, 185, 92, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Observaciones");
		lblNewLabel_6.setBounds(68, 216, 103, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Id Cliente");
		lblNewLabel_7.setBounds(68, 251, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Id Agencia");
		lblNewLabel_8.setBounds(68, 285, 72, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Matricula");
		lblNewLabel_9.setBounds(68, 316, 72, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Id Medios");
		lblNewLabel_10.setBounds(68, 347, 60, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Id Promotor");
		lblNewLabel_11.setBounds(68, 378, 72, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Precio");
		lblNewLabel_12.setBounds(68, 409, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paquete paquete = new Paquete();
				paquete.create(Integer.parseInt(txtIdDestino.getText()),Integer.parseInt(txtIdOrigen.getText()),
						txtFechaventa.getText(),txtHoraventa.getText(),txtFechaejecucion.getText(),txtHorasalida.getText(),
						txtObservaciones.getText(),Integer.parseInt(txtIdclientes.getText()),
						Integer.parseInt(txtIdagencia.getText()), txtMatricula.getText(),Integer.parseInt(txtIdmedios.getText()),
						Integer.parseInt(txtIdpromotor.getText()),txtPrecio.getText());
				
				
			}
		});
		btnGuardar.setBounds(441, 119, 123, 52);
		contentPane.add(btnGuardar);
	}
}
