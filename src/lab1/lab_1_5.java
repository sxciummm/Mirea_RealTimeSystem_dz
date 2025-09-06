package lab1;

public class lab_1_5 {
    public static long factorial(int a) {

        if (a<0) {
            System.out.print("Значение не может быть меньше 0!");
        }

        long fact = 1;
        for (int i = 1; i <= a;i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.printf("Факториал: " + factorial(4));
    }
}
