package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	
	private final String company;
	private final int empRate;
	private final int numOFDays;
	private final int maxHours;
	
	public EmployeeWageComputation(String company, int empRate, int numOFDays, int maxHours) {
		this.company = company;
		this.empRate = empRate;
		this.numOFDays = numOFDays;
		this.maxHours = maxHours;
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation bridgelabz = new EmployeeWageComputation("BridgeLabz", 20, 2, 10);
		
		System.out.println("----- Welcome to Employee Wage Computation! -----");
		int empHrs=0, empWagePerMonth = 0, totalWorkingdays=0, totalEmpHours = 0;
				
		while(totalEmpHours <= bridgelabz.maxHours && totalWorkingdays < bridgelabz.numOFDays) {
			
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
			int empWagePerDay = empHrs * bridgelabz.empRate;
			empWagePerMonth += empWagePerDay;
			System.out.println("Emp Wage Per Day : "+empWagePerDay);
		}
		
		System.out.println("Emp Wage Per Month for Company: "+bridgelabz.company+" is : "+empWagePerMonth);
				
	
	}

}
