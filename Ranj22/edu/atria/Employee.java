//program to demonstrate classes and objects,constructors,Scanner class
package edu.atria;
//class
public class Employee {
	//data methods
private int id;
private String name;
private double salary;
private String designation;
//parameterized constructor
public Employee(int id,String name,double salary, String designation) {
	super();
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.designation=designation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getName( ) {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public double getSalary() {
	return salary;
}
public void setSalary() {
	this.salary=salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation() {
	this.designation=designation;
	}
}
