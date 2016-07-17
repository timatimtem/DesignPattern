package homework.Vehicle;

public abstract class Vehicle {
    int passengers;
    int yearOfMade;
    int x;
    int y;
    int price;
    int speed;
    FlyBehavior flyBehavior;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public abstract void performfly(int height, int speed) ;
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;}

}
