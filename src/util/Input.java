package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("type something here");
        String userInput = scanner.nextLine();
        return userInput;
    }


    public boolean yesNo() {
        System.out.println("Please enter yes or no");
        String y = scanner.next();
        if (y.equals("y")|| y.equals("yes")) {
            return true;
        }
        return false;
    }


        public int getInt(int min, int max){
        System.out.print("Enter a number between " + min + " and " + max);
        do {
            double userInput = scanner.nextInt();
            if (userInput < min){
                System.out.println("That's too low ");
            } else if(userInput > max){
                System.out.println("That's too high");
            } else {
                return (int)userInput;
            }
        } while(true);



//        return this.scanner.nextInt();
    }



    public int getInt(){
        System.out.println("Please enter an number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }


    public double getDouble(double min, double max){
        System.out.print("Enter a number between " + min + " and " + max);
        do {
            double userInput = scanner.nextDouble();
            if (userInput < min){
                System.out.println("That's too low ");
            } else if(userInput > max){
                System.out.println("That's too high");
            } else {
                return (int)userInput;
            }
        } while(true);


    }

    public double getDouble(){
        System.out.println("Please enter a number: ");
        double number= scanner.nextDouble();
        return number;
    }

}
