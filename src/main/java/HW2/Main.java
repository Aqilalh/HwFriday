package HW2;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(4,5,10);
        Resoultion resoultion = new Resoultion(5,4);
        Motherboard motherboard = new Motherboard("fz200","HP",4,4,"");
        Monitor monitor = new Monitor(resoultion,"fz200","HP");
        Case case1 = new Case("fz200","HP","HP",dimension);
        PC pc1 = new PC(case1,motherboard,monitor);
        pc1.description();
        pc1.powerUp();
    }
}
