package HW2;

public class Resoultion {
    private int widith , height;
    public Resoultion(int widith, int height) {
        this.widith = widith;
        this.height = height;
    }

    public int getWidith() {
        return widith;
    }

    public void setWidith(int widith) {
        this.widith = widith;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Resoultion{" +
                "widith=" + widith +
                ", height=" + height +
                '}';
    }

}
