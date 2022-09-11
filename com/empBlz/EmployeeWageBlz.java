package com.empBlz;

import java.util.Random;

public class EmployeeWageBlz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Employee Wage");
		int WagePerHr = 20;
		int FullDayHr = 8;
		int PartTimeHr = 4;

		Random r = new Random();
		int emp = r.nextInt(2);
		int Salaryemp;
		if (emp == 0) {

			Salaryemp = FullDayHr * WagePerHr;

			System.err.println("Salary Of full Day Employee is:  " + Salaryemp);
		} else if (emp == 1) {
			Salaryemp = PartTimeHr * WagePerHr;

			System.err.println("Salary Of Half Day Employee is :" + Salaryemp);
		} else {
			System.err.println("Employee is not Prsent");
		}

	}

}
