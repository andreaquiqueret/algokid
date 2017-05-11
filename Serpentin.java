
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

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

	
	public Serpentin()
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

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		dessineSerpentin(g);

		//dessinePoint(g);

		dessinePoint(g);
	}
	
	public void dessinePoint(Graphics g)
	{
		for(int i = 0; i < 6; i++)
		{
			g.fillOval(espaceGauche + 10 + (60 * i), espaceHaut + 4, epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(espaceGauche + 10 + (60 * i), espaceHaut + 4, epaisseur - 10, epaisseur - 10);
			g.drawString(String.valueOf(i + 1), espaceGauche + 17 + (60 * i), espaceHaut + 18);
		}
		
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 42 + (60 * 5), espaceHaut + (tailleArc / 2) - 10, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 42 + (60 * 5), espaceHaut + (tailleArc / 2) - 10, epaisseur - 10, epaisseur - 10);
		g.drawString("7", espaceGauche + 49 + (60 * 5), espaceHaut + 5 + (tailleArc / 2));
		
		for(int i = 0; i < 5; i++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(epaisseur + espaceGauche + tailleRect + 10 - (60 * i), espaceHaut + epaisseur + tailleArcEfface, epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(epaisseur + espaceGauche + tailleRect + 10 - (60 * i), espaceHaut + epaisseur + tailleArcEfface, epaisseur - 10, epaisseur - 10);
			if((i + 8) >= 10)
			{
				g.drawString(String.valueOf(i + 8), epaisseur + espaceGauche + tailleRect + 13 - (60 * i), espaceHaut + epaisseur + tailleArcEfface + 15);
			}
			else
			{
				g.drawString(String.valueOf(i + 8), epaisseur + espaceGauche + tailleRect + 17 - (60 * i), espaceHaut + epaisseur + tailleArcEfface + 15);
			}
		}
		
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 15, espaceHaut + epaisseur + tailleArcEfface + 12, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 15, espaceHaut + epaisseur + tailleArcEfface + 12, epaisseur - 10, epaisseur - 10);
		g.drawString("13", espaceGauche + 18, espaceHaut + epaisseur + tailleArcEfface + 26);
		
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 15, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) - 13, epaisseur - 10, epaisseur - 10);
		g.drawString("14", espaceGauche + 18,  espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 2);
		
		for(int i = 1; i < 6; i++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(espaceGauche + 10 + (60 * i), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2), epaisseur - 10, epaisseur - 10);
			g.setColor(Color.BLACK);
			g.drawOval(espaceGauche + 10 + (60 * i), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2), epaisseur - 10, epaisseur - 10);
			g.drawString(String.valueOf(i + 14), espaceGauche + (60 * i) + 13, espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 15);
		}
		
		g.setColor(Color.WHITE);
		g.fillOval(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30, epaisseur - 10, epaisseur - 10);
		g.setColor(Color.BLACK);
		g.drawOval(espaceGauche + 42 + (60 * 5), espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 30, epaisseur - 10, epaisseur - 10);
		g.drawString("20", espaceGauche + 45 + (60 * 5),  espaceHaut + (epaisseur * 2) + (tailleArcEfface * 2) + 45);
	}
	
	public void dessineSerpentin(Graphics g)
	{

		g.setColor(new Color(67, 87, 116));
		g.fillOval(10, 10, epaisseur, epaisseur);
		g.fillRect(22, 11, 300, epaisseur - 1);
		//g.fillArc(270, 11, 100, 100, -90, 90);
		//g.fillArc(267, 11, 110, 110, 0, 90);
		g.drawOval(267, 11, 110, 110);
		g.drawOval(292, 39, 54, 54);
		
		g.setColor(new Color(53, 163, 169));
		//g.fillArc(267, 11, 110, 110, -90, 90);
		g.fillRect(55, 93, 270, epaisseur - 2);
		g.fillArc(10, 92, 100, 100, 90, 90);

		g.setColor(new Color(251, 158, 32));
		g.fillArc(10, 92, 100, 100, 180, 90);
		g.fillRect(55, 175, 270, epaisseur - 2);
		g.fillArc(270, 175, 100, 100, 0, 90);
		
		g.setColor(getBackground());
		//g.fillArc(286, 39, 54, 54, -90, 180);
		g.fillArc(28, 111, 64, 64, 90, 180);
		g.fillArc(286, 193, 64, 64, -90, 180);

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
}
