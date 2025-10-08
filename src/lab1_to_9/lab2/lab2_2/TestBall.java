package lab1_to_9.lab2.lab2_2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(5.0,20.0);

        System.out.println("Начальные координаты Ball1" + "(" + ball1.getX() + ", " + ball1.getY() + ")");
        System.out.println("Начальные координаты Ball2" + "(" + ball2.getX() + ", " + ball2.getY() + ")");
        System.out.println();

        ball1.setX(2.1);
        ball1.setY(3.3);
        System.out.println("ball1 после setX и setY: (" + ball1.getX() + ", " + ball1.getY() + ")");

        ball2.setXY(0.1,1.5);
        System.out.println("ball2 после setXY: (" + ball2.getX() + ", " + ball2.getY() + ")");
        System.out.println();

        ball2.move(10,10);
        System.out.println("ball2 после move(10,10): (" + ball2.getX() + ", " + ball2.getY() + ")");
        System.out.println();

        System.out.println("ball1: " + "\n" + ball1.toString());
        System.out.println("ball2: " + "\n" + ball2.toString());
    }
}
