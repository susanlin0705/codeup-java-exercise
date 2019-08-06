package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrade;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrade = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){

        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){

        studentGrade.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total=0;
//        for(int i = 0; i < studentGrade.size(); i++){
//             total= total+studentGrade.get(i);
//        }
//        return  total/studentGrade.size();
        //另一種方式
        for (int grade : studentGrade){
           total+= grade;
        }
        return total/studentGrade.size();
    }

    public static void main(String[] args) {
        Student studentA = new Student("David");
        System.out.println(studentA.studentName);
        studentA.addGrade(96);
        System.out.println(studentA.studentGrade);
        studentA.addGrade(80);
        System.out.println(studentA.studentGrade);
        System.out.println("studentA.getGradeAverage() = " + studentA.getGradeAverage());

    }

}

