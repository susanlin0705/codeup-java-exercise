import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately "+pi);
        System.out.printf("The value of pi is approximately %.2f%n ",pi);

        //數字
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter something: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //字串
        Scanner printWord = new Scanner(System.in);
        System.out.println("Enter Here: ");
        String sentence = printWord.nextLine();
        System.out.println("You entered=:-->\""+ sentence +"\"<--");

        //字串一個字
        Scanner printSingleWord = new Scanner(System.in);
        System.out.println("Type three words : ");
        String firstWord= printSingleWord.next();
        String secondWord= printSingleWord.next();
        String thirdWord= printSingleWord.next();
        System.out.println("The first word is: " +firstWord);
        System.out.println("The second word is : " +secondWord);
        System.out.println("The third word is : " +thirdWord);



        Scanner classroom = new Scanner(System.in);
        System.out.println("Enter Length of the classroom : ");
        int len = classroom.nextInt();
        System.out.println("The length is:" + len);
        System.out.println("Enter breadth of the classroom : ");
        int bre = classroom.nextInt();
        int area = len*bre;
        System.out.println("The Breadth is :" + bre);

        System.out.println("The total is : " +area);

    }



}
