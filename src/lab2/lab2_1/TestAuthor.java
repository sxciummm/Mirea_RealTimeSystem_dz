package lab2.lab2_1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String email;

        Author k1 = new Author("Harry", "HarryPotter@mail.ru", 'M');
        System.out.println(k1.toString());


        System.out.print("Введите почту: ");
        Scanner scanner = new Scanner(System.in);
        email = scanner.next();
        k1.setEmail(email);
        System.out.println(k1.toString());
    }
}
