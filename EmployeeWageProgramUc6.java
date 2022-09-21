package com.employeeBlz;

import java.util.Random;

public class EmployeeWageProgramUc6 {

	public static void main(String[] args) {

		System.out.println("Welcome To Employee Wage Program");

		// Employee For Full Day Working
		int WagePerHr = 20;
		int FullDayHr = 8;

		// Employee For Part Time Working

		int PartTimeHr = 4;
		int Salaryemp = 0;

		// Employee Monthly Salary

		int Monthsalary = 0;
		int WorkingDayperMonth = 20;

		int WorkingPerHrMonth = 0;
		int day = 1;
		int count = 1;

		Random random = new Random();
		int rannum = random.nextInt(2);

		for (int i = 1; i <= WorkingDayperMonth; i++) {

			while (day != 20 && WorkingPerHrMonth != 100) {

				switch (rannum) {

				case 0:

					Salaryemp = FullDayHr * WagePerHr;
					WorkingPerHrMonth = WorkingPerHrMonth + FullDayHr;

					System.out.println("Emplyee is full Day");

					break;
				case 1:

					Salaryemp = PartTimeHr * WagePerHr;
					WorkingPerHrMonth = WorkingPerHrMonth + PartTimeHr;

					System.out.println("Emplyee is Part Time");

					break;
				default:

					System.out.println("Employee is Absent");

				}
				System.out.print("");

				System.err.println("Salary Of Employee is=" + Salaryemp);

				// Calculate Monthly Salary Of Employee

				Monthsalary = Monthsalary + Salaryemp;

				System.err.println("Monthly Salary Of Employeee=" + Monthsalary);

				System.out.println("Day Of Employee is " + day + " : " + Salaryemp);
				day++;
				count++;
				System.out.println("Total count=" + count);
			}
		}
	}

}
