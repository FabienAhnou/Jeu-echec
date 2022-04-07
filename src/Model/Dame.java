package Model;

public class Dame extends Piece {

    public Dame(String Couleur) {
        super("Dame", Couleur);
    }


    public boolean estValide(Deplacement deplacement) {

        return deplacement.getDeplacementX() * deplacement.getDeplacementY() != 0 && !deplacement.isNul()
               | Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0 && !deplacement.isNul();
    }

}
