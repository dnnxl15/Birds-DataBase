import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PanelSecurity extends JPanel {
	private JPasswordField pfOldPassword;
	private JPasswordField pfNewPassword;

	/**
	 * Create the panel.
	 */
	public PanelSecurity() {
		setBackground(new Color(92, 212, 195));
		setLayout(null);
		
		JLabel lblSecurity = new JLabel("Security");
		lblSecurity.setForeground(Color.WHITE);
		lblSecurity.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblSecurity.setBounds(24, 31, 318, 46);
		add(lblSecurity);
		
		JLabel lblChangeYourPassword = new JLabel("CHANGE YOUR PASSWORD");
		lblChangeYourPassword.setForeground(Color.WHITE);
		lblChangeYourPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblChangeYourPassword.setBounds(26, 128, 226, 46);
		add(lblChangeYourPassword);
		
		JLabel lblIntroduceYourOld = new JLabel("Introduce your old password");
		lblIntroduceYourOld.setForeground(Color.WHITE);
		lblIntroduceYourOld.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblIntroduceYourOld.setBounds(77, 202, 226, 46);
		add(lblIntroduceYourOld);
		
		pfOldPassword = new JPasswordField();
		pfOldPassword.setForeground(Color.WHITE);
		pfOldPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		pfOldPassword.setBorder(null);
		pfOldPassword.setBackground(new Color(92, 212, 195));
		pfOldPassword.setBounds(77, 251, 318, 22);
		add(pfOldPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(77, 286, 318, 2);
		add(separator);
		
		JLabel lblIntroduceYourNew = new JLabel("Introduce your new password");
		lblIntroduceYourNew.setForeground(Color.WHITE);
		lblIntroduceYourNew.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblIntroduceYourNew.setBounds(77, 317, 244, 46);
		add(lblIntroduceYourNew);
		
		pfNewPassword = new JPasswordField();
		pfNewPassword.setForeground(Color.WHITE);
		pfNewPassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		pfNewPassword.setBorder(null);
		pfNewPassword.setBackground(new Color(92, 212, 195));
		pfNewPassword.setBounds(77, 372, 318, 22);
		add(pfNewPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(77, 402, 318, 2);
		add(separator_1);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnConfirm.setBackground(new Color(36, 47, 65));
		btnConfirm.setBounds(300, 431, 110, 46);
		add(btnConfirm);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelSecurity.class.getResource("/Images/locked (3).png")));
		lblNewLabel.setBounds(534, 89, 244, 252);
		add(lblNewLabel);

	}
}
