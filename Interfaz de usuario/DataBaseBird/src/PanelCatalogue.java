import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelCatalogue extends JPanel 
{
	/**
	 * Create the panel.
	 */
	public PanelCatalogue()
	{
		setBackground(new Color(92, 212, 195));
		setLayout(null);	
		JLabel lblCatalogue = new JLabel("Catalogue");
		lblCatalogue.setForeground(Color.WHITE);
		lblCatalogue.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblCatalogue.setBounds(22, 29, 318, 46);
		add(lblCatalogue);
	}
}