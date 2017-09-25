import javax.swing.JPanel;

public class Panel
{
	private JPanel content;
	private JPanel container;
	
	public void changePanel(JPanel pContainer, JPanel pContent)
	{
		this.container = pContainer;
		this.content = pContent;
		this.container.removeAll();
		this.container.revalidate();
		this.container.repaint();
		
		this.container.add(this.content);
		this.container.revalidate();
		this.container.repaint();
	}
}