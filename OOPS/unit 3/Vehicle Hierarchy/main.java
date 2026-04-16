class Vehicle {
    int tyres;
    String brand;
    public Vehicle(int tyres, String brand) {
        this.tyres = tyres;
        this.brand = brand;
    }
    public int getTyres() {
        return tyres;
    }
    public String getBrand() {
        return brand;
    }
    public void setTyres(int tyres) {
        this.tyres = tyres;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Tyres: " + tyres);
    }
}
class Car extends Vehicle {
    public Car(int tyres, String brand) {
        super(tyres, brand);
    }
    public void showCar() {
        System.out.println("Car Details:");
        display();
    }
}
class Bike extends Vehicle {
    public Bike(int tyres, String brand) {
        super(tyres, brand);
    }
    public void showBike() {
        System.out.println("Bike Details:");
        display();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Toyota");
        Bike bike = new Bike(2, "Yamaha");
        car.showCar();
        System.out.println();
        bike.showBike();
    }
}
