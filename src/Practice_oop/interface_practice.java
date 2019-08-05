package Practice_oop;

abstract class Employee {


    private double salary;
    protected String name;
    protected String department;


    //constructor
    public Employee(double salary, String name, String department) {
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }
// 不需要因為可以從implcodeup讀取
//    public String getName() {
//        return this.name;
//    }
//
//    public String getDepartment() {
//        return this.department;
//    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    //employee has ti work in order to be

    public abstract String work();



}
