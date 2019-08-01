package shapes;

public class Square extends Rectangle {
    protected double side;
    public Square (double side){
        super(side,side);
        this.side=side;
    }

//    public double getArea() {
//        return this.side * this.side;
//    }
//
//    public double getPerimeter(){
//        return 4 * this.side;
//    }

//    public double getArea(){
//            return super.getArea();
//    }
//    public double getPerimeter() {
//        return super.getPerimeter();
//    }
//
//    public static void main(String[] args) {
//        Square square= new Square(4);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//    }
}
