public class RollerCoaster implements RideAble{
   // private String name;
    //private int qty;
    private double price;
    // private Engine engine;
    private final double tax = .20;
    private float speed;

    public RollerCoaster(double price, float speed) {
        //this.name = name;
        //this.qty = qty;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int milesPerHour() {
        return (int) this.speed;
    }
}
