package View;

import Controller.MenuPrincipalController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

// extends Application ==> pour pouvoir utiliser la vue de Javafx
public class ViewHandler extends Application {

    // en attribut je mets chaque vue différentes
    private ViewMenuPrincipal mp;
    private MenuPrincipalController mpc;
    private ViewMenuJouer mj;
    private ViewMenuOptions mo;

    @Override
    public void start(Stage primaryStage) {
        // Création objets propre à javafx
        Group root = new Group();
        Scene scene = new Scene(root);

        // création de mes vues
        mo = new ViewMenuOptions(root, this);
        mp = new ViewMenuPrincipal(root, this);
        mj = new ViewMenuJouer(root, this);

        // définition du comportement de la fenêtre générale
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ma première fenêtre");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.show();

        // affichage des premiers éléments graphiques
        afficherMenuPrincipal();
    }

    public void afficherMenuPrincipal() {
        mp.setVueMenu();
    }

    public void afficherMenuOptions() {
        mo.setVueMenu();
    }

    public void afficherMenuJouer() {
        mj.setVueMenu();
    }

}