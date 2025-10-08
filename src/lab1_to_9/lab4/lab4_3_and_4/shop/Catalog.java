package lab1_to_9.lab4.lab4_3_and_4.shop;

import lab1_to_9.lab4.lab4_3_and_4.Computer.Computer;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Computer> computers;
    private String name;

    public Catalog(String name) {
        this.computers = new ArrayList<>();
        this.name = name;
    }

    public List<Computer> getComputers() {return computers;}
    public String getName() {return name;}

    public void addComputer(Computer comp) {
        computers.add(comp);
    }

    public void viewCatalog() {
        System.out.println("=== ТОВАРЫ В КАТАЛОГЕ: " + name + " ===");
        if (computers.isEmpty()) {
            System.out.println("Каталог пуст!");
        }
        else {
            for (int i = 0;i< computers.size(); i++) {
                Computer computer = computers.get(i);
                System.out.println("Компьютер № " + (i+1) + ": ------------------------------- \n");
                computer.FullInfo();
            }
        }
    }
}
