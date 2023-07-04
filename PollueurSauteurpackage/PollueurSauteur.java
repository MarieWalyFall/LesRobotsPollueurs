package PollueurSauteurpackage;

import Mondepackage.Monde;
import Robotpollueurpackage.Robotpollueur;

/**
 * Cette classe represente un objet PollueurSauteur qui est une sous-classe de Robotpollueur.
 * Un PollueurSauteur se deplace dans un monde en sautant d'une colonne a l'autre et pollue les cases rencontrees.
 */
public class PollueurSauteur extends Robotpollueur {
    public int colDepart; // Le numero de la colonne de depart du PollueurSauteur
    public int deltax; // L'ecart de colonnes entre les sauts

    /**
     * Constructeur qui cree un PollueurSauteur avec une position initiale (0, colDepart) dans le monde donne.
     *
     * @param colDepart Le numero de la colonne de depart
     * @param deltax    L'ecart de colonnes entre les sauts
     * @param m         Le monde dans lequel le PollueurSauteur evolue
     */
    public PollueurSauteur(int colDepart, int deltax, Monde m) {
        super(0, colDepart, m);
        this.deltax = deltax;
    }

    /**
     * Parcourt le monde en sautant d'une colonne a l'autre et pollue les cases rencontrees.
     * Le PollueurSauteur alterne entre les colonnes de depart et les colonnes decalees de deltax.
     */
    public void parcourir() {
        for(int i = 0; i < m.nbL; i++) {
            if((i % 2) == 0) {
                posx = i;
                posy = colDepart;
                polluer();
            } else {
                posx = i;
                posy = colDepart + deltax;
                polluer();
            }
        }
    }
}
