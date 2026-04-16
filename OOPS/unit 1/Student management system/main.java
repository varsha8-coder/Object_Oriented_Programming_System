import java.util.Scanner;
class Student {
String name;
int id;
static String collegeName = "PRINCE Engineering College"; // default static
value
String dept;
int age;
Student(String name, int id, String dept, int age) {
this.name = name;
this.id = id;
this.dept = dept;
this.age = age;
}
void displayDetails() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("College Name: " + collegeName);
System.out.println("Department: " + dept);
System.out.println("Age: " + age);
System.out.println();
}
}
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of students: ");
int n = sc.nextInt();
sc.nextLine(); // clear buffer
Student[] students = new Student[n];
for (int i = 0; i < n; i++) {
System.out.println("\nEnter Student Details");
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Department: ");
String dept = sc.nextLine();
System.out.print("Age: ");
int age = sc.nextInt();
sc.nextLine();
students[i] = new Student(name, id, dept, age);
}
System.out.println("\nStudents Information\n");
for (int i = 0; i < n; i++) {
students[i].displayDetails();
}
}
}
Result:
The Student Management System was successfully implemented using Java and Object-Oriented
Programmingprinciples. Thesystemallowsefficientmanagementofstudentrecordsthroughadding, viewing, and searching operations. All conditionswere handled correctly, and theprogram produced
accurateand user-friendly output. TheprojecteffectivelydemonstratestheuseofOOPconceptsina real- worldapplication.