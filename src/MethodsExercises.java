import  java.util.Scanner;
public class MethodsExercises {
    public static double Addition(double a, double b){
        return a+b;
    }
//    visibility ownership returnType methodName(paramType paramName,......) {
//        returnType something;
//        return something;
//    }
    public static double Subtraction(double a, double b){
        return a-b;
    }
    public static double Multiplication(double a, double b){
        return a*b;
    }
    public static double Division(double a, double b){
        return a/b;
    }
    public static double Modulus(double a, double b){
        return a%b;
    }
    public static int getInterger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 10");
        int number = scan.nextInt();

        if (number < min || number > max) {
            number =getInterger(min,max);
        }
        return number;
    }

    public static String fact(){
        int num = getInterger(1,10);
        String output = "";
        int total=1;
        for (int i = 1; i <=num ; i++) {
            total *= i;
            output += i + "! = " + (total) + "\n";
        }
        return output;
    }




        public static void main (String[]args){
            System.out.println(Addition(2, 3));
            System.out.println(Subtraction(2, 3));
            System.out.println(Multiplication(2, 3));
            System.out.println(Division(2, 3));
            System.out.println(Modulus(4, 3));
            System.out.println(getInterger(1, 10));
            System.out.println(fact());

        }


    }





