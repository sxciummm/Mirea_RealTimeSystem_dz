package lab1_to_9.lab2.lab2_3;

public class Point {
    private double x;
    private double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY() {return y;}

    public void setX(double x) {this.x = x;}

    public void setY(double y) {this.y = y;}


    @Override
    public String toString(){
        return "coord" + "(" + x + ", " + y + ")";
    }



}
