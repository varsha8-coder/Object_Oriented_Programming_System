class Vehicle {
    int id;
    String name;
    String brand;

    Vehicle(int id, String name, String brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }
    void showDetails() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Vehicle Name: " + name);
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle {
    int seats;
    Car(int id, String name, String brand, int seats) {
        super(id, name, brand);
        this.seats = seats;
    }
    void showDetails() {
        System.out.println("\n--- Car Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Seats: " + seats);
    }
}
class Bike extends Vehicle {
    int seats;
    Bike(int id, String name, String brand, int seats) {
        super(id, name, brand);
        this.seats = seats;
    }
    void showDetails() {
        System.out.println("\n--- Bike Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Seats: " + seats);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car(101, "Sedan", "Toyota", 5);
        Vehicle v2 = new Bike(102, "Scooter", "Honda", 2);
        v1.showDetails();
        v2.showDetails();
    }
}
