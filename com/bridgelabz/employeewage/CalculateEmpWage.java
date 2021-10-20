package com.bridgelabz.employeewage;

public class CalculateEmpWage {

	private static final int FULL_TIME = 1;
	private static final int PART_TIME = 2;
	private int Monthly_Emp_Wage;
	private String companyName;
	private int wagePerHr;
	private int maxWorkingHrs;
	private int maxWorkingDays;
	private int Emp_Hrs=0; 
	private int Total_Working_Days = 0; 
	private int Total_Working_Hrs = 0;

	public CalculateEmpWage(String companyName, int wagePerHr, int maxWorkingHrs, int maxWorkingDays) {
		super();
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.maxWorkingHrs = maxWorkingHrs;
		this.maxWorkingDays = maxWorkingDays;
		

		while ( Total_Working_Hrs !=  maxWorkingHrs &&					//checking condition till max working hrs or max days reached
				Total_Working_Days < maxWorkingDays ) {

			Total_Working_Days++;
			double Emp_Check = Math.floor(Math.random() *10 )%3;

			//Switch expression used to check employee presentee
			switch((int) Emp_Check){

			case FULL_TIME:
				Emp_Hrs=8;
				break;
				
			case PART_TIME:
				Emp_Hrs=4;
				break;

			//Default case statement
			default:
				Emp_Hrs=0;
				break;
			}
			Total_Working_Hrs += Emp_Hrs;
		}
		Monthly_Emp_Wage = Total_Working_Hrs * wagePerHr;		//calculating monthly salary
					
	}	

	@Override
	public String toString() {
		return "Calculated Wage [company=" + companyName + ", monthly_salary=" + Monthly_Emp_Wage + "]";
	}
}

