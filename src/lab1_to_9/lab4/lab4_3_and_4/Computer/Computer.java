package lab1_to_9.lab4.lab4_3_and_4.Computer;

public class Computer {
    private Monitor monitor;
    private Memory memory;
    private Processor processor;
    private ComputerBrand brand;
    private double price;

    public Computer(Monitor monitor, Memory memory, Processor processor, ComputerBrand brand, double price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    public ComputerBrand getBrand() {return brand;}
    public Processor getProcessor() {return processor;}
    public Memory getMemory() {return memory;}
    public Monitor getMonitor() {return monitor;}
    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public void FullInfo() {
        System.out.println("--- КОМПЬЮТЕР ---");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " RUB \n");

        System.out.println("--- ПРОЦЕССОР ---");
        processor.Info();

        System.out.println("--- ПАМЯТЬ ---");
        memory.Info();

        System.out.println("--- МОНИТОР ---");
        monitor.Info();
    }
}
