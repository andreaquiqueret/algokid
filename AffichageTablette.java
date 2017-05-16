import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JPanel;

public class AffichageTablette extends JPanel
{
	public static boolean estFonction; //vrai si contruit fonction sinon sur serpentin
	
	public AffichageTablette(Tablette t, Grille g) throws IOException
	{
		String path = "./src/images/";
		estFonction = false;
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 2.0;
		c.gridy = 0;
		Serpentin s = new Serpentin(0, t);
		add(s, c);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.5;
		c.gridy = 1;
		add(new AffichageMultiFonction(path), c);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.5;
		c.gridy = 2;
		add(new AffichageFonction(path, t, g, s), c);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.5;
		c.gridy = 3;
		add(new AffichageExecution(path, t), c);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
}
