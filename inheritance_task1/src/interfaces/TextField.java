package interfaces;

public class TextField implements Clickable {
    private String text;
    private boolean hidden;

    public TextField(String text, boolean hidden) {
        this.text = text;
        this.hidden = hidden;
    }
//if getter returns boolean then it should start with "is" not "get"
    public boolean isHidden() {
        return hidden;
    }

    public void hide(){
        hidden = true;
    }
    public void show(){
        hidden = false;
    }

    @Override
    public void click() {
        if(hidden) show();
        else hide();
    }
}
