package Object_Oriented_Programming;

public class ClassesObjectsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini", "Yellow", 200);
//        car1.brand = "Lamborghini";
//        car1.color = "Yellow";
//        car1.speed = 200;
        car1.drive();

        Car car2 = new Car("Mercedes", "White", 145);
        car2.drive();

        Car car3 = new Car("Ferrari");
        car3.drive();
        car2.setSpeed(500);
        System.out.println(car2.brand + "'s speed is updated to " + car2.getSpeed());
    }
}
