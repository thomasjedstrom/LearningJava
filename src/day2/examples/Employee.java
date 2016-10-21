package day2.examples;

public class Employee {

	double salary;
	double bonus;
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total Pay = " + totalPay);
	}
	
}
