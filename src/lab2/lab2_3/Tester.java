package lab2.lab2_3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public boolean addCircle(Circle circle){
        if (count<circles.length) {
            circles[count] = circle;
            count++;
            return true;
        }
        else {
            return false;
        }

    }

    public Circle getCircle(int i) {
        if (i>=0 && i<count) {
            return circles[i];
        }
        else{
            return null;
        }
    }

    public int getCount() {
        return count;
    }

    public void getAll() {
        System.out.println("Вот все окружности: \n");
        for (int i=0;i<count;i++) {
            System.out.println(circles[i] + "\n");
        }
        if (count == 0) {
            System.out.println("Нет окружностей в массиве");
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(6);

        tester.addCircle(new Circle(new Point(), 5));
        tester.addCircle(new Circle(new Point(1, 15.1), 6));
        tester.addCircle(new Circle(1, 2, 7));
        tester.addCircle(new Circle(3, 4, 8));
        tester.addCircle(new Circle(3, 4, 8));


        tester.getAll();

        System.out.println("Колво окружностей = " + tester.getCount() + "\n");

        System.out.println("Окружность под индексом 2: \n" + tester.getCircle(2));
    }

}
