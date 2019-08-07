package util;

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
        System.out.println("Please enter yes or no: ");
        String y = scanner.nextLine();
        //String y=this.scanner.nextLine();
        if (y.equalsIgnoreCase("y")|| y.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }


        public int getInt(int min, int max) {
            System.out.print("Enter a number between " + min + " and " + max);

            do {
                double userInput = scanner.nextInt();
                if (userInput < min) {
                    System.out.println("That's too low ");
                } else if (userInput > max) {
                    System.out.println("That's too high");
                } else {
                    return (int) userInput;
                }
            } while (true);

// ----------- other way to write the code----------------
//          int answer= scanner.nextInt();
//            do{
//                System.out.println("Please enter a number between %d and %d:",min,max);
//            if (answer >= min && answer <= max) {
//                return answer;
//            }
//        }while(true);

    }
    //using exception try catch
    public int getInt(){
        String num;
        try{
        num= scanner.nextLine();
             return Integer.valueOf(num);
        }catch (NumberFormatException e){
            System.out.println("try again. error"+ e.getMessage());
            return getInt();
        }
    }

//
//    public int getInt(){
//        System.out.println("Please enter a number: ");
//        int userInput = scanner.nextInt();
//        return userInput;
//    }


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
        System.out.println("Please enter a number with decimal: ");
        double number= scanner.nextDouble();
        return number;
    }

    public static double getDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double inputDec = scanner.nextDouble();
        return inputDec;
    }

}
