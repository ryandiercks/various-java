import java.util.Scanner;
public class Car {

    private int yearmake; // Variable of your yearmake of car
    private String model; // Variable of your car company
    private int speed;  // Variable of your car speed

    // getter and setter method as the pojo class defines that will give getter and setter property for the every variable inside class as according to OP it wont let u change Variable directly

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearmake() {
        return yearmake;
    }

    public void setYearmake(int yearmake) {
        this.yearmake = yearmake;
    }

    public Car(int speed) {
        this.speed = speed;
    }
   // constructor which will accepts and initialize your car with data i mean class
    public Car(int yearmake, String model, int speed) {
        this.yearmake = yearmake;
        this.model = model;
        this.speed = speed;
        System.out.println("Year Make " + yearmake);
        System.out.println("Model " + model);
        System.out.println("Speed " + speed);

    }
    // method of the making accelerate car by speed of 5 
    public int acclarate(int speed) {
        speed = speed + 5;
        System.out.println("Speed Acclarated " + speed);
        return speed;
    }
   // method for reducing speed of 5
    public int Breaking(int speed) {
        speed = speed - 5;
        System.out.println("Speed Breaking " + speed);
        return speed;
    }
   // main method
    public static void main(String[] args) {
        // accept from user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the car's made year model: ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the car's make Company: ");
        String make = keyboard.nextLine();
        System.out.println("Enter the car's speed: ");
        int speedIn = keyboard.nextInt();
        // initialize car model with constructor
        Car c = new Car(year, make, speedIn);

        //increasing speed with use of method and loop
        for (int i = 0; i < 5; i++) {
            int speedchange = c.acclarate(c.getSpeed());
            c.setSpeed(speedchange);

        }
        //decreasing speed according to your requriement with use of method and loop
        for (int i = 0; i < 5; i++) {
            int decreasedpeed = c.Breaking(c.getSpeed());
            c.setSpeed(decreasedpeed);
        }

    }
}
