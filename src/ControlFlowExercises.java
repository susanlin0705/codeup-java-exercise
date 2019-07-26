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
        int j = 5;
        while (j <= 15) {
            System.out.println(j);
            j++;
        }

        //example 2-1
        int k = 2;
        do {
            System.out.println(k);
            k += 2;
        }
        while (k < 100);


        //example 2-2
        int l = 100;
        do {
            System.out.println(l);
            l -= 5;
        }
        while (l >= 5);

        //example 2-3
        long i = 2;
        do {
            System.out.println(i);
            i *= i;
        }
        while (i < 1000000);

        //example 3
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scan.nextInt();
        System.out.println("What number would you like to stop at: ");
        int userInput = scan.nextInt();
        System.out.println("Here is your table\n");
        System.out.println("number | squared | cubed \n"+"==================\n");
        for(int g=1; g<=userInput;g++){
            System.out.println(g + "      | " + g*g + "      | " + g*g*g + "\n");
        }
//        System.out.println("Would you like to continue?");

        //example 4
        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter the grade from 0 to 100.");
        int userGrade= grade.nextInt();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Do you want to continue?[y/N]");
//        String answer = sc.next();
//        boolean newconfirm= answer.equals("y");

        if (userGrade>=88){
            System.out.println("You got A!");
        }else if(userGrade<88 || userGrade>=80){
            System.out.println("You got B!");
        }else if(userGrade<80 || userGrade>=67){
            System.out.println("You got C!");
        }else if(userGrade<67 || userGrade>=60){
            System.out.println("You got D!");
        }else{
            System.out.println("You got F!");
        }








    }
}
