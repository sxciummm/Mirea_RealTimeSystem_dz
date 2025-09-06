package lab2.lab2_4;

public class Computer {
    private String brand;
    private String cpu;
    private String gpu;
    private int ram;
    private int ssd;
    private int price;


    public Computer(String brand, String cpu, String gpu, int ram, int ssd, int price) {
        this.brand = brand;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
    }

    public double getPrice() {return price;}
    public int getRam() {return ram;}
    public int getSsd() {return ssd;}
    public String getBrand() {return brand;}
    public String getCpu() {return cpu;}
    public String getGpu() {return gpu;}


    public void setCpu(String cpu) {this.cpu = cpu;}
    public void setGpu(String gpu) {this.gpu = gpu;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setPrice(int price) {this.price = price;}
    public void setRam(int ram) {this.ram = ram;}
    public void setSsd(int ssd) {this.ssd = ssd;}

    @Override
    public String toString() {
        return "Брэнд: " + brand + "\n" +
                "Процессор:  " + cpu + "\n" +
                "Видеокарта: " + gpu + "\n" +
                "ОЗУ: " + ram + " GB" + "\n" +
                "Память: " + ssd + " GB" + "\n" +
                "Цена: " + price + " RUB" + "\n";
    }
}

