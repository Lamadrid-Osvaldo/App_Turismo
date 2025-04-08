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
	private JTextField txtCodigo;
	private JLabel lblNewLabel_13;
	private JButton btnEliminar;
	private JButton btnConsultar;
	private JButton btnActualizar;

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
		setTitle("Paquetes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdDestino = new JTextField();
		txtIdDestino.setBounds(214, 27, 123, 20);
		contentPane.add(txtIdDestino);
		txtIdDestino.setColumns(10);
		
		txtIdOrigen = new JTextField();
		txtIdOrigen.setColumns(10);
		txtIdOrigen.setBounds(519, 27, 107, 20);
		contentPane.add(txtIdOrigen);
		
		txtFechaventa = new JTextField();
		txtFechaventa.setColumns(10);
		txtFechaventa.setBounds(214, 65, 123, 20);
		contentPane.add(txtFechaventa);
		
		txtHoraventa = new JTextField();
		txtHoraventa.setColumns(10);
		txtHoraventa.setBounds(519, 65, 107, 20);
		contentPane.add(txtHoraventa);
		
		txtFechaejecucion = new JTextField();
		txtFechaejecucion.setColumns(10);
		txtFechaejecucion.setBounds(214, 102, 123, 20);
		contentPane.add(txtFechaejecucion);
		
		txtHorasalida = new JTextField();
		txtHorasalida.setColumns(10);
		txtHorasalida.setBounds(519, 96, 107, 20);
		contentPane.add(txtHorasalida);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);
		txtObservaciones.setBounds(214, 138, 123, 20);
		contentPane.add(txtObservaciones);
		
		txtIdclientes = new JTextField();
		txtIdclientes.setColumns(10);
		txtIdclientes.setBounds(519, 138, 107, 20);
		contentPane.add(txtIdclientes);
		
		txtIdagencia = new JTextField();
		txtIdagencia.setColumns(10);
		txtIdagencia.setBounds(214, 174, 123, 20);
		contentPane.add(txtIdagencia);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(519, 174, 107, 20);
		contentPane.add(txtMatricula);
		
		txtIdmedios = new JTextField();
		txtIdmedios.setColumns(10);
		txtIdmedios.setBounds(214, 211, 123, 20);
		contentPane.add(txtIdmedios);
		
		JLabel lblNewLabel = new JLabel("Id Destino");
		lblNewLabel.setBounds(68, 30, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id Origen");
		lblNewLabel_1.setBounds(437, 30, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIdpromotor = new JTextField();
		txtIdpromotor.setBounds(519, 211, 107, 20);
		contentPane.add(txtIdpromotor);
		txtIdpromotor.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(214, 253, 123, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Venta");
		lblNewLabel_2.setBounds(68, 68, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de venta");
		lblNewLabel_3.setBounds(423, 68, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de ejecucion");
		lblNewLabel_4.setBounds(68, 105, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hora de salida");
		lblNewLabel_5.setBounds(423, 99, 92, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Observaciones");
		lblNewLabel_6.setBounds(68, 141, 103, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Id Cliente");
		lblNewLabel_7.setBounds(423, 141, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Id Agencia");
		lblNewLabel_8.setBounds(68, 177, 72, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Matricula");
		lblNewLabel_9.setBounds(423, 177, 72, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Id Medios");
		lblNewLabel_10.setBounds(68, 214, 60, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Id Promotor");
		lblNewLabel_11.setBounds(423, 214, 72, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Precio");
		lblNewLabel_12.setBounds(68, 256, 46, 14);
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
				
				txtIdDestino.setText("");
				txtIdOrigen.setText("");
				txtFechaventa.setText("");
				txtHoraventa.setText("");
				txtFechaejecucion.setText("");
				txtHorasalida.setText("");
				txtObservaciones.setText("");
				txtIdclientes.setText("");
				txtIdagencia.setText("");
				txtMatricula.setText("");
				txtIdmedios.setText("");
				txtIdpromotor.setText("");
				txtPrecio.setText("");
				
				
			}
		});
		btnGuardar.setBounds(48, 349, 123, 52);
		contentPane.add(btnGuardar);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(519, 253, 107, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNewLabel_13 = new JLabel("Codigo de Paquete");
		lblNewLabel_13.setBounds(406, 256, 103, 14);
		contentPane.add(lblNewLabel_13);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paquete paquete = new Paquete();
				
				paquete.delete(Integer.parseInt(txtCodigo.getText()));
				
				txtCodigo.setText("");
				
			}
		});
		btnEliminar.setBounds(491, 349, 123, 52);
		contentPane.add(btnEliminar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paquete paquete = new Paquete();
				
				paquete.readOne(Integer.parseInt(txtCodigo.getText()) , txtIdDestino, txtIdOrigen, txtFechaventa, 
						txtHoraventa, txtFechaejecucion, txtHorasalida, txtObservaciones, txtIdclientes, txtIdagencia, 
						txtMatricula, txtIdmedios, txtIdpromotor, txtPrecio);
				
			}
		});
		btnConsultar.setBounds(334, 349, 123, 52);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paquete paquete = new Paquete();
				
				paquete.update(Integer.parseInt(txtCodigo.getText()),Integer.parseInt(txtIdDestino.getText()),Integer.parseInt(txtIdOrigen.getText()),
						txtFechaventa.getText(),txtHoraventa.getText(),txtFechaejecucion.getText(),txtHorasalida.getText(),
						txtObservaciones.getText(),Integer.parseInt(txtIdclientes.getText()),
						Integer.parseInt(txtIdagencia.getText()), txtMatricula.getText(),Integer.parseInt(txtIdmedios.getText()),
						Integer.parseInt(txtIdpromotor.getText()),txtPrecio.getText());
				
			}
		});
		btnActualizar.setBounds(192, 349, 132, 52);
		contentPane.add(btnActualizar);
	}
}
