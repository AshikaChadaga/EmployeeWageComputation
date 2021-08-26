package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static final int EMP_WAGE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		
		int empHrs, empWage;
		int empType = (int)Math.floor(Math.random() * 10) % 3;
		System.out.println("----- Welcome to Employee Wage Computation! -----");
		
		switch(empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
		}
		
		empWage = empHrs * EMP_WAGE_PER_HOUR;
		System.out.println("Emp Hours : "+empHrs);
		System.out.println("Emp Wage : "+empWage);
	}

}
