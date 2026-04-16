import java.util.*;
class Product {
 int id;
 String name;
 int quantity;
 double price;
 Product(int id, String name, int quantity, double price) {
 this.id = id;
 this.name = name;
 this.quantity = quantity;
 this.price = price;
 }
 public String toString() {
 return "ID: " + id + " | Name: " + name +
 " | Quantity: " + quantity +
 " | Price: " + price;
 }
}
public class Main {
 static HashMap<Integer, Product> stock = new HashMap<>();
 static int autoId = 1;
 public static void addProduct(String name, int qty, double price) {
 Product p = new Product(autoId, name, qty, price);
 stock.put(autoId, p);
 System.out.println("Product added with ID: " + autoId);
 autoId++;
 }
 public static void displayProducts() {
 if(stock.isEmpty()){
 System.out.println("Inventory is empty");
 return;
 }
 for(Product p : stock.values()){
 System.out.println(p);
 }
 }
 public static void main(String[] args) {
 addProduct("Pen", 50, 10);
 addProduct("Notebook", 30, 40);
 addProduct("Pencil", 100, 5);
 System.out.println("Inventory Products:");
 displayProducts();
 }
}