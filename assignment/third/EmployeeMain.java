package com.capgemini.assignment.third;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] employees=new Employee[3];
		Employee e1=new Employee(101,"kavya",15000);
		Employee e2=new Employee(102,"keerthi",25000);
		Employee e3=new Employee(103,"moksha",90000);
		
		employees[0]=e1;
		employees[1]=e2;
		employees[2]=e3;
			printEmployeeDetails(employees);
	   Employee[] emp=getEmployees();
	   printEmployeeDetails(emp);
	}
	static void printEmployeeDetails(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			System.out.println("name - "+emp[i].name);
			System.out.println("id - "+emp[i].id);
			System.out.println("percentage - "+emp[i].salary);
		}
		}
	static Employee[] getEmployees() {
		Employee[] employees=new Employee[3];
		Employee e1=new Employee(101,"kavya",15000);
		Employee e2=new Employee(102,"keerthi",25000);
		Employee e3=new Employee(103,"moksha",90000);
		
		employees[0]=e1;
		employees[1]=e2;
		employees[2]=e3;
		
		return employees;

		
	}

}
