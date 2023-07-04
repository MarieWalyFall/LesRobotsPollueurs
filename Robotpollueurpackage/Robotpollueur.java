package Robotpollueurpackage;

import Mondepackage.Monde;
import Robotpackage.Robot;

/**
 * Cette classe represente un objet Robotpollueur abstrait, qui est une sous-classe de Robot.
 * Un Robotpollueur est capable de polluer les cases du monde.
 */
public abstract class Robotpollueur extends Robot {
     
    /**
     * Constructeur qui cree un robot pollueur avec une position donnee dans le monde donne.
     *
     * @param posx La coordonnee x de la position du robot
     * @param posy La coordonnee y de la position du robot
     * @param m Le monde dans lequel le robot evolue
     */
    public Robotpollueur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }
    
    /**
     * Constructeur qui cree un robot pollueur avec une position aleatoire dans le monde donne.
     *
     * @param m Le monde dans lequel le robot evolue
     */
    public Robotpollueur(Monde m) {
        super(m);
    }

    /**
     * Methode qui permet au robot pollueur de polluer la case sur laquelle il se trouve.
     * Il met un papier gras dans la case.
     */
    public void polluer() {
        m.metPapierGras(posx, posy);
    }

    /**
     * Methode abstraite qui permet aux robots pollueurs de parcourir le monde.
     * Chaque sous-classe de Robotpollueur devra implementer cette methode en fonction de son comportement specifique.
     */
    public abstract void parcourir();
}
