package comparable;

public class Rectangle implements Comparable<Rectangle>{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int weight, int height) {
        this.x = x;
        this.y = y;
        this.width = weight;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Rectangle other) {
       int area = this.height * this.width;
        int otherArea = other.height * other.width;
        if(this.x != other.x){
             return Integer.compare(this.x, other.x);
            }else {
            if (this.y != other.y) {
                return Integer.compare(this.y, other.y);
            } else {
                return Integer.compare(area, otherArea);
            }
        }
    }
}
