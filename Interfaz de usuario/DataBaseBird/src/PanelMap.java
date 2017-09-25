import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelMap extends JPanel 
{
	/**
	 * Create the panel.
	 */
	public PanelMap() 
	{
		setBackground(new Color(92, 212, 195));
		setLayout(null);
		JLabel lblMap = new JLabel("Map");
		lblMap.setForeground(Color.WHITE);
		lblMap.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblMap.setBounds(23, 37, 318, 46);
		add(lblMap);
	}
}