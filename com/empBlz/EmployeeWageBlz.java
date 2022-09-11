package com.empBlz;

import java.util.Random;

public class EmployeeWageBlz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int WagePerHr = 20;
		int FullDayHr = 8;
		System.err.println("Welcome To Employee Wage");
		Random r = new Random();
		int emp = r.nextInt(1);
		int Salaryemp;
		if (emp == 0) {

			Salaryemp = FullDayHr * WagePerHr;

			System.err.println("Salary Of full Day Employee is:  " + Salaryemp);
		} else if(emp==1) {

			System.err.println("Employee is half day");
		}
		else {
			System.out.println("Employee is not Prsent");
		}

	}

}
