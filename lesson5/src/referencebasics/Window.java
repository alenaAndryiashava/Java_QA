package referencebasics;

public class Window {
    private double square;
    private WindowType type;

    public Window(){

    }
    public Window(double square, WindowType type) {
        this.square = square;
        this.type = type;
    }

    public double getSquare() {
        return square;
    }

    public void setType(WindowType type) {
        this.type = type;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public WindowType getType() {
        return type;
    }

    public void printStatistics(){
        System.out.println("Square is " + square + "; " + "type is " + type.getTypeName());
    }

}
