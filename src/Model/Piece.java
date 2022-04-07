package Model;


 /** class Piece : CLASS Parent de toutes les pièces du jeu d'echecs */

public abstract class Piece {

    /** nom de la pièce */
    private String nom;
    /** couleur de la pièce */
    private String couleur;

    /** constructeur permettant d'initialiser le nom et la couleur de l'objet Pièce */
    public Piece(String nom, String couleur) {
        setNom(nom);
        setCouleur(couleur);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if ((couleur == "noir") || (couleur == "blanc"))
            this.couleur = couleur;
    }



    /** méthode à implementer dans les sous-classe,
     * va servir a vérifier la validite du déplacement des pieces
     * return true ou false selon la validité du deplacement */

    public abstract boolean estValide(Deplacement deplacement);

}

//règle du jeu https://fr.wikipedia.org/wiki/R%C3%A8gles_du_jeu_d'%C3%A9checs
