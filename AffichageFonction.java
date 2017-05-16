import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AffichageFonction extends JPanel implements Orientation
{
	private BufferedImage haut;
	private BufferedImage bas;
	private BufferedImage gauche;
	private BufferedImage droite;
	private BufferedImage multi;
	private ArrayList<Point> lesPoints;
	private int tailleImage;
	private int espaceGauche;
	private int espaceHaut;
	Tablette tablette;
	Grille g;
	Serpentin s;
	
	public AffichageFonction(String path, Tablette t, Grille g, Serpentin s) throws IOException
	{
		haut = ImageIO.read(new File(path + "haut.png"));
		bas = ImageIO.read(new File(path + "bas.png"));
		gauche = ImageIO.read(new File(path + "gauche.png"));
		droite = ImageIO.read(new File(path +"droite.png"));
		multi = ImageIO.read(new File(path + "fonction.png"));
		lesPoints = new ArrayList<Point>();
		tailleImage = 45;
		espaceGauche = 100;
		espaceHaut = 10;
		tablette = t;
		this.g = g;
		this.s = s;
		MouseListener ml = new MouseListener() {
			  public void mouseClicked(MouseEvent e) {
				setBouton(e);
		
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
		
		g.drawImage(gauche, espaceGauche, espaceHaut, null);
		lesPoints.add(new Point(espaceGauche, espaceHaut));
		
		g.drawImage(droite, espaceGauche + tailleImage + 5, espaceHaut, null);
		lesPoints.add(new Point(espaceGauche + tailleImage + 5, espaceHaut));
		
		g.drawImage(haut, espaceGauche + ((tailleImage + 5) * 2), espaceHaut, null);
		lesPoints.add(new Point(espaceGauche + ((tailleImage + 5) * 2), espaceHaut));
		
		g.drawImage(bas, espaceGauche + ((tailleImage + 5) * 3), espaceHaut, null);
		lesPoints.add(new Point(espaceGauche + ((tailleImage + 5) * 3), espaceHaut));
		
		g.drawImage(multi, espaceGauche + ((tailleImage + 5) * 4), espaceHaut, null);
		lesPoints.add(new Point(espaceGauche + ((tailleImage + 5) * 4), espaceHaut));
	}
	
	
	public void setBouton(MouseEvent e) {
		
		//System.out.println(e.getX());
		//System.out.println(e.getY());
		boolean trouver = false;
		int i = 0;
		
		while(trouver == false && i < lesPoints.size())
		{
			Point p = lesPoints.get(i);
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
			if(AffichageTablette.estFonction)
			{
				
			}
			else
			{
				switch(i)
				{
					case 0: tablette.ajouterAction(GAUCHE);
						s.addPoint(gauche);
						break;
						
					case 1: tablette.ajouterAction(DROITE);
						s.addPoint(droite);
						break;
					
					case 2: tablette.ajouterAction(HAUT);
						s.addPoint(haut);
						break;
					
					case 3: tablette.ajouterAction(BAS);	
						s.addPoint(bas);
						
						break;
					
					case 4: //tablette.ajouterAction(BAS);	
						s.addPoint(multi);
					
						break;
				}
				
				/*if(e.getX()>espaceGauche && e.getX()<espaceGauche+45 && e.getY()>espaceHaut && e.getY()<espaceHaut + tailleImage) {
					tablette.ajouterAction(GAUCHE);
					s.addPoint(gauche);
					System.out.println("DEBUG: gauche");
				}
				
				if(e.getX()> espaceGauche + tailleImage + 5 && e.getX()< espaceGauche + tailleImage + 5 + tailleImage && e.getY()>espaceHaut && e.getY()<espaceHaut+45) {
					tablette.ajouterAction(DROITE);
					s.addPoint(droite);
					System.out.println("DEBUG: droite");
				}
				
				if(e.getX()> espaceGauche + ((tailleImage + 5) * 2) && e.getX()< espaceGauche + ((tailleImage + 5) * 2) + tailleImage && e.getY()>espaceHaut && e.getY()<espaceHaut+45) {
					tablette.ajouterAction(HAUT);
					s.addPoint(haut);
					System.out.println("DEBUG: haut");
				}
				
				if(e.getX()>espaceGauche + ((tailleImage + 5) * 3) && e.getX()<espaceGauche + ((tailleImage + 5) * 3) + tailleImage && e.getY()>espaceHaut && e.getY()<espaceHaut+45) {
					tablette.ajouterAction(BAS);	
					s.addPoint(bas);
					System.out.println("DEBUG: bas");
				}
				
				if(e.getX()>espaceGauche + ((tailleImage + 5) * 4) && e.getX()<espaceGauche + ((tailleImage + 5) * 4) + tailleImage && e.getY()>espaceHaut && e.getY()<espaceHaut + tailleImage) {
					//tablette.ajouterAction(BAS);	
					s.addPoint(multi);
					System.out.println("DEBUG: fonction");
				}*/
			}
		}
		
		//if(e.getX()> espaceGauche + ((tailleImage + 5) * 4) && e.getX()< espaceGauche + ((tailleImage + 5) * 4)+45 && e.getY()>espaceHaut && e.getY()<espaceHaut+45)
			//tablette.ajouterFonction(??);

		// test (OK ca marche :) A SUPPRMIER EN VERSION FINALE)	
		//this.tablette.start();
		//this.g.display(g.cellules);
		//this.g.cleanGrille();		
	}
	
}
