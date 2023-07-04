package NettoyeurDistraitpackage;

import Robotpackage.Robot;
import Mondepackage.Monde;

/**
 * Cette classe represente un objet NettoyeurDistrait qui est une sous-classe de Robot.
 */
public class NettoyeurDistrait extends Robot {
    
    /**
     * Constructeur qui cree un NettoyeurDistrait avec une position initiale (0, 0) dans le monde donne.
     *
     * @param m Le monde dans lequel le NettoyeurDistrait evolue
     */
    public NettoyeurDistrait(Monde m) {
        super(0, 0, m);
    }

    /**
     * Nettoie la case actuelle du NettoyeurDistrait en enlevant le papier gras.
     */
    public void nettoyer() {
       m.prendPapierGras(posx, posy);
    }

    /**
     * Parcourt le monde en effectuant un mouvement en boustrophedon et nettoie les cases sales rencontrees.
     * Le NettoyeurDistrait alterne entre nettoyer une case sale et ne rien faire pour chaque case rencontree.
     */
    public void parcourir() {
        boolean doitNettoyer = true;
        int compteur = 0;
        for(int i = 0; i < m.nbL; i++) {
            posx = i;
            if((i % 2) == 0) {
                for(int j = 0; j < m.nbC; j++) {
                    posy = j;
                    if(m.estSale(posx, posy)) {
                        if(doitNettoyer) {
                            nettoyer();
                            doitNettoyer = false;
                            compteur++;
                        } else {
                            doitNettoyer = true;
                        }
                    }
                }
            } else {
                for(int j = m.nbC - 1; j >= 0; j--) {
                    posy = j;
                    if(m.estSale(posx, posy)) {
                        if(doitNettoyer) {
                            nettoyer();
                            doitNettoyer = false;
                            compteur++;
                        } else {
                            doitNettoyer = true;
                        }
                    }
                }
            }
        }
        System.out.println("Nombre de case nettoyee : " + compteur);
    }
}
