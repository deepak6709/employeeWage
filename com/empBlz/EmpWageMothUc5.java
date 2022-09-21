package com.empBlz;

import java.util.Random;
import java.util.Scanner;

public class EmpWageMothUc5 {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Employee Wage Program");
		
		//Employee For Full Day Working
		int WagePerHr = 20;
		int FullDayHr = 8;
		
		//Employee For  Part Time Working
		
		int PartTimeHr = 4;
		int Salaryemp = 0;
		
		//Employee Monthly Salary
		
		int Monthsalary = 0;
		int WorkingDayperMonth = 20;

		Random r = new Random();
		int rannum = r.nextInt(2);
		
		int count=1;

		for (int i = 1; i <= WorkingDayperMonth; i++) {

			switch (rannum) {

			case 0:

				Salaryemp = FullDayHr * WagePerHr;
				System.out.println("Emplyee is full Day");

				break;
			case 1:

				Salaryemp = PartTimeHr * WagePerHr;
				System.out.println("Emplyee is Part Time");

				break;
			default:

				System.out.println("Employee is Absent");

			}
			System.out.print("");
			
			System.err.println("Salary Of Employee is="+Salaryemp);
			
			// Calculate Monthly Salary Of Employee
			
			Monthsalary = Monthsalary + Salaryemp;
			
			System.err.println("Monthly Salary Of Employeee="+Monthsalary);
			count++;
			System.out.println("Total Count="+count);

		}
	}
}
