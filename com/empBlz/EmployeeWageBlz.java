package com.empBlz;

import java.util.Random;

public class EmployeeWageBlz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Welcome To Employee Wage");
		Random r=new Random();
		int emp=r.nextInt(2);
		if(emp==1)
			System.out.println("Employee is Present");
		else if(emp==0)
			System.out.println("Employee is Absent");
		else
			System.out.println("Employee is not Working in company");

	}

}
