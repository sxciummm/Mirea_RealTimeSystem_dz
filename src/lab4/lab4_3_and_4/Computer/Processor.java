package lab4.lab4_3_and_4.Computer;


public class Processor {
    private String Brand;
    private String model;
    private double Ghz;
    private int cores;

    public Processor(String Brand, String model, double Ghz, int cores) {
        this.Brand = Brand;
        this.Ghz = Ghz;
        this.model = model;
        this.cores = cores;
    }

    public String getModel() {return model;}
    public double getGhz() {return Ghz;}
    public String getBrand() {return Brand;}
    public int getCores() {return cores;}

    public double calcPerf() {
        return Ghz*cores;
    }

    public void Info() {
        System.out.println( "Brand: " + Brand + "\n" +
                            "Model: " + model + "\n" +
                            "Ghz: " + Ghz + "\n" +
                            "cores: " + cores + "\n");
    }



    @Override
    public String toString() {
        return "Brand: " + Brand + "\n" +
                "Model: " + model + "\n" +
                "Ghz: " + Ghz + "\n" +
                "cores: " + cores + "\n";
    }

}
