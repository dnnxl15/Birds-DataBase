import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class PanelRegister extends JPanel
{
	private JTextField tfScientificName;
	private JTextField tfName;
	private JTextField tfSize;
	private JTextField tfColor;
	private JTextField tfDistrict;
	private JTextField tfCity;
	private JTextField textField;
	private JTextField tfOrder;
	private JTextField tfSuborder;
	private JTextField tfFamily;
	private JTextField tfSpecie;
	private JTextField tfGender;
	private JFileChooser fcImage;
	private String rute;
	/**
	 * Create the panel.
	 */
	public PanelRegister() 
	{
		fcImage = new JFileChooser();
		setBackground(new Color(92, 212, 195));
		setLayout(null);
		
		JLabel lblScientificName = new JLabel("SCIENTIFIC NAME");
		lblScientificName.setForeground(new Color(255, 255, 255));
		lblScientificName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblScientificName.setBounds(42, 83, 149, 46);
		add(lblScientificName);
		
		JLabel label_1 = new JLabel("Register your birds");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		label_1.setBounds(32, 24, 318, 46);
		add(label_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblName.setBounds(246, 83, 149, 46);
		add(lblName);
		
		tfScientificName = new JTextField();
		tfScientificName.setForeground(Color.WHITE);
		tfScientificName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfScientificName.setColumns(10);
		tfScientificName.setBorder(null);
		tfScientificName.setBackground(new Color(92, 212, 195));
		tfScientificName.setBounds(52, 136, 139, 22);
		add(tfScientificName);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(42, 171, 149, 2);
		add(separator);
		
		tfName = new JTextField();
		tfName.setForeground(Color.WHITE);
		tfName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfName.setColumns(10);
		tfName.setBorder(null);
		tfName.setBackground(new Color(92, 212, 195));
		tfName.setBounds(246, 142, 139, 22);
		add(tfName);
		
		JLabel lblSize = new JLabel("SIZE");
		lblSize.setForeground(Color.WHITE);
		lblSize.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSize.setBounds(42, 197, 149, 46);
		add(lblSize);
		
		tfSize = new JTextField();
		tfSize.setForeground(Color.WHITE);
		tfSize.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfSize.setColumns(10);
		tfSize.setBorder(null);
		tfSize.setBackground(new Color(92, 212, 195));
		tfSize.setBounds(42, 246, 139, 22);
		add(tfSize);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(42, 281, 149, 2);
		add(separator_2);
		
		JLabel lblColor = new JLabel("COLOR");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblColor.setBounds(246, 197, 149, 46);
		add(lblColor);
		
		tfColor = new JTextField();
		tfColor.setForeground(Color.WHITE);
		tfColor.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfColor.setColumns(10);
		tfColor.setBorder(null);
		tfColor.setBackground(new Color(92, 212, 195));
		tfColor.setBounds(246, 246, 139, 22);
		add(tfColor);
		
		JLabel lblPhoto = new JLabel("PHOTO");
		lblPhoto.setForeground(Color.WHITE);
		lblPhoto.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblPhoto.setBounds(474, 59, 87, 46);
		add(lblPhoto);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(474, 142, 172, 2);
		add(separator_4);
		
		JButton btnSelectPhoto = new JButton("Select");
		btnSelectPhoto.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int result = fcImage.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION)
				{
					File objectFile;
					objectFile = fcImage.getSelectedFile();
					rute = objectFile.toString();
				}
				else
				{
					rute = "";
				}
			}
		});
		btnSelectPhoto.setBounds(549, 72, 97, 25);
		add(btnSelectPhoto);
		
		JLabel lblEndanger = new JLabel("ENDANGER");
		lblEndanger.setForeground(Color.WHITE);
		lblEndanger.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblEndanger.setBounds(246, 450, 97, 46);
		add(lblEndanger);
		
		JComboBox cbEndanger = new JComboBox();
		cbEndanger.setBounds(355, 465, 72, 21);
		cbEndanger.addItem("Extinct");
		cbEndanger.addItem("Endanger");
		add(cbEndanger);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblDescription.setBounds(486, 358, 149, 46);
		add(lblDescription);
		
		JTextPane tpDescription = new JTextPane();
		tpDescription.setBounds(486, 403, 340, 65);
		add(tpDescription);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(486, 481, 340, 2);
		add(separator_6);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnRegister.setBackground(new Color(36, 47, 65));
		btnRegister.setBounds(747, 496, 110, 46);
		add(btnRegister);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(246, 171, 149, 2);
		add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(246, 281, 149, 2);
		add(separator_3);
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblLocation.setBounds(42, 298, 149, 46);
		add(lblLocation);
		
		tfDistrict = new JTextField();
		tfDistrict.setForeground(Color.WHITE);
		tfDistrict.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfDistrict.setColumns(10);
		tfDistrict.setBorder(null);
		tfDistrict.setBackground(new Color(92, 212, 195));
		tfDistrict.setBounds(42, 390, 139, 22);
		add(tfDistrict);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBounds(42, 425, 149, 2);
		add(separator_7);
		
		tfCity = new JTextField();
		tfCity.setForeground(Color.WHITE);
		tfCity.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfCity.setColumns(10);
		tfCity.setBorder(null);
		tfCity.setBackground(new Color(92, 212, 195));
		tfCity.setBounds(246, 390, 139, 22);
		add(tfCity);
		
		JLabel lblDistrict = new JLabel("District");
		lblDistrict.setForeground(Color.WHITE);
		lblDistrict.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblDistrict.setBounds(42, 345, 149, 46);
		add(lblDistrict);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.WHITE);
		separator_8.setBounds(246, 422, 149, 2);
		add(separator_8);
		
		JLabel lblProvincie = new JLabel("City");
		lblProvincie.setForeground(Color.WHITE);
		lblProvincie.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblProvincie.setBounds(246, 345, 149, 46);
		add(lblProvincie);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblCountry.setBounds(42, 440, 149, 46);
		add(lblCountry);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(92, 212, 195));
		textField.setBounds(42, 488, 139, 22);
		add(textField);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.WHITE);
		separator_9.setBounds(42, 520, 149, 2);
		add(separator_9);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(685, 142, 172, 2);
		add(separator_5);
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setForeground(Color.WHITE);
		lblOrder.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblOrder.setBounds(474, 157, 87, 46);
		add(lblOrder);
		
		tfOrder = new JTextField();
		tfOrder.setForeground(Color.WHITE);
		tfOrder.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfOrder.setColumns(10);
		tfOrder.setBorder(null);
		tfOrder.setBackground(new Color(92, 212, 195));
		tfOrder.setBounds(474, 211, 139, 22);
		add(tfOrder);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.WHITE);
		separator_10.setBounds(474, 246, 149, 2);
		add(separator_10);
		
		JLabel lblSpecie = new JLabel("SUBORDER");
		lblSpecie.setForeground(Color.WHITE);
		lblSpecie.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSpecie.setBounds(682, 157, 87, 46);
		add(lblSpecie);
		
		JLabel lblFamily = new JLabel("FAMILY");
		lblFamily.setForeground(Color.WHITE);
		lblFamily.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblFamily.setBounds(474, 260, 87, 46);
		add(lblFamily);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.WHITE);
		separator_11.setBounds(682, 246, 149, 2);
		add(separator_11);
		
		tfSuborder = new JTextField();
		tfSuborder.setForeground(Color.WHITE);
		tfSuborder.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfSuborder.setColumns(10);
		tfSuborder.setBorder(null);
		tfSuborder.setBackground(new Color(92, 212, 195));
		tfSuborder.setBounds(682, 211, 139, 22);
		add(tfSuborder);
		
		tfFamily = new JTextField();
		tfFamily.setForeground(Color.WHITE);
		tfFamily.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfFamily.setColumns(10);
		tfFamily.setBorder(null);
		tfFamily.setBackground(new Color(92, 212, 195));
		tfFamily.setBounds(474, 312, 139, 22);
		add(tfFamily);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(Color.WHITE);
		separator_12.setBounds(474, 343, 149, 2);
		add(separator_12);
		
		JLabel lblSpecie_1 = new JLabel("SPECIE");
		lblSpecie_1.setForeground(Color.WHITE);
		lblSpecie_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblSpecie_1.setBounds(682, 260, 87, 46);
		add(lblSpecie_1);
		
		tfSpecie = new JTextField();
		tfSpecie.setForeground(Color.WHITE);
		tfSpecie.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfSpecie.setColumns(10);
		tfSpecie.setBorder(null);
		tfSpecie.setBackground(new Color(92, 212, 195));
		tfSpecie.setBounds(682, 312, 139, 22);
		add(tfSpecie);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setForeground(Color.WHITE);
		separator_13.setBounds(682, 342, 149, 2);
		add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setForeground(Color.WHITE);
		separator_14.setBounds(243, 520, 172, 2);
		add(separator_14);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblGender.setBounds(685, 59, 87, 46);
		add(lblGender);
		
		tfGender = new JTextField();
		tfGender.setForeground(Color.WHITE);
		tfGender.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		tfGender.setColumns(10);
		tfGender.setBorder(null);
		tfGender.setBackground(new Color(92, 212, 195));
		tfGender.setBounds(685, 107, 139, 22);
		add(tfGender);
	}
}