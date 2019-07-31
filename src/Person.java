public class Person {


    //this is the variable
    private String name;
    private int age;
//    static int totalPeople;
    // constructor way----------//
    public Person(String name, int age){
        this.name=name;
        this.age=age;
//
//        totalPeople++;
    }

    //returns the people's name
    public int getAge(){
        return this.age;
    }
    //changes the name property to the passed value
    public void setAge(int yourAge){
        this.age=yourAge;
    }
    public void sayAge(){
        System.out.println("you age is " + getAge());
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("hello "+getName());
    }
//    public boolean canHaveSexWith(Person person) {
//        if (this.age >= 18 && person.getAge() >= 18) {
//            return true;
//        }
//
//        return false;
//    }

//    public static int getTotalPeople() {
//        return totalPeople;
//    }

    public static void main(String[] args) {
//        Person personA= new Person("Dane",32);
////        personA.setName("Jason ");
//        System.out.println(personA.getName());
//
//        personA.sayHello();
//
//        personA.setAge(24);
//        personA.sayAge();
//
//
//        Person personB= new Person("Meng-han",21);
//        personB.sayHello();
//        personB.setName("Susan");
//        personB.setAge(15);
//        personB.sayHello();
//        personB.sayAge();
//
//        System.out.println(personB.canHaveSexWith(personA));
//        System.out.println(Person.getTotalPeople());
//    }

        //------------This is exercise 2 understanding ------------//
        //-----example 1------------//
//        Person person1 = new Person("John",30);
//        Person person2 = new Person("John",30);
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //-----example 2------------//
        Person person1 = new Person("John",32);
        person1.setName("dave");
        System.out.println(person1.name);
        Person person2 = person1;
        System.out.println(person1 == person2);
        System.out.println(person1.getName().equals(person2.getName()));


        //-----example 3------------//
//        Person person1 = new Person("John",32);
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}


