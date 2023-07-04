import Mondepackage.Monde;
import NettoyeurDistraitpackage.NettoyeurDistrait;
import PollueurToutDroitpackage.PollueurToutDroit;
import RobotNettoyeurpackage.RobotNettoyeur;
import PollueurSauteurpackage.PollueurSauteur;

/**
 * Classe de test pour les differentes classes de robots.
 */
public class TestRobots {
    public static void main(String[] args){
        // Creation du monde
        Monde monde = new Monde();
        System.out.println("\n");
        System.out.println("+----------------+");
        System.out.println("| CLASSE : Monde |");
        System.out.println("+----------------+\n");

        // Test de la classe Monde
        System.out.println("Testons la methode metPapierGras aux coordonnees (1,1) et (1,2)");
        monde.metPapierGras(1, 1);
        monde.metPapierGras(1, 2);
        System.out.println(monde.toString());
        System.out.print("Testons la methode estSale aux coordonnees (1,1) : ");
        System.out.println(monde.estSale(1, 1));
        System.out.println("Le nombre de papiers gras dans le monde : " + monde.nbPapiersGras());
        System.out.println("Testons la methode prendPapierGras aux coordonnees (1,1)");
        monde.prendPapierGras(1, 1);
        System.out.println(monde.toString());
        System.out.println("Le nombre de papiers gras dans le monde : " + monde.nbPapiersGras());
        System.out.println("\n\n\n");


        // Test de la classe PollueurToutDroit
        System.out.println("+----------------------------+");
        System.out.println("| CLASSE : PollueurToutDroit |");
        System.out.println("+----------------------------+\n");

        // Creation et test d'un PollueurToutDroit
        PollueurToutDroit p = new PollueurToutDroit(3, monde);
        System.out.println("Testons la methode parcourir avec colDepart = 3");
        p.parcourir();
        System.out.println(monde.toString());
        System.out.println("\n\n\n");


        // Test de la classe PollueurSauteur
        System.out.println("+--------------------------+");
        System.out.println("| CLASSE : PollueurSauteur |");
        System.out.println("+--------------------------+\n");

        // Creation et test d'un PollueurSauteur
        PollueurSauteur polSauteur = new PollueurSauteur(0, 1, monde);
        System.out.println("Testons la methode parcourir avec colDepart = 0 et deltax = 1");
        polSauteur.parcourir();
        System.out.println(monde.toString());
        System.out.println("\n\n\n");


        // Test de la classe RobotNettoyeur
        System.out.println("+-------------------------+");
        System.out.println("| CLASSE : RobotNettoyeur |");
        System.out.println("+-------------------------+\n");

        // Creation et test d'un RobotNettoyeur
        System.out.println("Testons la methode parcourir :");
        System.out.println("Affichons d'abord la matrice ");
        System.out.println(monde.toString());
        RobotNettoyeur robNettoyeur = new RobotNettoyeur(monde);
        System.out.println("La matrice après nettoyage ");
        robNettoyeur.parcourir();
        System.out.println(monde.toString());
        System.out.println("\n\n\n");


        // Test de la classe NettoyeurDistrait
        System.out.println("+----------------------------+");
        System.out.println("| CLASSE : NettoyeurDistrait |");
        System.out.println("+----------------------------+\n");

        // Creation et test d'un NettoyeurDistrait
        System.out.println("Testons la methode parcourir : ");
        System.out.println("Affichons d'abord la matrice ");
        p.parcourir();
        System.out.println(monde.toString());
        NettoyeurDistrait netDistrait = new NettoyeurDistrait(monde);
        System.out.println("La matrice après nettoyage ");
        netDistrait.parcourir();
        System.out.println(monde.toString());
        System.out.println("\n\n\n");
    }
}
