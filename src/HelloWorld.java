import java.util.Scanner;
public class HelloWorld {
        public static void main(String[] args) {
//            String say ="Hello, welcome!";
//            say="Hello,welcome to my page!";System.out.println(say);
//            System.out.println("where are you?");


            int myFavortieNumber = 3;
            System.out.println(myFavortieNumber);



            String myString = "This is my desk.";
            System.out.println(myString);
//char 只能用single'' 不能用""
            double my= 3.14159;
            System.out.println(my);


            long myNumber=123L;
            System.out.println(myNumber);
            //有小數點要用float or double但如果要用float,必須要在後面加上f
            //byte, short, int, long沒有小數點使用

//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);
//            先顯示就數字再顯示結果
//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);
//            先顯示加法後的數字，再顯示結果

            int x = 4;
             x+= 5;
            System.out.println(x);

            int a = 3;
            int b = 4;
            b *= a;
            System.out.println(b);

            int c = 10;
            int d = 2;
            c /= d;
            d -= c;
            System.out.println(c);
            System.out.println(d);

//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;

//            int three = (int) "three";
//            System.out.println(three);

            String name= "Betel";
            String greeting ="Salutation";
            int sum = 100;
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter Something:");
            String userInput = scan.next();
            System.out.println("You enter:--> \""+ userInput+"\"<--");
            //如果有空格只會顯示出一個單字 welcome to java ==> welcome
            //如果要顯示所有字串，使用.nextLine()
            System.out.printf("%s,%s!,%s",greeting, name,sum);
            //如果要輸出必須要有％，如果是字串必需％s,如果是數字％d






        }


}
