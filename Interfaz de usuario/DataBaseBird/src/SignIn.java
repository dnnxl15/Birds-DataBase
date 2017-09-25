import java.awt.BorderLayout;
import java.util.Calendar;
import org.jdesktop.swingx.JXDatePicker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JPasswordField pfPassword;
	private JTextField tfName;
	private JTextField tfUsername;
	private JPasswordField pfPasswordConfirm;
	private JTextField tfEmail;
	private JTextField tfCountry;
	private JTextField tfLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(36, 47, 65));
		panel.setBounds(0, 0, 466, 672);
		contentPane.add(panel);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setForeground(Color.WHITE);
		lblSignIn.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblSignIn.setBounds(171, 51, 112, 46);
		panel.add(lblSignIn);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblName.setBounds(42, 133, 137, 46);
		panel.add(lblName);
		
		JLabel label_2 = new JLabel("PASSWORD");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		label_2.setBounds(42, 362, 137, 46);
		panel.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(42, 224, 160, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(42, 449, 318, 2);
		panel.add(separator_1);
		
		pfPassword = new JPasswordField();
		pfPassword.setForeground(Color.WHITE);
		pfPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		pfPassword.setBorder(null);
		pfPassword.setBackground(new Color(36, 47, 65));
		pfPassword.setBounds(42, 411, 318, 22);
		panel.add(pfPassword);
		
		tfName = new JTextField();
		tfName.setForeground(Color.WHITE);
		tfName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfName.setColumns(10);
		tfName.setBorder(null);
		tfName.setBackground(new Color(36, 47, 65));
		tfName.setBounds(42, 192, 160, 22);
		panel.add(tfName);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblUsername.setBounds(42, 249, 137, 46);
		panel.add(lblUsername);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(42, 336, 318, 2);
		panel.add(separator_2);
		
		tfUsername = new JTextField();
		tfUsername.setForeground(Color.WHITE);
		tfUsername.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfUsername.setColumns(10);
		tfUsername.setBorder(null);
		tfUsername.setBackground(new Color(36, 47, 65));
		tfUsername.setBounds(42, 301, 318, 22);
		panel.add(tfUsername);
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblConfirmPassword.setBounds(42, 470, 180, 46);
		panel.add(lblConfirmPassword);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(42, 571, 318, 2);
		panel.add(separator_3);
		
		pfPasswordConfirm = new JPasswordField();
		pfPasswordConfirm.setForeground(Color.WHITE);
		pfPasswordConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		pfPasswordConfirm.setBorder(null);
		pfPasswordConfirm.setBackground(new Color(36, 47, 65));
		pfPasswordConfirm.setBounds(42, 536, 318, 22);
		panel.add(pfPasswordConfirm);
		
		JLabel lblLastname = new JLabel("LASTNAME");
		lblLastname.setForeground(Color.WHITE);
		lblLastname.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblLastname.setBounds(258, 133, 137, 46);
		panel.add(lblLastname);
		
		tfLastName = new JTextField();
		tfLastName.setForeground(Color.WHITE);
		tfLastName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfLastName.setColumns(10);
		tfLastName.setBorder(null);
		tfLastName.setBackground(new Color(36, 47, 65));
		tfLastName.setBounds(258, 192, 160, 22);
		panel.add(tfLastName);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.WHITE);
		separator_9.setBounds(258, 224, 160, 2);
		panel.add(separator_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(92, 212, 195));
		panel_1.setBounds(467, 0, 457, 672);
		contentPane.add(panel_1);
		
		JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        picker.setBounds(257, 495, 97, 34);
        panel_1.add(picker);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setBounds(173, 585, 151, 62);
		panel_1.add(btnSignIn);
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnSignIn.setBackground(new Color(36, 47, 65));
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblEmail.setBounds(37, 29, 137, 46);
		panel_1.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.WHITE);
		tfEmail.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfEmail.setColumns(10);
		tfEmail.setBorder(null);
		tfEmail.setBackground(new Color(92, 212, 195));
		tfEmail.setBounds(36, 88, 318, 22);
		panel_1.add(tfEmail);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(37, 123, 318, 2);
		panel_1.add(separator_4);
		
		JLabel lblCountry = new JLabel("COUNTRY");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblCountry.setBounds(37, 160, 137, 46);
		panel_1.add(lblCountry);
		
		tfCountry = new JTextField();
		tfCountry.setForeground(Color.WHITE);
		tfCountry.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfCountry.setColumns(10);
		tfCountry.setBorder(null);
		tfCountry.setBackground(new Color(92, 212, 195));
		tfCountry.setBounds(36, 214, 318, 22);
		panel_1.add(tfCountry);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(36, 252, 318, 2);
		panel_1.add(separator_5);
		
		JComboBox cbGender = new JComboBox();
		cbGender.setBounds(252, 304, 102, 22);
		cbGender.addItem("Male");
		cbGender.addItem("Female");
		panel_1.add(cbGender);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(37, 358, 318, 2);
		panel_1.add(separator_6);
		
		JLabel label = new JLabel("GENDER");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		label.setBounds(37, 293, 137, 46);
		panel_1.add(label);
		
		JLabel lblProfession = new JLabel("PROFESSION");
		lblProfession.setForeground(Color.WHITE);
		lblProfession.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblProfession.setBounds(37, 391, 137, 46);
		panel_1.add(lblProfession);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBounds(37, 450, 318, 2);
		panel_1.add(separator_7);
		
		JComboBox cbProfession = new JComboBox();
		cbProfession.setBounds(252, 405, 102, 22);
		cbProfession.addItem("Ornithologist");
		cbProfession.addItem("Amateur");
		cbProfession.addItem("Administrator");
		panel_1.add(cbProfession);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblDateOfBirth.setBounds(37, 487, 137, 46);
		panel_1.add(lblDateOfBirth);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.WHITE);
		separator_8.setBounds(36, 551, 318, 2);
		panel_1.add(separator_8);
	}
}
