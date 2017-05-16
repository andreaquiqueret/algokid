import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Serpentin extends JPanel
{
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
	
	public Serpentin(int n)
	{
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
		i++;
		g.drawString(String.valueOf(i+20*n), espaceGauche + 18, espaceHaut + epaisseur + tailleArcEfface + 26);
		
		g.setColor(Color.WHITE);
		i++;
		g.fillOval(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13, epaisseur - 10, epaisseur - 10);
		g.drawString(String.valueOf(i+20*n), espaceGauche + 18,  espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 2);
		
		for(int j = 1; j < 6; j++)
		{
			i++;
			g.setColor(Color.WHITE);
			g.fillOval(espaceGauche + 10 + (60 * j), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2), epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(espaceGauche + 10 + (60 * j), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2), epaisseur - 10, epaisseur - 10);
			g.drawString(String.valueOf(i + 20*n), espaceGauche + (60 * j) + 13, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 15);
		}
		
		i++;
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30, epaisseur - 10, epaisseur - 10);
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
	
	public void donnerPosition(MouseEvent e) {
		
		if (e.getY() > 13 && e.getY() <40) {
			for (int i=0; i<=6; i++){
				if (e.getX() >15+60*i && e.getX() <45+60*i)
					System.out.println(i+1+20*nSerpentin);
			}
		}
		
		if(e.getX()>345 && e.getX()<375 && e.getY()>50 && e.getY()<80)
			System.out.println(7+20*nSerpentin);
		
		
		if (e.getY() > 93 && e.getY() <120) {
			for (int i=0; i<7; i++){
				if (e.getX() >15+60*i && e.getX() <45+60*i) {
					if (i==1)
						System.out.println(12+20*nSerpentin);
					if (i==2)
						System.out.println(11+20*nSerpentin);
					if (i==3)
						System.out.println(10+20*nSerpentin);
					if (i==4)
						System.out.println(9+20*nSerpentin);
					if (i==5)
						System.out.println(8+20*nSerpentin);
				}
			}
		}
		
		if(e.getX()>20 && e.getX()<47 && e.getY()>170 && e.getY()<185)
			System.out.println(14+20*nSerpentin);
		
		if(e.getX()>20 && e.getX()<45 && e.getY()>103 && e.getY()<125)
			System.out.println(13+20*nSerpentin);
		
		if (e.getY() > 175 && e.getY() <200) {
			for (int i=0; i<6; i++){
				if (e.getX() >70+65*i && e.getX() <90+65*i) {
					System.out.println(i+15+20*nSerpentin);
				}
			}
		}
		
		if(e.getX()>350 && e.getX()<375 && e.getY()>205 && e.getY()<225)
			System.out.println(20+20*nSerpentin);
		
		 
	}
}
