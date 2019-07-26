import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately "+pi);
        //會有選擇小數點%._f%n
        System.out.printf("The value of pi is approximately %.2f ",pi);

        //數字
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter something: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //如果要有小數點，要用
        // double userInput = scanner.nextDouble()



        //字串一個字
//        Scanner printSingleWord = new Scanner(System.in);
        System.out.println("Type three words : ");
        String firstWord= scanner.next();
        String secondWord= scanner.next();
        String thirdWord= scanner.next();
        System.out.println("The first word is: " +firstWord);
        System.out.println("The second word is : " +secondWord);
        System.out.println("The third word is : " +thirdWord);
        scanner.nextLine();
        //可以用scanner.nextLine()到下一行
        //字串
//        Scanner printWord = new Scanner(System.in);
        System.out.println("Enter Here: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered=:-->\""+ sentence +"\"<--");





//      Scanner classroom = new Scanner(System.in);
        System.out.println("Enter Length of the classroom : ");
        double len = scanner.nextDouble();
        System.out.println("The length is:" + len);
        System.out.println("Enter breadth of the classroom : ");
        double bre = scanner.nextDouble();
        double area = len*bre;
        double perim = (len*2 + bre*2);
        System.out.println("The Breadth is :" + bre);

        System.out.println("The total is : " +area);
        System.out.printf("The total perim is : %.2f" , perim);

    }



}
