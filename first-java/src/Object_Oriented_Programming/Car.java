package Object_Oriented_Programming;

public class Car {
    String brand;
    String color;
    int speed;
    public Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
    public Car(String brand){
        this.brand = brand;
    }
    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
