import java.awt.Dimension;
import java.io.IOException;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;

public class Principal extends JPanel
{
	public static void main(String[] args) throws IOException 
	{
		Grille g = new Grille();
		Tablette t = new Tablette();
		AffichageTablette panneau = new AffichageTablette(t, g);
		AffichageGrille grille = new AffichageGrille();
		JSplitPane contenu = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true);
		contenu.setDividerLocation(450);
		contenu.setDividerSize(0);
		contenu.add(panneau);
		contenu.add(grille);
		JFrame fenetre = new JFrame("AlgoKids");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(1080, 650));
		fenetre.getContentPane().add(contenu);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
