package lab1_to_9.lab4.lab4_3_and_4.shop;

import lab1_to_9.lab4.lab4_3_and_4.Computer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface {

    private List<User> users;
    private List<Catalog> catalogs;
    private User CurrentUser;
    private Scanner scanner;

    public Interface() {
        this.users = new ArrayList<>();
        this.catalogs = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        initializeData();
    }

    private void initializeData() {
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));

        Catalog Intell = new Catalog("Intell");

        Monitor monitor = new Monitor("test", 27.4,360);
        Processor processor = new Processor("Intell", "I7-7700K", 3.4,12);
        Memory memory = new Memory("test", 121, "DDR4", 251.11);
        Intell.addComputer(new Computer(monitor,memory,processor, ComputerBrand.ACER, 200000));

        Monitor monitor1 = new Monitor("test1", 15.6,60);
        Processor processor1 = new Processor("Intell", "I5-12450H", 2.4,8);
        Memory memory1 = new Memory("test1", 121, "DDR4", 25.11);
        Intell.addComputer(new Computer(monitor1,memory1,processor1, ComputerBrand.LENOVO, 100000));

        catalogs.add(Intell);

        Catalog DDR5 = new Catalog("DDR5");

        Monitor monitor2 = new Monitor("test2", 24.7,144);
        Processor processor2 = new Processor("AMD", "7700", 3.4,6);
        Memory memory2 = new Memory("test2", 12, "DDR5", 100);
        DDR5.addComputer(new Computer(monitor2,memory2,processor2, ComputerBrand.ACER, 250000));

        Monitor monitor3 = new Monitor("test3", 60,160);
        Processor processor3 = new Processor("AMD", "X12400", 2.4,24);
        Memory memory3 = new Memory("test3", 121, "DDR5", 32);
        DDR5.addComputer(new Computer(monitor3,memory3,processor3, ComputerBrand.LENOVO, 925000));

        catalogs.add(DDR5);
    }

    public void start() {
        System.out.println("+++++ Добро пожаловать в интернет магазин компьютеров! +++++");
        while (true) {
            if (CurrentUser==null) {
                auth();
            }
            else {
                showMenu();
            }
        }
    }

    public void auth() {
        System.out.println("=== АВТОРИЗАЦИЯ ===");

        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        for (User user: users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                CurrentUser = user;
                System.out.println("Добро пожаловать, " + login + "!");
                return;
            }
        }
    }

    private void showMenu() {
        System.out.println("Выбирите действие: \n");
        System.out.println("1. Корзина");
        System.out.println("2. Каталоги");
        System.out.println("3. Оформить покупку");
        System.out.println("4. Выход" + "\n");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                CurrentUser.viewCart();
            case 2:
                showCatalogs();
                break;
            case 3:
                BuyItems();
                break;
            case 4:
                System.out.println("До свидания, " + CurrentUser.getLogin() + "!" + "\n");
                CurrentUser = null;
                break;
            default:
                System.out.println("Неверный выбор!");
        }
    }

    public void showCatalogs() {
        System.out.println("\n=== КАТАЛОГИ ТОВАРОВ ===");
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.println((i + 1) + ". " + catalogs.get(i).getName());
        }

        System.out.print("Выберите каталог (0 - вернуться): ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 0) return;
        if (choice > 0 && choice <= catalogs.size()) {
            showCatalogProducts(catalogs.get(choice - 1));
        } else {
            System.out.println("Неверный выбор!");
        }
    }

    private void showCatalogProducts(Catalog catalog) {
        catalog.viewCatalog();

        System.out.print("\nВыберите товар для добавления в корзину (0 - вернуться): ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 0) return;
        if (choice > 0 && choice <= catalog.getComputers().size()) {
            Computer selectedComp = catalog.getComputers().get(choice - 1);
            CurrentUser.addToCart(selectedComp);
        } else {
            System.out.println("Неверный выбор!");
        }
    }

    public void BuyItems() {
        if (CurrentUser.getCart().isEmpty()) {
            System.out.println("Корзина пуста! Покупать нечего! \n");
            return;
        }

        CurrentUser.viewCart();
        System.out.print("\nПодтвердите покупку (1 - да, 0 - нет): ");
        int confirm = Integer.parseInt(scanner.nextLine());

        if (confirm==1) {
            double total = CurrentUser.getCartTotal();
            System.out.println("Покупка оформлена успешно!");
            System.out.println("Сумма покупки: " + total + "RUB");
            System.out.println("Спасибо за покупку!");
            CurrentUser.clearCart();
        }
        else {
            System.out.println("Покупка отменена.");
        }
    }

    public static void main(String[] args) {
        Interface store = new Interface();
        store.start();
    }
}
