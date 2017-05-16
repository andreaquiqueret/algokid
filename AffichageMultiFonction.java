import java.awt.Color;
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

public class AffichageMultiFonction extends JPanel
{
	private int epaisseur;
	private int espaceGauche;
	private int espaceHaut;
	private int tailleRect;
	private int pos;
	private ArrayList<PointImage> lesPoints;
	private Color couleur;
	private BufferedImage image;
	
	public AffichageMultiFonction(String path) throws IOException
	{
		lesPoints = new ArrayList<PointImage>();
		epaisseur = 30;
		espaceGauche = 80;
		espaceHaut = 8;
		tailleRect = 325;
		couleur = new Color(204, 42, 88);
		image = ImageIO.read(new File(path + "fonction.png"));
		initPoints();
		
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
	
	public void initPoints()
	{
		for(int i = 0; i < 6; i++)
		{
			lesPoints.add(new PointImage(new Point(espaceGauche + 10 + (60 * i), espaceHaut + 4), null));
		}
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
		
		dessineImage(g);
	}
	
	private void dessineImage(Graphics g) 
	{
		for(PointImage p : lesPoints)
		{
			if(p.getImg() != null)
			{
				g.drawImage(p.getImg(), p.getX() - 12, p.getY() - 12, null);
			}
		}
	}
	
	private void donnerPosition(MouseEvent e) 
	{
		boolean trouver = false;
		int i = 0;
		
		while(trouver == false && i < lesPoints.size())
		{
			PointImage p = lesPoints.get(i);
			if((e.getY() >= p.getY() && e.getY() <= p.getY() + (epaisseur - 10)) && (e.getX() >= p.getX() && e.getX() <= p.getX() + (epaisseur - 10)))
			{
				trouver = true;
				AffichageTablette.estFonction = true;
			}
			else
			{
				i++;
			}
		}
		
		if(trouver)
		{
			pos= i+1;
		}
		System.out.println(i+1);
			pos= -1;
	}
	
	public void addPoint(BufferedImage img)
	{
		boolean trouver = false;
		int i = 0;
		
		while(!trouver && i < lesPoints.size())
		{
			PointImage p = lesPoints.get(i);
			
			if(p.getImg() == null)
			{
				p.setImg(img);
				trouver = true;
			}
			else
			{
				i++;
			}
		}
		repaint();
		validate();
		
	}
}
