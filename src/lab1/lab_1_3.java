package lab1;

public class lab_1_3 {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        //ALT+SHIFT+F10 (edit configurations) - для ввода аргументов.

        // Цикл for для вывода аргументов
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}