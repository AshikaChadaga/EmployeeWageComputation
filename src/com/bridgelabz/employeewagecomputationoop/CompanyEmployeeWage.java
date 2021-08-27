package com.bridgelabz.employeewagecomputationoop;

public class CompanyEmployeeWage {
	
	public final String company;
	public final int empRate;
	public final int numOfDays;
	public final int maxHours;
	public int empWagePerMonth;
	
	public CompanyEmployeeWage(String company, int empRate, int numOfDays, int maxHours) {
		this.company = company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
		this.maxHours = maxHours;
	}
	
	public void setEmpWagePerMonth(int totalEmpWage) {
		this.empWagePerMonth = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Emp Wage Per Month for Company " + company + " is : " + empWagePerMonth;
	}
}
