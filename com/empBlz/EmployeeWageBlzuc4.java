package com.empBlz;

import java.util.*;

public class EmployeeWageBlzuc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Employee Wage");
		int WagePerHr = 20;
		int FullDayHr = 8;
		int PartTimeHr = 4;
		int Salaryemp;
		int Monthsal=0;
		int Monthday=20;

		Scanner s = new Scanner(System.in);
		System.err.println("Enter ur choice");
		int ch = s.nextInt();
		
		

		switch (ch) {

		case 1:

			Salaryemp = FullDayHr * WagePerHr;

			System.out.println("Salary Of full Day Employee is:  " + Salaryemp);
			break;
		case 2:

			Salaryemp = PartTimeHr * WagePerHr;

			System.out.println("Salary Of Half Day Employee is :" + Salaryemp);
			break;
		default:

			System.out.println("Employee is not Prsent");
		}

	}
}
