

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class AffichageTablette extends JPanel
{
	public AffichageTablette()
	{
		setLayout(new GridLayout(1, 4));
		add(new Serpentin());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
}
