package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		
		setTitle("Pricipal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencia = new JButton("Agencias");
		btnAgencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmAgencia agencia = new frmAgencia();
				
				agencia.show();
				
				
			}
		});
		btnAgencia.setBounds(47, 91, 127, 40);
		contentPane.add(btnAgencia);
		
		JButton btnTipoMedios = new JButton("Tipo Medios");
		btnTipoMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTipoMedio tipoMedios = new frmTipoMedio();
				
				tipoMedios.show();
				
			}
		});
		btnTipoMedios.setBounds(428, 91, 127, 40);
		contentPane.add(btnTipoMedios);
		
		JButton btnCliente = new JButton("Clientes");
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmCliente cliente = new frmCliente();
				
				cliente.show();
				
			}
		});
		btnCliente.setBounds(47, 191, 127, 40);
		contentPane.add(btnCliente);
		
		JButton btnPromotores = new JButton("Promotores");
		btnPromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPromotor promotores = new frmPromotor();
				
				promotores.show();
			}
		});
		btnPromotores.setBounds(240, 22, 135, 40);
		contentPane.add(btnPromotores);
		
		JButton btnMedios = new JButton("Medios");
		btnMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmMedio medios = new frmMedio();
				
				medios.show();
			}
		});
		btnMedios.setBounds(240, 289, 135, 40);
		contentPane.add(btnMedios);
		
		JButton btnTransporte = new JButton("Transportes");
		btnTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTransporte transportes = new frmTransporte();
				
				transportes.show();
				
			}
		});
		btnTransporte.setBounds(428, 191, 127, 40);
		contentPane.add(btnTransporte);
		
		JButton btnPaquetes = new JButton("Paquetes");
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPaquete paquetes = new frmPaquete();
				
				paquetes.show();
			}
		});
		btnPaquetes.setBounds(240, 191, 135, 40);
		contentPane.add(btnPaquetes);
		
		JButton btnOperadores = new JButton("Operadores");
		btnOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmOperador operadores = new frmOperador();
				
				operadores.show();
			}
			
		});
		btnOperadores.setBounds(240, 91, 135, 40);
		contentPane.add(btnOperadores);
		
		JButton btnCompania = new JButton("Compañia");
		btnCompania.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmCompania compania = new frmCompania();
				
				compania.show();
				
			}
		});
		btnCompania.setBounds(47, 289, 127, 40);
		contentPane.add(btnCompania);
		
		JButton btnTipoTransportes = new JButton("Tipo de Transportes");
		btnTipoTransportes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTipoTransporte tipoTransportes = new frmTipoTransporte();
				
				tipoTransportes.show();
				
			}
		});
		btnTipoTransportes.setBounds(428, 289, 135, 40);
		contentPane.add(btnTipoTransportes);
	}

}
