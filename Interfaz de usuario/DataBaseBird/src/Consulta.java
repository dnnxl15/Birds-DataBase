import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

public class Consulta extends JFrame 
{
	private JPanel contentPane;
	private JPanel panel_2;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 47, 65));
		panel.setBounds(0, 182, 63, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRegister = new JButton("");
		btnRegister.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Panel objectPanel = new Panel();
				objectPanel.changePanel(panel_3, new PanelRegister());
			}
		});
		btnRegister.setIcon(new ImageIcon(Consulta.class.getResource("/Images/book-and-pen.png")));
		btnRegister.setBounds(12, 104, 32, 35);
		btnRegister.setBorderPainted(false);
		btnRegister.setBackground(new Color(36, 47, 65));
		panel.add(btnRegister);
		
		JButton btnMore = new JButton("");
		btnMore.setBounds(12, 13, 32, 28);
		panel.add(btnMore);
		btnMore.setBackground(new Color(36, 47, 65));
		btnMore.setIcon(new ImageIcon(Consulta.class.getResource("/Images/menu-button-of-three-horizontal-lines.png")));
		btnMore.setBorderPainted(false);
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				int posicion = panel_2.getX();
				if(posicion>-1)
				{
					Animacion.Animacion.mover_izquierda(50, -87, 5, 2, panel_2);
				}
				else
				{
					Animacion.Animacion.mover_derecha(-87, 50, 5, 2, panel_2);
				}
			}
		});
		
		JButton btnConsult = new JButton("");
		btnConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Panel objectPanel = new Panel();
				objectPanel.changePanel(panel_3, new PanelConsult());
			}
		});
		btnConsult.setIcon(new ImageIcon(Consulta.class.getResource("/Images/musica-searcher.png")));
		btnConsult.setBorderPainted(false);
		btnConsult.setBackground(new Color(36, 47, 65));
		btnConsult.setBounds(12, 170, 32, 35);
		panel.add(btnConsult);
		
		JButton btnCatalogue = new JButton("");
		btnCatalogue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Panel objectPanel = new Panel();
				objectPanel.changePanel(panel_3, new PanelCatalogue());
			}
		});
		btnCatalogue.setIcon(new ImageIcon(Consulta.class.getResource("/Images/open-book.png")));
		btnCatalogue.setBorderPainted(false);
		btnCatalogue.setBackground(new Color(36, 47, 65));
		btnCatalogue.setBounds(12, 236, 32, 35);
		panel.add(btnCatalogue);
		
		JButton btnMap = new JButton("");
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Panel objectPanel = new Panel();
				objectPanel.changePanel(panel_3, new PanelMap());
			}
		});
		btnMap.setIcon(new ImageIcon(Consulta.class.getResource("/Images/placeholder-on-map-paper-in-perspective.png")));
		btnMap.setBorderPainted(false);
		btnMap.setBackground(new Color(36, 47, 65));
		btnMap.setBounds(12, 301, 32, 35);
		panel.add(btnMap);
		
		JButton btnKey = new JButton("");
		btnKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Panel objectPanel = new Panel();
				objectPanel.changePanel(panel_3, new PanelSecurity());
			}
		});
		btnKey.setIcon(new ImageIcon(Consulta.class.getResource("/Images/key.png")));
		btnKey.setBorderPainted(false);
		btnKey.setBackground(new Color(36, 47, 65));
		btnKey.setBounds(12, 364, 32, 35);
		panel.add(btnKey);
		
		JButton btnOut = new JButton("");
		btnOut.setIcon(new ImageIcon(Consulta.class.getResource("/Images/shut-down-icon.png")));
		btnOut.setBorderPainted(false);
		btnOut.setBackground(new Color(36, 47, 65));
		btnOut.setBounds(12, 426, 32, 35);
		panel.add(btnOut);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(36, 47, 65));
		panel_2.setBounds(-87, 127, 150, 545);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblRegister.setBounds(31, 154, 80, 46);
		panel_2.add(lblRegister);
		
		JLabel lblConsult = new JLabel("CONSULT");
		lblConsult.setForeground(Color.WHITE);
		lblConsult.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblConsult.setBounds(31, 219, 80, 46);
		panel_2.add(lblConsult);
		
		JLabel lblCatalogue = new JLabel("CATALOGUE");
		lblCatalogue.setForeground(Color.WHITE);
		lblCatalogue.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblCatalogue.setBounds(22, 276, 102, 46);
		panel_2.add(lblCatalogue);
		
		JLabel lblMap = new JLabel("MAP");
		lblMap.setForeground(Color.WHITE);
		lblMap.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblMap.setBounds(50, 348, 42, 46);
		panel_2.add(lblMap);
		
		JLabel lblChangePassword = new JLabel("SECURITY");
		lblChangePassword.setForeground(Color.WHITE);
		lblChangePassword.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblChangePassword.setBounds(31, 417, 80, 46);
		panel_2.add(lblChangePassword);
		
		JLabel lblOut = new JLabel("SIGN OUT");
		lblOut.setForeground(Color.WHITE);
		lblOut.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblOut.setBounds(31, 477, 80, 46);
		panel_2.add(lblOut);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(22, 201, 102, 2);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(22, 263, 102, 2);
		panel_2.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(22, 333, 102, 2);
		panel_2.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(22, 392, 102, 2);
		panel_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(22, 461, 102, 2);
		panel_2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(22, 521, 102, 2);
		panel_2.add(separator_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(36, 47, 65));
		panel_1.setBounds(0, 0, 925, 186);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Panel objectPanel = new Panel();
				objectPanel.changePanel(panel_3, panel_3);
			}
		});
		btnHome.setIcon(new ImageIcon(Consulta.class.getResource("/Images/house-black-silhouette-without-door (1).png")));
		btnHome.setBorderPainted(false);
		btnHome.setBackground(new Color(36, 47, 65));
		btnHome.setBounds(29, 44, 70, 73);
		panel_1.add(btnHome);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(726, 60, 10, 73);
		panel_1.add(separator_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Consulta.class.getResource("/Images/man-user.png")));
		lblNewLabel.setBounds(749, 77, 40, 40);
		panel_1.add(lblNewLabel);
		
		JLabel lblUser = new JLabel("USER");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblUser.setBounds(801, 77, 112, 46);
		panel_1.add(lblUser);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(92, 212, 195));
		panel_3.setBounds(56, 182, 869, 555);
		contentPane.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
	}
}
