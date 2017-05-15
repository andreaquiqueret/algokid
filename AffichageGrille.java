import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AffichageGrille extends JPanel {
	

	public AffichageGrille () {
		final JPanel grillage = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Grille grille = new Grille();
				int largeur = grille.WIDTH*50;
				int hauteur = grille.HEIGHT*50;
				int a=-1;
				int b=-1;
				for (int i=0; i < largeur; i=i+50) {
					a++;
					b=-1;
					for (int j=0; j < hauteur; j=j+50) {
						b++;
					if (grille.cellules[a][b] == 0)
						g.setColor(Color.white);
					else 
							g.setColor(Color.green);
						g.fillRect(i+50, j+50, 50, 50);
						g.setColor(Color.blue);
						g.drawRect(i+50,j+50,50,50);
					}
				}
			}
		};
	grillage.setSize (600, 600);
	this.setLayout(new BorderLayout());
	this.add(grillage, BorderLayout.CENTER);


	}
	
	/*public void dessine() {
		repaint();
	}
	*/
}
