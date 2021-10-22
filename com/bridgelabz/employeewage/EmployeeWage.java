package com.bridgelabz.employeewage;

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static void computeEmpWage(String company, int empRatePerHour,
									  int numOfWorkingDays, int maxHoursPerMonth) {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalworkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth &&					//checking till max condition
				totalworkingDays < numOfWorkingDays) {
			totalworkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {									   //random check for part time, full time, absent
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalworkingDays +" Emp Hr: "+empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;			//calculating total employee wage
		System.out.println("Total Emp Wage for Company "+company+" is: " + totalEmpWage);
	}
	public static void main(String[] args) {
		computeEmpWage("Tata Motors", 45, 20, 100);        //calling method with parameter
		computeEmpWage("Sinclair", 40, 20, 90);	
	}
}