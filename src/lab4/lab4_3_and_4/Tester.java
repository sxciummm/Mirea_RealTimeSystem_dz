package lab4.lab4_3_and_4;

import lab4.lab4_3_and_4.Computer.*;
import lab4.lab4_3_and_4.shop.Catalog;
import lab4.lab4_3_and_4.shop.Interface;
import lab4.lab4_3_and_4.shop.User;


public class Tester {
    public static void main(String[] args) {
        Processor proc = new Processor("AMD", "x7", 1.1,1);
        Processor proc1 = new Processor("AMD1", "x71", 1.11,11);
//        System.out.println(proc);

        Memory memory = new Memory("test1", 121, "DDR41", 25.11);
        Memory memory1 = new Memory("test1", 121, "DDR41", 25.11);
//        System.out.println(memory);

        Monitor monitor = new Monitor("test", 24.1,25);
        Monitor monitor1 = new Monitor("test123", 24.1123,25123);
//        System.out.println(monitor);

//        proc.Info();
//        memory.Info();
//        monitor.Info();

        Computer computer = new Computer(monitor, memory, proc, ComputerBrand.LENOVO, 199999);
        Computer computer1 = new Computer(monitor1, memory1, proc1, ComputerBrand.LENOVO,  1525125);

//        computer.FullInfo();

        User user = new User("test", "test");


        user.addToCart(computer);
        user.addToCart(computer1);

//        user.viewCart();

//        user.clearCart();

        Catalog catalog = new Catalog("Computers");
        catalog.addComputer(computer);
        catalog.addComputer(computer1);

        System.out.println();
        catalog.viewCatalog();
    }
}
