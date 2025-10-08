package lab1_to_9.lab8.lab8_5;

public class Main {
    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(123));
        System.out.println(sum(9876));
        System.out.println(sum(5));
    }
}
