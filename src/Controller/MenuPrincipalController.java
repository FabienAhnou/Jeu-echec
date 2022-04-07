package Controller;

import Model.ModelMenu;
import View.ViewHandler;
import View.ViewMenuPrincipal;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MenuPrincipalController implements EventHandler<MouseEvent> {

    private ModelMenu mm;
    private ViewHandler vh;
    private ViewMenuPrincipal vmp;

    public MenuPrincipalController(ModelMenu mm, ViewHandler vh, ViewMenuPrincipal vmp) {
        this.mm = mm;
        this.vh = vh;
        this.vmp = vmp;
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(vmp.getOptions())) {
            if (mm.getAllowChangeWindow())
                vh.afficherMenuOptions();
        }
        else if (event.getSource().equals(vmp.getJouer())){
                if (mm.getAllowChangeWindow())
                    vh.afficherMenuJouer();
        }

        else if (event.getSource().equals(vmp.getQuitter())){
                System.exit(0);
        }
    }
}
