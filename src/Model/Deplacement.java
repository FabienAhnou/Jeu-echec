package Model;


/** CLASS déplacement servant à réprésenter le déplacement d'une pièce du jeu d'échecs */

public class Deplacement {

    /** Déplacement sur l'axe des X */
    private double deplacementX;

    /** Déplacement sur l'axe des Y */
    private double deplacementY;

    /** Coordonnées de la case d'arrivée
     */
    private Position arrivee;

    /** Coordonnées de la case de départ */
    private Position depart;


    /**Constructeur de la CLASS déplacement, calcul les déplacements sur les axes X et Y.
     * Ces valeurs ne sont pas données de manière absolue car le pion à besoin de connaitre
     * la direction dans laquelle il se déplace. */
    public Deplacement(Position depart, Position arrivee)
    {
        this.arrivee = arrivee;
        this.depart = depart;
        this.deplacementX = arrivee.getColonne() - depart.getColonne();
        this.deplacementY = arrivee.getLigne() - depart.getLigne();
    }


    public double getDeplacementX() {
        return deplacementX;
    }

    public double getDeplacementY() {
        return deplacementY;
    }

    public Position getArrivee() {
        return arrivee;
    }

    public Position getDepart() {
        return depart;
    }

    //vérifie si le déplacement est nul.
    public boolean isNul(){
        return deplacementX == 0 && deplacementY == 0;
    }

}
