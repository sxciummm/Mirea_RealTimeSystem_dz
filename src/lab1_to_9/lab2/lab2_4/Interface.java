package lab1_to_9.lab2.lab2_4;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виртуальный консольный магазин пк!!! \n");


        boolean run = true;
        while (run) {
            menu();

            try {
                int j = Integer.parseInt(scanner.nextLine());
                if (j>0 && j<6) {
                    switch (j) {
                        case 1:
                            shop.addComp();
                            break;
                        case 2:
                            shop.delComp();
                            break;
                        case 3:
                            shop.getAll();
                            break;
                        case 4:
                            shop.findComp();
                            break;
                        case 5:
                            run = false;
                            System.out.println("Программа остановлена!");
                    }
                }
                else {
                    System.out.println("Неверная позиция! \n");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Неверная позиция! \n");
            }
        }
    }

    private static void menu() {
        System.out.println("1. Добавить компьютер");
        System.out.println("2. Удалить компьютер ");
        System.out.println("3. показать ассартимент");
        System.out.println("4. поиск компьютеров ");
        System.out.println("5. Выход \n");
    }
}

