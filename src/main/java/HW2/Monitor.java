package HW2;

public class Monitor {
private Resoultion resoultion;
    private String model, manufacturer;
    public Monitor(Resoultion resoultion, String model, String manufacturer) {
        this.resoultion = resoultion;
        this.model = model;
        this.manufacturer = manufacturer;
    }



    public Resoultion getResoultion() {
        return resoultion;
    }

    public void setResoultion(Resoultion resoultion) {
        this.resoultion = resoultion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    } @Override
    public String toString() {
        return "Monitor{" +
                "resoultion=" + resoultion +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }public void drawPixel(int x,int y,String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);
    }
}
