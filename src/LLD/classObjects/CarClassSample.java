package LLD.classObjects;

class Car {
    private String model;
    private String brand;
    private int speed;

    //Parameterized Constructor
    public Car(String model,String brand,int speed) {
        this.model = model;
        this.brand = brand;
        this.speed = speed;
    }
    //Method to Accelerate
    public void accelerate(int increment) {
        speed += increment;
    }
    public void displayInfo() {
        System.out.println(brand + " this is of Speed " + speed);
    }
}
public class CarClassSample {
    public static void main(String[] args) {
        Car obj = new Car("Civic","Honda",100);
        obj.accelerate(120);
        obj.displayInfo();
    }
}
