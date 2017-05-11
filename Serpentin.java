
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Serpentin extends JPanel
{
	private int epaisseur;
	
	public Serpentin()
	{
		epaisseur = 30;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		dessineSerpentin(g);
		//dessinePoint(g);
	}
	
	public void dessinePoint(Graphics g)
	{
		for(int i = 0; i < 6; i++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(20 + (55 * i), 10, epaisseur, epaisseur);
			g.setColor(Color.BLACK);
			g.drawOval(20 + (55 * i), 10, epaisseur, epaisseur);
		}
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
	}
}
