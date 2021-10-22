package com.bridgelabz.employeewage;

public class EmpWageBuilder {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	//declaring instance variables
	private final String company;			
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWageBuilder(String company, int empWagePerhour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = empWagePerhour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void computeEmpWage() {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalEmpworkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth &&	 //checking till max hours or max day of given company is reached
				totalEmpworkingDays < numOfWorkingDays) {
			totalEmpworkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:						//random check for part time, full time, absent
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalEmpworkingDays +" Emp Hr: "+empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;  //calculating total employee wage
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company:" + company + "is: " + totalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageBuilder tata = new EmpWageBuilder("Tata", 45, 20, 100);			//creating object which stores total employee wage 
		EmpWageBuilder sinclair = new EmpWageBuilder("Sinclair", 40, 20, 90);
		tata.computeEmpWage();
		System.out.println(tata);
		sinclair.computeEmpWage();
		System.out.println(sinclair);
	}
}