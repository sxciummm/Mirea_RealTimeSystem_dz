package lab1_to_9.lab1;

public class lab_1_4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        double harm = 0.0;
        for (int n = 1; n<=10; n++){
            harm += 1.0/n;
            System.out.printf("H(%d) = %.2f%n", n , harm);
        }
    }
}