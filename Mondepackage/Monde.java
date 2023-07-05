package Mondepackage;

/**
 * Cette classe represente un objet Monde qui contient des informations sur les cases et les robots.
 */
public class Monde {
    public int nbL; // Le nombre de lignes de la matrice
    public int nbC; // Le nombre de colonnes de la matrice
    public boolean mat[][]; // La matrice booleenne
    
    /**
     * Constructeur par defaut qui cree un monde 10x10 sans papiers gras.
     */
    public Monde() { 
        this.nbL = 10;
        this.nbC = 10;
        this.mat = new boolean[nbL][nbC]; 
    }

    /**
     * Constructeur qui cree un monde avec un nombre donne de lignes et de colonnes sans papiers gras.
     *
     * @param nbL Le nombre de lignes du monde
     * @param nbC Le nombre de colonnes du monde
     */
    public Monde(int nbL, int nbC) {
        this.nbL = nbL;
        this.nbC = nbC;
        this.mat = new boolean[nbL][nbC]; 
    }
    
    /**
     * Retourne une chaine de caracteres decrivant le monde.
     * Utilise "o" pour representer vrai et "." pour representer faux.
     *
     * @return La representation en chaine de caracteres du monde
     */
    public String toString() {
        StringBuilder chaine = new StringBuilder(); 
        for(int i = 0; i < nbL; i++){
            for(int j = 0; j < nbC; j++){
                if(mat[i][j])
                    chaine.append(" o ");
                else
                    chaine.append(" . ");
            }
            chaine.append("\n");
        }
        return chaine.toString();
    }

    /**
     * Verifie si les coordonnees (i, j) appartiennent a la matrice.
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     * @return true si les coordonnees sont valides, sinon false
     */
    private boolean estValide(int i, int j) {
        return i >= 0 && i < nbL && j >= 0 && j < nbC; 
    }

    /**
     * Place un papier gras dans la case specifiee par les coordonnees (i, j).
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     */
    public void metPapierGras(int i, int j) {
        if(estValide(i,j))
            mat[i][j] = true;
    }

    /**
     * Enleve le papier gras de la case specifiee par les coordonnees (i, j).
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     */
    public void prendPapierGras(int i, int j) {
        if(estValide(i,j))
            mat[i][j] = false;
    }

    /**
     * Verifie si la case specifiee par les coordonnees (i, j) a un papier gras.
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     * @return true si la case a un papier gras, sinon false
     */
    public boolean estSale(int i, int j) {
        if(estValide(i,j))
            return mat[i][j];
        return false;
    }

    /**
     * Renvoie le nombre de papiers gras presents dans le monde.
     *
     * @return Le nombre de papiers gras dans le monde
     */
    public int nbPapiersGras() {
        int compteur = 0;
        for(int i = 0; i < nbL; i++)
            for(int j = 0; j < nbC; j++)
                if(mat[i][j])
                    compteur++;
            
        return compteur;
    }
}
