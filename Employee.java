package com.tns.inheritance;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		System.out.println("=======Enter the Employee details=======");
		Scanner sc = new Scanner(System.in);
		String ename, elocation;
		System.out.println("Enter the Employee Name");
		ename = sc.nextLine();
		System.out.println("Enter the Employee ID");
		int eid = sc.nextInt();
		System.out.println("Enter the Employee Location");		
		elocation = sc.next();
		System.out.println("Enter the Employee Salary");
		double esalary = sc.nextDouble();
		sc.close();
		System.out.println("=======Display of Employee details=======");
		System.out.println("Name:"+ename);
		System.out.println("Id:"+eid);
		System.out.println("Location:"+elocation);
		System.out.println("Salary:"+esalary);
	}

}
