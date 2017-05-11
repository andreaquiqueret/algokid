import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AffichageMultiFonction extends JPanel
{
	private int epaisseur;
	private int espaceGauche;
	private int espaceHaut;
	private int tailleRect;
	private Color couleur;
	private BufferedImage image;
	
	public AffichageMultiFonction(String path) throws IOException
	{
		epaisseur = 30;
		espaceGauche = 80;
		espaceHaut = 8;
		tailleRect = 325;
		couleur = new Color(204, 42, 88);
		image = ImageIO.read(new File(path + "fonction.png"));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.drawImage(image, espaceGauche - 50, 0, null); 
		
		g.setColor(couleur);
		g.fillOval(espaceGauche + tailleRect - 19, espaceHaut - 1, epaisseur, epaisseur);
		g.fillRect(espaceGauche, espaceHaut, tailleRect, epaisseur - 1);
		
		for(int i = 0; i < 6; i++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(espaceGauche + 10 + (60 * i), espaceHaut + 4, epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(espaceGauche + 10 + (60 * i), espaceHaut + 4, epaisseur - 10, epaisseur - 10);
			g.drawString(String.valueOf(i + 1), espaceGauche + 17 + (60 * i), espaceHaut + 18);
		}
	}
}
