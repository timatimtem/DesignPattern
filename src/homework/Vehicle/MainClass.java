package homework.Vehicle;

public class MainClass {
    public static void main(String[] args) {

        Vehicle plane = new Plane(1,1,1000);
        ((Plane)plane).setPassengers(500);
        plane.performfly(10000, 800);


        Vehicle car = new Car(2,3, 100);
        car.performDrive(320);
    }
}
