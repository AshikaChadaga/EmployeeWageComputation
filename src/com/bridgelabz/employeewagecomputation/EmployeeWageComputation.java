package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("----- Welcome to Employee Wage Computation! -----");
		
		int IS_PRESENT = 1;
		int EMP_WAGE_PER_HOUR = 20;
		
		int empHrs, empWage;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_PRESENT){
			empHrs = 8;
		}
		else
			empHrs = 0;
		
		empWage = empHrs * EMP_WAGE_PER_HOUR;
		System.out.println("Emp Hours : "+empHrs);
		System.out.println("Emp Wage : "+empWage);
	}

}
