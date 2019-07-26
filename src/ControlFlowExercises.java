import java.util.Scanner;

public class ControlFlowExercises {

    static void fizzBuzz(int num){
        for (int i = 1; i<=num ; i++){
            if(i%15==0){
                System.out.println("fizzBuzz");
            }else if(i%5==0){
                System.out.println("buzz");
            } else if (i%3 == 0) {
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }


    }




    public static void main(String[] args) {
        fizzBuzz(30);

        //example 1
//        int j = 5;
//        while (j <= 15) {
//            System.out.println(j);
//            j++;
//        }
        for (int j =5; j<=15; j++){
            System.out.println(j);
        }

        //example 2-1
//        int k = 2;
//        do {
//            System.out.println(k);
//            k += 2;
//        }
//        while (k < 100);
        for (int k=2; k<100; k+=2){
            System.out.println(k);
        }


        //example 2-2
//        int l = 100;
//        do {
//            System.out.println(l);
//            l -= 5;
//        }
//        while (l >= 5);

        for (int l=100; l>=-10; l-=5){
            System.out.println(l);
        }

        //example 2-3
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }
//        while (i < 1000000);

        for (long i= 2; i<1000000; i*=i){
            System.out.println(i);
        }

        //example 3
        Scanner scan = new Scanner(System.in);
//            String answers;
//        System.out.println("Enter an integer: ");
//        int userInput = scan.nextInt();
        String answers= scan.nextLine();
        do {
            System.out.println("What number would you like to stop at: ");
            int userInput = scan.nextInt();
            System.out.println("Here is your table\n");
            System.out.println("number | squared | cubed \n" + "=======================\n");
            for (int g = 1; g <= userInput; g++) {
                System.out.printf(g + "      | " + g * g + "       | " + g * g * g + "\n");
            }
            System.out.println("Would you like to continue (y/n)?");

            }while (answers.equalsIgnoreCase("y"));


        //example 4
        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter the grade from 0 to 100.");
        int userGrade = grade.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue?[y/N]");
        String answer = sc.next();
        boolean newconfirm = answer.equals("y");
        if (newconfirm) {

            if (userGrade >= 88) {
                System.out.println("You got A!");
            } else if (userGrade < 88 || userGrade >= 80) {
                System.out.println("You got B!");
            } else if (userGrade < 80 || userGrade >= 67) {
                System.out.println("You got C!");
            } else if (userGrade < 67 || userGrade >= 60) {
                System.out.println("You got D!");
            } else {
                System.out.println("You got F!");
            }
        }
    }







    }

