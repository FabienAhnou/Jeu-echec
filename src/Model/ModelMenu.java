package Model;

public class ModelMenu {
    private Boolean allowChangeWindow;
    private Boolean firstTime;

    public ModelMenu() {
        this.allowChangeWindow = true;
        this.firstTime = true;
    }

    public Boolean getAllowChangeWindow() {
        if (firstTime) {
            //firstTime = false;
            return true;
        } else
            return false;

    }
}
