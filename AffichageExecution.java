import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AffichageExecution extends JPanel
{
	private BufferedImage play;
	private BufferedImage stop;
	private int tailleImage;
	private int espaceGauche;
	private int espaceHaut;
	
	public AffichageExecution() throws IOException
	{
		play = ImageIO.read(new File("./src/images/play.png"));
		stop = ImageIO.read(new File("./src/images/stop.png"));
		tailleImage = 45;
		espaceGauche = 160;
		espaceHaut = 10;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(play, espaceGauche, espaceHaut, null);
		g.drawImage(stop, espaceGauche + tailleImage + 5, espaceHaut, null);
	}
}
