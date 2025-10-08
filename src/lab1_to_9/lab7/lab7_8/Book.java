package lab1_to_9.lab7.lab7_8;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    // Статический метод для вывода названий только книг
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println(item.getTitle());
            }
        }
    }
}