package RobotNettoyeurpackage;

import Robotpackage.Robot;
import Mondepackage.Monde;

/**
 * Cette classe represente un objet RobotNettoyeur qui est une sous-classe de Robot.
 * Un RobotNettoyeur se deplace dans le monde et nettoie les cases sales.
 */
public class RobotNettoyeur extends Robot {
    
    /**
     * Constructeur qui cree un RobotNettoyeur avec une position initiale (0, 0) dans le monde donne.
     *
     * @param m Le monde dans lequel le RobotNettoyeur evolue
     */
    public RobotNettoyeur(Monde m) {
        super(0, 0, m);
    }

    /**
     * Nettoie la case actuelle si elle est sale.
     */
    public void nettoyer() {
        if(m.estSale(posx, posy)){
            m.prendPapierGras(posx, posy);
        }
    }

    /**
     * Parcourt le monde en se deplacant de maniere specifique et nettoie les cases sales.
     */
    public void parcourir() {
        for(int i = 0; i < m.nbL; i++) {
            posx = i;
            if((i % 2) == 0) {
                for(int j = 0; j < m.nbC; j++) {
                    posy = j;
                    nettoyer();
                }
            } else {
                for(int j = m.nbC - 1; j >= 0; j--) {
                    posy = j;
                    nettoyer();
                }
            }
        }
    }
}
