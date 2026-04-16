interfacePayable{
doublecalculateSalary();
}
abstract class Person { protectedStringname; protected int id; Person() {
name="Unknown"; id = 0;
}
Person(Stringname,intid){ this.name = name;
this.id= id;
}
abstractvoiddisplay();
}
classDepartment{
privateStringdeptName; Department() {
deptName="General";
}
Department(StringdeptName){ this.deptName = deptName;
}
publicStringgetDeptName(){ return deptName;
}
}
classEmployeeextendsPersonimplementsPayable{ private double basicPay;
privateDepartmentdepartment; Employee() {
super();
 
basicPay=0;
department=newDepartment();
}
Employee(Stringname,intid,doublebasicPay,Departmentdepartment){ super(name, id);
this.basicPay = basicPay; this.department=department;
}
publicdoublegetBasicPay(){ return basicPay;
}
publicvoidsetBasicPay(doublebasicPay){ this.basicPay = basicPay;
}
public double calculateSalary() { returnbasicPay+(0.2*basicPay);
}
void display() { System.out.println("EmployeeID:"+id); System.out.println("Name: " + name);
System.out.println("Department:"+department.getDeptName()); System.out.println("Salary: " + calculateSalary());
}
}
publicclassEmployeeManagementSystem{ public static void main(String[] args) {
Departmentd1=new Department("AIDS");
Employeee1=newEmployee("Varsha",101,50000,d1); e1.display();
}
}
