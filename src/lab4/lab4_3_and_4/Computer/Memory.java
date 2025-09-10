package lab4.lab4_3_and_4.Computer;

public class Memory {
    private String model;
    private int capacity;
    private String type;
    private Double speed;

    public Memory(String model, int capacity, String type, double speed) {
        this.model = model;
        this.capacity = capacity;
        this.type = type;
        this.speed = speed;
    }

    public String getModel() {return model;}
    public int getCapacity() {return capacity;}
    public double getSpeed() {return speed;}
    public String getType() {return type;}

    public void Info() {
        System.out.println( "Brand: " + model + "\n" +
                            "Capacity: " + capacity + " GB" + "\n" +
                            "Speed: " + speed + " MHz" +"\n" +
                            "Type: " + type + "\n");
    }

    @Override
    public String toString() {
        return "Brand: " + model + "\n" +
                "Capacity: " + capacity + " GB" + "\n" +
                "Speed: " + speed + " MHz" +"\n" +
                "Type: " + type + "\n";
    }

}
