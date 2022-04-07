package View;

import Tools.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewMenuOptions {

    private Group root;
    private ViewHandler vh;
    private ImageView imgBg;
    private Button retourMenuPrincipal;

    public ViewMenuOptions(Group root, ViewHandler vh) {

        this.root = root;
        this.vh = vh;

        // todo Etape 2) on va initialiser les éléments à afficher dans le menu.
        // todo il est possible de le faire dans des méthodes pour plus de lisibilité
        initButtons();
        initBackground();
    }

    private void initBackground() {
        imgBg = new ImageView(Path.fondOption);
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initButtons() {
        retourMenuPrincipal = new Button("Retour-Option");
        retourMenuPrincipal.setTranslateX(1000);
        retourMenuPrincipal.setTranslateY(300);
        retourMenuPrincipal.setStyle("-fx-background-color: \n" +
                "        #090a0c,\n" +
                "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" +
                "        linear-gradient(#20262b, #191d22),\n" +
                "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" +
                "    -fx-background-radius: 5,4,3,5;\n" +
                "    -fx-background-insets: 0,1,2,0;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
                "    -fx-font-family: \"Arial\";\n" +
                "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" +
                "    -fx-font-size: 30px;\n" +
                "    -fx-padding: 10 20 10 20;");
        retourMenuPrincipal.setOnMouseClicked(e -> vh.afficherMenuPrincipal());
    }


    /**
     * Ajoute a la vue tous les éléments composant le menu
     */
    public void setVueMenu() {
        // todo Etape 3) on met ici les éléments du menu à afficher.
        root.getChildren().clear();
        root.getChildren().add(imgBg);
        root.getChildren().add(retourMenuPrincipal);
    }

}
