package PollueurToutDroitpackage;

import Robotpollueurpackage.Robotpollueur;
import Mondepackage.Monde;

/**
 * Cette classe represente un objet PollueurToutDroit qui est une sous-classe de Robotpollueur.
 * Un PollueurToutDroit se deplace tout droit dans une colonne specifiee du monde et pollue les cases rencontrees.
 */
public class PollueurToutDroit extends Robotpollueur {
    public int colDepart; // Le numero de la colonne de depart du PollueurToutDroit

    /**
     * Constructeur qui cree un PollueurToutDroit avec une position initiale (0, colDepart) dans le monde donne.
     *
     * @param colDepart Le numero de la colonne de depart
     * @param m         Le monde dans lequel le PollueurToutDroit evolue
     */
    public PollueurToutDroit(int colDepart, Monde m) {
        super(0, colDepart, m);
    }

    /**
     * Parcourt la colonne specifiee du monde en se deplacant tout droit et pollue les cases rencontrees.
     */
    public void parcourir() {
        for(int i = 0; i < m.nbL; i++) {
            posx = i;
            polluer();
        }
    }
}
