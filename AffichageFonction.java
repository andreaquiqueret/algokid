import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AffichageFonction extends JPanel
{
	private BufferedImage haut;
	private BufferedImage bas;
	private BufferedImage gauche;
	private BufferedImage droite;
	private BufferedImage multi;
	private int tailleImage;
	private int espaceGauche;
	private int espaceHaut;
	
	public AffichageFonction() throws IOException
	{
		haut = ImageIO.read(new File("./src/images/haut.png"));
		bas = ImageIO.read(new File("./src/images/bas.png"));
		gauche = ImageIO.read(new File("./src/images/gauche.png"));
		droite = ImageIO.read(new File("./src/images/droite.png"));
		multi = ImageIO.read(new File("./src/images/fonction.png"));
		tailleImage = 45;
		espaceGauche = 100;
		espaceHaut = 10;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(gauche, espaceGauche, espaceHaut, null);
		g.drawImage(droite, espaceGauche + tailleImage + 5, espaceHaut, null);
		g.drawImage(haut, espaceGauche + ((tailleImage + 5) * 2), espaceHaut, null);
		g.drawImage(bas, espaceGauche + ((tailleImage + 5) * 3), espaceHaut, null);
		g.drawImage(multi, espaceGauche + ((tailleImage + 5) * 4), espaceHaut, null);
	}
}
