import java.awt.Dimension;
import javax.swing.JFrame;


public class ControleGrille {

		
		public static void main(String[] args)
		{
			JFrame fenetre = new JFrame("Controle Grille");
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    AffichageGrille dessin = new AffichageGrille();
		    dessin.setPreferredSize(new Dimension(800,800));
		    fenetre.setContentPane(dessin);
		    fenetre.pack();
		    fenetre.setVisible(true);
		    dessin.requestFocusInWindow();
		    dessin.requestFocus();
	  }
}
