import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelConsult extends JPanel 
{
	/**
	 * Create the panel.
	 */
	public PanelConsult() 
	{
		setBackground(new Color(92, 212, 195));
		setLayout(null);
		JLabel lblConsult = new JLabel("Consult");
		lblConsult.setForeground(Color.WHITE);
		lblConsult.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblConsult.setBounds(23, 27, 318, 46);
		add(lblConsult);
	}
}