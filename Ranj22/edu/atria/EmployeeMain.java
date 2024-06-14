package edu.atria;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner src= new Scanner(System.in);
System.out.println("Enter the employee details....");
int id=src.nextInt();
String name=src.next();
double salary=src.nextDouble();
String designation=src.next();
//className objName = new className();
Employee eOne= new Employee1(10,"Rahul",500000,"Developer");
/*eOne.setId(id);
eOne.setName(name);
eOne.setSalary(salary);
eOne.setDesignation(designation);
System.out.println("printing the employee id:",eOne.getId());
System.out.println("printing the employee name:",eOne.getName());
System.out.println("printing the employee salary:",eOne.getSalary());
System.out.println("printing the employee designation:",eOne.getDesignation());*/
		//calling the parameterized constructor
		Employee eOne=new Employee(10,"Rahul",500000,"Developer");
		System.out.println(eOne);
	}

}
