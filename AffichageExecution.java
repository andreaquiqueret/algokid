import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AffichageExecution extends JPanel
{
	private BufferedImage play;
	private BufferedImage stop;
	private int tailleImage;
	private int espaceGauche;
	private int espaceHaut;
	private ArrayList<Point> lesFleches;
	
	public AffichageExecution(String path) throws IOException
	{
		play = ImageIO.read(new File(path + "play.png"));
		stop = ImageIO.read(new File(path + "stop.png"));
		lesFleches = new ArrayList<Point>();
		tailleImage = 45;
		espaceGauche = 160;
		espaceHaut = 10;
		
		MouseListener ml = new MouseListener() {
			  public void mouseClicked(MouseEvent e) {
				donnerPosition(e);
			  }
			public void mouseEntered(MouseEvent e) {
			  }
			  public void mouseExited(MouseEvent e) {
			  }
			  public void mousePressed(MouseEvent e) {
			  }
			  public void mouseReleased(MouseEvent e) {
			  }
		};
		  
		this.addMouseListener(ml);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(play, espaceGauche, espaceHaut, null);
		lesFleches.add(new Point(espaceGauche, espaceHaut));
		
		g.drawImage(stop, espaceGauche + tailleImage + 5, espaceHaut, null);
		lesFleches.add(new Point(espaceGauche + tailleImage + 5, espaceHaut));
	}
	
	private void donnerPosition(MouseEvent e) 
	{
		boolean trouver = false;
		int i = 0;
		
		while(trouver == false && i < lesFleches.size())
		{
			Point p = lesFleches.get(i);
			if((e.getY() >= p.getY() && e.getY() <= p.getY() + tailleImage) && (e.getX() >= p.getX() && e.getX() <= p.getX() + tailleImage))
			{
				trouver = true;
			}
			else
			{
				i++;
			}
		}
		
		if(trouver)
		{
			switch(i)
			{
				case 0: System.out.println("play");
					break;
				case 1: System.out.println("stop");
			}
		}
	}
}
