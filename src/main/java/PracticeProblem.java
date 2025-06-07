public class PracticeProblem {
    public static void main(String[] args) {

    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

class Chair {
    private int legs;
    private String material;

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }
}
