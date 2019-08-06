package grades;

import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student victor = new Student("Victor");
        victor.addGrade(100);
        victor.addGrade(100);
        victor.addGrade(90);
        Student susan = new Student("Susan");
        susan.addGrade(90);
        susan.addGrade(50);
        susan.addGrade(80);
        Student peter = new Student("Peter");
        peter.addGrade(100);
        peter.addGrade(60);
        peter.addGrade(70);
        Student mario = new Student("Mario");
        mario.addGrade(90);
        mario.addGrade(100);
        mario.addGrade(80);

        students.put("victorpena", victor);
        students.put("peterhollman", peter);
        students.put("mariojohnson", mario);
        students.put("susanlin", susan);

//        System.out.println(students);
//        System.out.println(victor.getGradeAverage());
        System.out.println("students.keySet() = " + students.keySet()); //github用戶所有名稱
//        System.out.println("What student would you like to see more information on? If not please type 'stop'");
//
        boolean keepgoing = true;
//        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("What student would you like to see more information on? If not please type 'stop'");
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

                if (userInput.equalsIgnoreCase("victorpena")){
                    System.out.println(students.get("victorpena").getName()+" |  Github name: "+  userInput +"  |  "+victor.getGradeAverage() );
                }else if(userInput.equalsIgnoreCase("peterhollman")){
                    System.out.println(students.get("peterhollman").getName()+" |  Github name: "+  userInput +"  |  "+peter.getGradeAverage());
                }else if (userInput.equalsIgnoreCase("susanlin")){
                    System.out.println(students.get("susanlin").getName()+" |  Github name: "+  userInput +"  |  "+susan.getGradeAverage());
                }else if (userInput.equalsIgnoreCase("mariojohnson")){
                    System.out.println(students.get("mariojohnson").getName()+" |  Github name: "+  userInput +"  |  "+mario.getGradeAverage());
                }else if(userInput.equalsIgnoreCase("Stop")) {
                    keepgoing = false;
                }else {
                    System.out.println("這個人不存在！This person does not exist");
                }
//            }
        }while(keepgoing);

//        System.out.println(students.get("victorpena").getName());// 名字


    //--------------------------the walk through----------------------------//

//        public class GradesApplication {
//            static HashMap<String, Student> students = new HashMap<>();
//
//
//            public static void main(String[] args) {
//                showStudents();//放置在加入成績之後
//            }
//
//            public static void showStudents(){
//                System.out.println("Here is Github username");
//                for (String username: students.keySet()){
//                    System.out.print(username + " | " );
//                }
//            }
//
//        }








    }
}
