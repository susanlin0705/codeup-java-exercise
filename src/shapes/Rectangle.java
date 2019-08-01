package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length*this.width;

    }

    public double getPerimeter() {
        return this.length*2+ this.width*2;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4,5);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
    }

}

