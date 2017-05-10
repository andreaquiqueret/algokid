package robotTest;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Principal 
{
	public static void main(String[] args) 
	{
		JFrame fenetre = new JFrame("Eteint la lumiere");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AffichageTablette panneau = new AffichageTablette();
		fenetre.setPreferredSize(new Dimension(400, 260));
		fenetre.setContentPane(panneau);
		fenetre.pack();
		
		fenetre.setVisible(true);
	}
}
