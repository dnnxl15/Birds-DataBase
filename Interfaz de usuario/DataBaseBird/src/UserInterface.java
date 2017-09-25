import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInterface {

	private JFrame frmBirddatabase;
	private JPasswordField pfPassword;
	private JTextField tfUserName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frmBirddatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBirddatabase = new JFrame();
		frmBirddatabase.setTitle("BirdDataBase");
		frmBirddatabase.setBounds(100, 100, 942, 697);
		frmBirddatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBirddatabase.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(92, 212, 195));
		panel.setBounds(0, 0, 454, 650);
		frmBirddatabase.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCreateYourAccount = new JLabel("Create your account");
		lblCreateYourAccount.setForeground(Color.WHITE);
		lblCreateYourAccount.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblCreateYourAccount.setBounds(63, 345, 318, 46);
		panel.add(lblCreateYourAccount);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnSignIn.setBackground(new Color(36, 47, 65));
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setBounds(135, 435, 151, 62);
		panel.add(btnSignIn);
		
		JLabel lblRegisterYourBirds = new JLabel("Register your birds");
		lblRegisterYourBirds.setForeground(Color.WHITE);
		lblRegisterYourBirds.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblRegisterYourBirds.setBounds(77, 225, 318, 46);
		panel.add(lblRegisterYourBirds);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(36, 47, 65));
		panel_1.setBounds(451, 0, 481, 650);
		frmBirddatabase.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSignInOr = new JLabel("Sign up");
		lblSignInOr.setBounds(171, 51, 112, 46);
		panel_1.add(lblSignInOr);
		lblSignInOr.setForeground(new Color(255, 255, 255));
		lblSignInOr.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblUsername.setBounds(42, 186, 137, 46);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblPassword.setBounds(42, 350, 137, 46);
		panel_1.add(lblPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(42, 305, 318, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(42, 449, 318, 2);
		panel_1.add(separator_1);
		
		pfPassword = new JPasswordField();
		pfPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		pfPassword.setBorder(null);
		pfPassword.setBackground(new Color(36, 47, 65));
		pfPassword.setForeground(new Color(255, 255, 255));
		pfPassword.setBounds(42, 411, 318, 22);
		panel_1.add(pfPassword);
		
		tfUserName = new JTextField();
		tfUserName.setForeground(new Color(255, 255, 255));
		tfUserName.setBorder(null);
		tfUserName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfUserName.setBackground(new Color(36, 47, 65));
		tfUserName.setBounds(42, 270, 318, 22);
		panel_1.add(tfUserName);
		tfUserName.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBackground(new Color(92, 212, 195));
		btnSignUp.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setBounds(171, 549, 151, 62);
		panel_1.add(btnSignUp);
		
		JButton btnForgotPassword = new JButton("Forgot your password");
		btnForgotPassword.setBorderPainted(false);
		btnForgotPassword.setHorizontalAlignment(SwingConstants.LEFT);
		btnForgotPassword.setBackground(new Color(36, 47, 65));
		btnForgotPassword.setForeground(new Color(255, 255, 255));
		btnForgotPassword.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnForgotPassword.setBounds(29, 464, 217, 25);
		panel_1.add(btnForgotPassword);
	}
}
