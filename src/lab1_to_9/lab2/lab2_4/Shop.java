package lab1_to_9.lab2.lab2_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Computer> computers;
    private Scanner scanner;

    public Shop() {
        computers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addComp() {
        System.out.println("Введите параметры компьютера: ");

        System.out.print("Брэнд: ");
        String brand = scanner.nextLine();

        System.out.print("Процессор: ");
        String cpu = scanner.nextLine();

        System.out.print("Видеокарта: ");
        String gpu = scanner.nextLine();

        System.out.print("ОЗУ: ");
        int ram = ValidInt();

        System.out.print("Память: ");
        int ssd = ValidInt();

        System.out.print("Цена: ");
        int price = ValidInt();

        Computer comp = new Computer(brand,cpu,gpu,ram,ssd,price);
        computers.add(comp);
        System.out.println();
        System.out.println("Компьютер добавлен! \n");
    }

    public void delComp() {
        if (computers.isEmpty()) {
            System.out.println("Компьютеров нет в магазине!\n");
        }
        else {
            getAll();

            System.out.println("Напишите индекс компьютера который хотите удалить: \n");
            int k = ValidInt();

            if (k>0 && k<computers.size()){
                computers.remove(k-1);
                System.out.println("Компьютер №" + k + " удален! \n");
            }
            else {
                System.out.println("Вы ввели неверный индекс! \n");
            }
        }
    }

    public void findComp() {
        if (computers.isEmpty()) {
            System.out.println("Компьютеров нет в магазине!\n");
            return;
        }

        System.out.println("Выберите критерий по которому хотите найти компьютер: \n");
        System.out.println("1. По бренду: ");
        System.out.println("2. По процессору: ");
        System.out.println("3. По видеокарте: ");
        System.out.println("4. По объему ОЗУ: ");
        System.out.println("5. По объему SSD: ");
        System.out.println("6. По цене: \n");


        int j = ValidInt();

        List<Computer> result = new ArrayList<>();

        switch (j) {
            case 1:
                System.out.print("Введите бренд для поиска: ");
                String brand = scanner.nextLine();
                for (Computer comp : computers) {
                    if (comp.getBrand().equalsIgnoreCase(brand)) {
                        result.add(comp);
                    }
                }
                break;
            case 2:
                System.out.print("Введите CPU для поиска: ");
                String cpu = scanner.nextLine();
                for (Computer comp : computers) {
                    if (comp.getCpu().equalsIgnoreCase(cpu)) {
                        result.add(comp);
                    }
                }
                break;
            case 3:
                System.out.print("Введите gpu для поиска: ");
                String gpu = scanner.nextLine();
                for (Computer comp : computers) {
                    if (comp.getGpu().equalsIgnoreCase(gpu)) {
                        result.add(comp);
                    }
                }
                break;
            case 4:
                System.out.print("Введите объем ram для поиска: ");
                int ram = ValidInt();
                for (Computer comp : computers) {
                    if (comp.getRam() == ram) {
                        result.add(comp);
                    }
                }
                break;
            case 5:
                System.out.print("Введите объем ssd для поиска: ");
                int ssd = ValidInt();
                for (Computer comp : computers) {
                    if (comp.getSsd() == ssd) {
                        result.add(comp);
                    }
                }
                break;
            case 6:
                System.out.print("Введите цену для поиска: ");
                int price = ValidInt();
                for (Computer comp : computers) {
                    if (comp.getPrice() == price) {
                        result.add(comp);
                    }
                }
                break;
            default:
                System.out.println("Неверный выбор! \n");
                return;
        }
        resultFindComp(result);
    }

    public void resultFindComp(List<Computer> result) {
        if (result.isEmpty()) {
            System.out.println("Список пуст! \n");
        }
        else {
            System.out.println(result.size() + " результатов поиска: \n");

            for (int i = 0; i < result.size(); i++) {
                System.out.println("Компьютер " + (i+1) + ": \n" + result.get(i));
            }
        }
    }

    public void getAll() {

        if (computers.isEmpty()) {
            System.out.println("Компьютеров нет в магазине!\n");
        }
        else{
            System.out.println("Все компьютеры которые есть в магазине: \n");

            for (int i = 0; i < computers.size(); i++) {
                System.out.println("Компьютер " + (i+1) + ": \n" + computers.get(i));
            }
        }
    }

    private int ValidInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.print("Ошибка! Введите целое число! \n");
            }
        }
    }
}

