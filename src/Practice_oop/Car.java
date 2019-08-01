package Practice_oop;

class Vehicle {
    public String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, !");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
//        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}