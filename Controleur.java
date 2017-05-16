import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;


public class Controleur  extends Observable implements Runnable{

	Grille g;
	AffichageGrille affg;
	
	public Controleur(Grille grille, AffichageGrille ag) {
		g=grille;
		affg = ag;
		notifyObservers(g);
		
	}
	
	public void run()  {
		while(true) {
		System.out.println("run ok");
		try {
			Thread.sleep(1000) ;
        } catch (InterruptedException e) {
		 
		}
		affg.repaint();
		}
	}

}