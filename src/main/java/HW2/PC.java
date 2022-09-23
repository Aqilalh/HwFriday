package HW2;

public class PC {
   private Case case1;
   private Motherboard motherboard;
   private Monitor monitor;

    public Case getCase1() {
        return case1;
    }

    public void setCase1(Case case1) {
        this.case1 = case1;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "case1=" + case1 +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }

    public PC(Case case1, Motherboard motherboard, Monitor monitor) {
        this.case1 = case1;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
        private void drawLogo() {
          monitor.drawPixel(4,4,"red");
        }
        public void description() {
            System.out.println("Welcome to worst buy below is the description of the pc on sale today" + case1 + monitor + motherboard);
        } public void powerUp(){
        case1.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("BestPc");
    }

    }

