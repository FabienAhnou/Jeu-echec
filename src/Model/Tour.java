package Model;

public class Tour extends Piece {

    public Tour(String Couleur) {
        super("Tour", Couleur);
    }


        public boolean estValide(Deplacement deplacement) {
                            /*
                 * Si le produit du déplacement x et du déplacement y est égal à 0, c'est que
                 * un des deux déplacements est de 0 ce qui veux dire que le mouvement est uniquement vertical ou
                 * horizontale
                 */
            return deplacement.getDeplacementX() * deplacement.getDeplacementY() == 0 && !deplacement.isNul();
            }
    }


