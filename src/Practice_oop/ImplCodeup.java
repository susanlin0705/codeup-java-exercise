package Practice_oop;

public class ImplCodeup {
    public static void main(String[] args) {
        //員工工作是什麼
        Employee fer= new Accountant(2000,"fer" ,"web");
        System.out.println("fer.work()= " + fer.work());
        System.out.println("fer = " + fer.name);
        System.out.println(fer.getSalary());
        fer.setSalary(300000);
        System.out.println("new salary"+fer.getSalary());

        Employee Dane = new Developer(2500,"Dane","designer");
        System.out.println("Name = " + Dane.name);
        System.out.println(Dane.work());
        System.out.println(Dane.getSalary());

    }

}
