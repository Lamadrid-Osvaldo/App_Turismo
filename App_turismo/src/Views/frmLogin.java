package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Promotor;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmLogin extends JFrame {
	
	Promotor promotor = new Promotor();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField pswPass;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login");
		setBounds(100, 100, 482, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(174, 41, 125, 28);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		pswPass = new JPasswordField();
		pswPass.setBounds(174, 96, 125, 28);
		contentPane.add(pswPass);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(61, 48, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(61, 99, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				promotor.controlAcceso(Integer.parseInt(txtUser.getText()), pswPass.getText());
				dispose();
				
			}
		});
		btnIngresar.setBounds(174, 164, 137, 52);
		contentPane.add(btnIngresar);
	} 
}
