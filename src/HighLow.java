import  java.util.Scanner;
public class HighLow {

    public static int random(int max){
        return (int)(Math.random() * max) + 1;
    }

    public static int pickANumber() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number from 1 to 100");
        int pickANumber = scan.nextInt();
        int number = random(100);
        do {

        System.out.println("guess the number");

            if (pickANumber > number) {
                System.out.println("Too high");
            } else if (pickANumber < number) {
                System.out.println("Too low");
            } else {
                System.out.println("You got it right");

            }return number;

        } while (true);
    }

    public static void main(String[] args) {
        System.out.println(pickANumber());
    }



}
