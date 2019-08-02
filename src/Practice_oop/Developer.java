package Practice_oop;

public class Developer extends Employee {
    //compiling time
    //@Override

    public Developer(double salary, String name, String department) {
        super(salary, name, department);
    }

    public String work() {
        return "working code!";
    }
}
