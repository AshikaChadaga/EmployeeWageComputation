package com.bridgelabz.employeewagecomputationoop;

public class EmployeeWageComputationMain {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	
	private int numberOfCompany = 0;
	private CompanyEmployeeWage[] companyEmployeeWageArray;
	
	public EmployeeWageComputationMain() {
		companyEmployeeWageArray = new CompanyEmployeeWage[5];
	}
	
	private void addCompanyEmployeeWage(String company, int empRate, int numberOfDays, int maxHours) {
		companyEmployeeWageArray[numberOfCompany] = new CompanyEmployeeWage(company, empRate, numberOfDays, maxHours);
		numberOfCompany++;
	}
	
	private void computeEmployeeWage() {
		for(int index = 0; index < numberOfCompany ; index++) {
			System.out.println();
			System.out.println("Employee in company : "+ (index+1));
			
			companyEmployeeWageArray[index].setEmpWagePerMonth(this.computeEmployeeWage(companyEmployeeWageArray[index]));
			System.out.println(companyEmployeeWageArray[index]);
		}
	}
	
	private int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {
		
		int empHrs = 0, totalWorkingdays = 0, totalEmpHours = 0;

		while (totalEmpHours <= companyEmployeeWage.maxHours && totalWorkingdays < companyEmployeeWage.numOfDays) {

			totalWorkingdays++;
			int empType = (int) Math.floor(Math.random() * 10) % 3;

			switch (empType) {
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
			int empWagePerDay = empHrs * companyEmployeeWage.empRate;
			companyEmployeeWage.empWagePerMonth += empWagePerDay;
			System.out.println("Emp Wage Per Day : " + empWagePerDay);
		}
		return totalEmpHours *companyEmployeeWage.empRate;
	}
	public static void main(String[] args) {
		
		System.out.println("----- Welcome to Employee Wage Computation Program! -----");
		EmployeeWageComputationMain employeeWageCmputation = new EmployeeWageComputationMain();
		employeeWageCmputation.addCompanyEmployeeWage("BridgeLabz", 20, 2, 10);
		
		employeeWageCmputation.addCompanyEmployeeWage("Perfios", 20, 2, 10);
		employeeWageCmputation.computeEmployeeWage();
	}

}
