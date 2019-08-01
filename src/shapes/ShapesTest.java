package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Square mySquare = new Square(5);
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(mySquare.getPerimeter());
        System.out.println(box1.getPerimeter());
    }
}
