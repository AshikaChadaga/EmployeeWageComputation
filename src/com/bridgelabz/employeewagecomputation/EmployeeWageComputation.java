package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static final int EMP_WAGE_PER_HOUR = 20;
	private static final int WORKING_DAYS_PER_MONTH = 20;
	private static final int TOTAL_WORKING_HOURS = 100;
	
	
	public static void main(String[] args) {
		
		
		int empHrs=0, empWagePerMonth = 0, totalWorkingdays=0, totalEmpHours = 0;
		System.out.println("----- Welcome to Employee Wage Computation! -----");
		
		while(totalEmpHours <= TOTAL_WORKING_HOURS && totalWorkingdays < WORKING_DAYS_PER_MONTH) {
			
			totalWorkingdays ++;
			int empType = (int)Math.floor(Math.random() * 10) % 3;
			
			switch(empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			
			totalEmpHours += empHrs;
			int empWagePerDay = empHrs * EMP_WAGE_PER_HOUR;
			empWagePerMonth += empWagePerDay;
			
			System.out.println("Emp Wage Per Day : "+empWagePerDay);
		}
		
		System.out.println("Emp Wage Per Month : "+empWagePerMonth);
	}

}
