import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AffichageGrille extends JPanel {
	

	public AffichageGrille () {
		final JPanel grillage= new JPanel() {
			public void paintComponent(Graphics g) {
				for (int i=0; i < Grille.cellules.length; i++) {
			
					for (int j=0; j < Grille.cellules.length; j++) {
						
						if (Grille.cellules[i][j] == 0)
							g.setColor(Color.green);
						else 
							g.setColor(Color.white);
						g.fillRect(i+50, j+50, 50, 50);
						g.setColor(Color.blue);
						g.drawRect(i+50, j+50, 50, 50);
					}
				}
			}
		};
	grillage.setSize (600, 600);
	}
	
	
}
