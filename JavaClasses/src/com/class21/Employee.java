package com.class21;

public class Employee {
	int eID;
	int salary;
	static String CEO;

	void printInfo() {
		System.out.println("Employee Id: " + eID + ", salary is: " +salary + " CEO is: " + CEO);
	}
	
	void method () {
		printInfo();
	}

	public static void main(String[] args) {
		Employee.CEO = "Sumair";
//		Employee.salary = 300;
		
		Employee emp1 = new Employee();
		
		emp1.printInfo();
		
		emp1.eID = 5;
		emp1.salary = 80000;
//		emp1.CEO = "Sumair";
//		Employee.CEO = "Sumair";

		emp1.printInfo();
		
		Employee emp2 = new Employee();
		emp2.eID = 8;
		emp2.salary = 85000;
//		emp2.CEO = "Sumair";
		
		emp2.printInfo();
		
		//with default values
//		Employee emp1 = new Employee();
//		emp1.printInfo();
//		
//		Employee emp2 = new Employee();
//		emp2.printInfo();
//		
//		System.out.println("Let's change emp2");
//		
//		emp2.eID = 3;
//		emp2.salary = 300;
//		emp2.CEO = "Asel";
//		emp2.printInfo();
//		emp1.printInfo();

	}

}
