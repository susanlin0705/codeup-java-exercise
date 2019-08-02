package shapes;

public  class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 4* this.length;
    }

    @Override
    public double getArea() {
        return this.width*this.width;
    }
    //    protected double length;
//    protected double width;
//
//    public Quadrilateral(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() {
//        return this.length;
//    }
//
//    public double getWidth() {
//        return this.width;
//    }


























//    protected double side;
//    public Square (double side){
//        super(side,side);
//        this.side=side;
//    }

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
