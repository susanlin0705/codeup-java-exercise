package Practice_oop;

public class Accountant extends Employee {


    public Accountant(double salary, String name, String department){
        super(salary,name, department);
    }
    public String work(){
        return "crunching numbers";
    }



}
