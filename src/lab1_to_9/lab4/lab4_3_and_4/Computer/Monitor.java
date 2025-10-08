package lab1_to_9.lab4.lab4_3_and_4.Computer;

public class Monitor {
    private String model;
    private double size; //Диагональ
    private int Hz;

    public Monitor(String model, double size, int Hz) {
        this.Hz = Hz;
        this.size = size;
        this.model = model;
    }

    public String getModel() {return model;}
    public double getSize() {return size;}
    public int getHz() {return Hz;}

    public void Info() {
        System.out.println( "Model: " + model + "\n" +
                            "Size: " + size + "\n" +
                            "Hz: " + Hz + "\n");
    }

    @Override
    public String toString() {
        return  "Model: " + model + "\n" +
                "Size: " + size + "\n" +
                "Hz: " + Hz + "\n";
    }
}
