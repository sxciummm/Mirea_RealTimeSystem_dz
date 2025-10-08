package lab1_to_9.lab2.lab2_3;

public class Circle {
    private Point center;
    private double r;

    public Circle() {
        this(new Point(),1.0);
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle(double x, double y , double r) {
        this.center = new Point(x , y);
        this.r = r;
    }

    public Point getCenter() {return center;}
    public void setCenter(Point center) {this.center = center;}

    public double getR() {return r;}
    public void setR(double r) {this.r = r;}

    @Override
    public String toString(){
        return "Circle: " + "\n" + "center = " + center + "\n" + "radius = "+ r;
    }

}
