import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.awt.event.*;
import java.util.ArrayList;


public class Serpentin extends JPanel
{
	private BufferedImage img;
	private int tailleImage;
	private int epaisseur;
	private int espaceGauche;
	private int espaceHaut;
	private int tailleRect;
	private int tailleArc;
	private int tailleArcEfface;
	private Color couleurHaut;
	private Color couleurCentre;
	private Color couleurBas;
	private int nSerpentin;
	private ArrayList<Point> lesPoints;
	private int nbUtilise;
	
	public Serpentin(int n)
	{
		lesPoints = new ArrayList<Point>();
		nbUtilise = 0;
		tailleImage = 45;
		epaisseur = 30;
		espaceGauche = 10;
		tailleArc = 110;
		tailleArcEfface = 54;
		tailleRect = 270;
		espaceHaut = 10;
		couleurHaut = new Color(67, 87, 116);
		couleurCentre = new Color(53, 163, 169);
		couleurBas = new Color(251, 158, 32);
		nSerpentin=n;
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
		
		dessineSerpentin(g);
		dessinePoint(g);
		
	}
	
	public void dessinePoint(Graphics g)
	{
		int n = nSerpentin;
		int i;
		for(i = 0; i < 6; i++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(espaceGauche + 10 + (60 * i), espaceHaut + 4, epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(espaceGauche + 10 + (60 * i), espaceHaut + 4, epaisseur - 10, epaisseur - 10);
			lesPoints.add(new Point(espaceGauche + 10 + (60 * i), espaceHaut + 4));
			if(i+20*n>= 10)
			{
				g.drawString(String.valueOf(i+ 1+ 20*n), espaceGauche+(60 * i)+14, espaceHaut+18);
			}
			else
			{
				g.drawString(String.valueOf(i+1 +20*n), espaceGauche+ 17 + (60 * i), espaceHaut+18);
			}
			//g.drawString(String.valueOf(i + 1+20*n), espaceGauche + 17 + (60 * i), espaceHaut + 18);
		}
	
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 42 + (60 * 5), espaceHaut + (tailleArc / 2) - 10, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 42 + (60 * 5), espaceHaut + (tailleArc / 2) - 10, epaisseur - 10, epaisseur - 10);
		lesPoints.add(new Point(espaceGauche + 42 + (60 * 5), espaceHaut + (tailleArc / 2) - 10));
		if ((i + 1+20*n) < 10)
			g.drawString(String.valueOf(i + 1+20*n), espaceGauche + 49 + (60 * 5), espaceHaut + 5 + (tailleArc / 2));
		else
			g.drawString(String.valueOf(i + 1+20*n), espaceGauche + 45 + (60 * 5), espaceHaut + 5 + (tailleArc / 2));
		i++;
		
		for(int j=0 ; j < 5; j++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(epaisseur + espaceGauche + tailleRect + 10 - (60 * j), espaceHaut + epaisseur + tailleArcEfface, epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(epaisseur + espaceGauche + tailleRect + 10 - (60 * j), espaceHaut + epaisseur + tailleArcEfface, epaisseur - 10, epaisseur - 10);
			lesPoints.add(new Point(epaisseur + espaceGauche + tailleRect + 10 - (60 * j), espaceHaut + epaisseur + tailleArcEfface));
			i++;
			if(i+20*n>= 10)
			{
				g.drawString(String.valueOf(i+20*n), epaisseur + espaceGauche + tailleRect + 13 - (60 * j), espaceHaut + epaisseur + tailleArcEfface + 15);
			}
			else
			{
				g.drawString(String.valueOf(i +20*n), epaisseur + espaceGauche + tailleRect + 17 - (60 * j), espaceHaut + epaisseur + tailleArcEfface + 15);
			}
		}
		
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 15, espaceHaut + epaisseur + tailleArcEfface + 12, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 15, espaceHaut + epaisseur + tailleArcEfface + 12, epaisseur - 10, epaisseur - 10);
		lesPoints.add(new Point(espaceGauche + 15, espaceHaut + epaisseur + tailleArcEfface + 12));
		i++;
		g.drawString(String.valueOf(i+20*n), espaceGauche + 18, espaceHaut + epaisseur + tailleArcEfface + 26);
		
		g.setColor(Color.WHITE);
		i++;
		g.fillOval(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13, epaisseur - 10, epaisseur - 10);
		lesPoints.add(new Point(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13));
		g.drawString(String.valueOf(i+20*n), espaceGauche + 18,  espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 2);
		
		for(int j = 1; j < 6; j++)
		{
			i++;
			g.setColor(Color.WHITE);
			g.fillOval(espaceGauche + 10 + (60 * j), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2), epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(espaceGauche + 10 + (60 * j), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2), epaisseur - 10, epaisseur - 10);
			lesPoints.add(new Point(espaceGauche + 10 + (60 * j), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2)));
			g.drawString(String.valueOf(i + 20*n), espaceGauche + (60 * j) + 13, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 15);
		}
		
		i++;
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30, epaisseur - 10, epaisseur - 10);
		lesPoints.add(new Point(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30));
		g.drawString(String.valueOf(i + 20*n), espaceGauche + 45 + (60 * 5),  espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 45);
	}
	
	public void dessineSerpentin(Graphics g)
	{
		g.setColor(couleurHaut);
		g.fillOval(espaceGauche, espaceHaut - 1, epaisseur, epaisseur);
		g.fillRect(espaceGauche + (epaisseur /2), espaceHaut, tailleRect + 30, epaisseur - 1);
		g.fillArc(tailleRect, espaceHaut - 1, tailleArc, tailleArc, 0, 90);
		
		g.setColor(couleurCentre);
		g.fillArc(tailleRect, espaceHaut - 1, tailleArc, tailleArc, -90, 90);
		g.fillRect(espaceGauche + (tailleArc / 2), (espaceHaut - 3) + epaisseur + tailleArcEfface, tailleRect - 10, epaisseur - 2);
		g.fillArc(espaceGauche, (espaceHaut - 4) + epaisseur + tailleArcEfface, tailleArc, tailleArc, 90, 90);

		g.setColor(couleurBas);
		g.fillArc(espaceGauche, (espaceHaut - 4) + epaisseur + tailleArcEfface, tailleArc, tailleArc, 180, 90);
		g.fillRect(espaceGauche + (tailleArc / 2), (espaceHaut - 4) + (epaisseur * 2) + (tailleArcEfface * 2), tailleRect, epaisseur - 3);
		g.fillArc(tailleRect, (espaceHaut - 5) + (epaisseur * 2) + (tailleArcEfface * 2), tailleArc, tailleArc, 0, 90);
		
		g.setColor(getBackground());
		g.fillArc(tailleRect + 23, espaceHaut + epaisseur - 2, tailleArcEfface - 1, tailleArcEfface - 1, -90, 180);
		g.fillArc(espaceGauche + epaisseur - 2, espaceHaut + (epaisseur * 2) - 5 + tailleArcEfface, tailleArcEfface + 1, tailleArcEfface + 1, 90, 180);
		g.fillArc(tailleRect + 23, espaceHaut + (epaisseur * 3) - 7 + (tailleArcEfface * 2), tailleArcEfface, tailleArcEfface, -90, 180);
	}
	
	public void donnerPosition(MouseEvent e) 
	{
		boolean trouver = false;
		int i = 0;
		
		while(trouver == false && i < lesPoints.size())
		{
			Point p = lesPoints.get(i);
			if((e.getY() >= p.getY() && e.getY() <= p.getY() + (epaisseur - 10)) && (e.getX() >= p.getX() && e.getX() <= p.getX() + (epaisseur - 10)))
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
			System.out.println(i + 1);
		}
	}
	
	public void addPoint(BufferedImage img)
	{
		if(nbUtilise < lesPoints.size())
		{
			Graphics g = this.getGraphics();
			Point p = lesPoints.get(nbUtilise);
			
			g.drawImage(img, p.x - 10, p.y - 10, null);
			nbUtilise++;
		}
	}
}
