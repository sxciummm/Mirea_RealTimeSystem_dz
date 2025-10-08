package lab7.lab7_8;

public class Tester {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Война и мир"),
                new Magazine("Наука и жизнь"),
                new Book("Преступление и наказание"),
                new Magazine("Forbes"),
                new Book("Мастер и Маргарита")
        };

        Book.printBooks(items);
    }
}