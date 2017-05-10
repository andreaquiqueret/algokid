import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;

public class Principal 
{
	public static void main(String[] args) throws IOException 
	{
		JFrame fenetre = new JFrame("AlgoKids");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AffichageTablette panneau = new AffichageTablette();
		fenetre.setPreferredSize(new Dimension(450, 480));
		fenetre.setContentPane(panneau);
		fenetre.pack();
		
		fenetre.setVisible(true);
	}
}
