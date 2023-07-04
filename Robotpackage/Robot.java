package Robotpackage;

import Mondepackage.Monde;

/**
 * Cette classe represente un objet Robot abstrait.
 * Un Robot a une position (posx, posy) dans le monde et peut se deplacer.
 */
public abstract class Robot {
    public int posx;  // posx, posy : position du robot sur le monde.
    public int posy; 
    public Monde m; 

    /**
     * Constructeur qui cree un robot avec une position donnee dans le monde donne.
     *
     * @param x La coordonnee x de la position du robot
     * @param y La coordonnee y de la position du robot
     * @param m Le monde dans lequel le robot evolue
     */
    public Robot(int x, int y, Monde m) {
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    /**
     * Constructeur qui cree un robot avec une position aleatoire dans le monde donne.
     *
     * @param m Le monde dans lequel le robot evolue
     */
    public Robot(Monde m) {
        this((int)(Math.random() * m.nbL), (int)(Math.random() * m.nbC), m);
    }

    /**
     * Verifie si la case aux coordonnees (i, j) appartient a la matrice du monde.
     *
     * @param i La coordonnee i
     * @param j La coordonnee j
     * @return true si la case est valide, false sinon
     */
    private boolean estValide(int i, int j) {
        return i >= 0 && i < m.nbL && j >= 0 && j < m.nbC; 
    }

    /**
     * Deplace le robot vers les coordonnees (i, j) si la case est valide.
     *
     * @param i La coordonnee i de la nouvelle position
     * @param j La coordonnee j de la nouvelle position
     */
    public void vaEn(int i, int j) {
        if(estValide(i, j)){
            posx = i;
            posy = j;
        }
    } 

    /**
     * Methode abstraite qui permet aux robots de parcourir le monde.
     * Chaque sous-classe de Robot devra implementer cette methode en fonction de son comportement specifique.
     */
    public abstract void parcourir();
}
