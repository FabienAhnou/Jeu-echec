package Model;

/** CLASS Pion : CLASS servant à représenter un Pion dans le jeu d'échecs */


public class Pion extends Piece {

    /** Constructeur de la CLASS pion */
    public Pion(String Couleur) {
        super("Pion", Couleur);
    }


    /** Methode estValide, sert à vérifier la validité du déplacement d'un pion
     * return true ou false si le déplacement du pion est valide */
    public boolean estValide(Deplacement deplacement) {
        /** Vérifie que le déplacementX est bien nul, ensuite selon la couleur du pion,
         * vérifie que son déplacementY est égal à 1 ou 2 en fonction de la position du pion.
         * (les operateurs <= et >= servent a valider que le pion
         * avance d'une seule case et ce même si il est sur la ligne de depart.*/
        if (deplacement.getDeplacementX() == 0)
            if (this.getCouleur().equals("noir")){
                /** si le déplacementY est plus petit ou égal à 2 si la ligne de départ est égal à 1,
                 * a 1 si la ligne de départ n'est pas egal à 1, et que le déplacement n'est pas inferieur à 0
                 * (que le pion ne recule pas). Si le pion est Blanc, les conditions sont adaptés a un
                 * mouvement négatif et à une ligne de départ égal à 6.*/
                 return deplacement.getDeplacementY() <= (deplacement.getDepart().getLigne() == 1 ? 2 : 1) && deplacement.getDeplacementY() > 0;
            }
            else
                return deplacement.getDeplacementY() >= (deplacement.getDepart().getLigne() == 6 ? -2 : -1) && deplacement.getDeplacementY() < 0;
        return false;
    }
}
