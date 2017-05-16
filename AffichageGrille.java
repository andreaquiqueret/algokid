import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AffichageGrille extends JPanel  {
	
	private Color couleurParcours;

	public AffichageGrille () throws IOException {
		couleurParcours = new Color(57, 172, 69);
		final JPanel grillage = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Grille grille = new Grille();
				Robot r = grille.r;
				int largeur = grille.WIDTH*50;
				int hauteur = grille.HEIGHT*50;
				int a=-1;
				int b=-1;
				for (int i=0; i < largeur; i=i+50) {
					a++;
					b=-1;
					for (int j=0; j < hauteur; j=j+50) {
						b++;
						if (grille.cellules[b][a] == 0)
							g.setColor(Color.white);
						else 
							g.setColor(couleurParcours);
						g.fillRect(i+50, j+50, 50, 50);
						g.setColor(Color.blue);
						g.drawRect(i+50,j+50,50,50);
						System.out.println(b);
						System.out.println(r.get_j_from_posX()-1);
						if (b==(r.get_i_from_posY()) && a==(r.get_j_from_posX())) {
							System.out.println("ok");
							try {
								
								BufferedImage image = ImageIO.read(new File("./images/"+ r.getOrientation()+".png"));
								g.drawImage(image,i+55,j+50,null);
							}
							catch (IOException exception) {
								System.out.println("Image du robot introuvable");
							}
							
							
							
						}
					
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
