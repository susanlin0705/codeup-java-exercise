//package shapes;
//import util.Input;
//
//public class CircleApp {
//    public static void main(String[] args) {
//       Circle input = new Circle(5);
//       System.out.print("the radius is: ");
//        System.out.println(input.getArea());
//        System.out.println("the circumference is:");
//        System.out.println(input.getCircumference());
//
//
//    }
//}
package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("What is the radius of this circle");
        Circle ourFunCircle = new Circle(radius);
        System.out.printf("Area of circle = %f%n", ourFunCircle.getArea());
        System.out.printf("Area of circle = %f%n", ourFunCircle.getCircumference());
    }
}
//this is circle app
