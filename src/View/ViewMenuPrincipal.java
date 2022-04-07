package View;

import Controller.MenuPrincipalController;
import Model.ModelMenu;
import Tools.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewMenuPrincipal {

    private Group root;
    private ViewHandler vh;

    private MenuPrincipalController mpc;
    private ModelMenu mm;


    // todo Etape 1) on va créer ici les attributs que l'on va afficher dans le menu
    private ImageView imgBg;
    private Button jouer, options, quitter;
    private Text titre;


    public ViewMenuPrincipal(Group root, ViewHandler vh) {
        this.root = root;
        this.vh = vh;
        this.mm = new ModelMenu();
        this.mpc = new MenuPrincipalController(mm, vh, this);

        // todo Etape 2) on va initialiser les éléments à afficher dans le menu.
        // todo il est possible de le faire dans des méthodes pour plus de lisibilité
        initTitre();
        initButtons();
        initBackground();


    }

    private void initTitre() {
        titre = new Text("Jeu d'échec");
        titre.setTranslateX(650);
        titre.setTranslateY(350);
        titre.setStyle("-fx-background-color: #ffffff; -fx-fill: #ffffff; -fx-font-size: 100pt;");

    }

    /**
     * Mise en place de l'image de fond en fonction de la taille de l'écran de l'utilisateur
     */
    private void initBackground() {
        imgBg = new ImageView(Path.fondMenu);
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initButtons() {
        jouer = new Button("Jouer");
        jouer.setTranslateX(850);
        jouer.setTranslateY(500);
        jouer.setStyle("-fx-background-color: \n" +
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
                "    -fx-font-size: 60px;\n" +
                "    -fx-padding: 10 20 10 20;");
        jouer.setOnMouseClicked(mpc);

        options = new Button("Options");
        options.setTranslateX(825);
        options.setTranslateY(700);
        options.setStyle("-fx-background-color: \n" +
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
                "    -fx-font-size: 60px;\n" +
                "    -fx-padding: 10 20 10 20;");
        options.setOnMouseClicked(mpc);

        quitter = new Button("Quitter");
        quitter.setTranslateX(850);
        quitter.setTranslateY(900);
        quitter.setStyle("-fx-background-color: \n" +
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
                "    -fx-font-size: 60px;\n" +
                "    -fx-padding: 10 20 10 20;");
        quitter.setOnMouseClicked(mpc);
    }

    /**
     * Ajoute a la vue tous les éléments composant le menu
     */
    public void setVueMenu() {
        root.getChildren().clear();
        // todo Etape 3) on met ici les éléments du menu à afficher.
        root.getChildren().add(imgBg);
        root.getChildren().add(titre);
        root.getChildren().add(jouer);
        root.getChildren().add(options);
        root.getChildren().add(quitter);
    }

    public Button getJouer() {
        return jouer;
    }

    public Button getOptions() {
        return options;
    }

    public Button getQuitter() {
        return quitter;
    }

}

