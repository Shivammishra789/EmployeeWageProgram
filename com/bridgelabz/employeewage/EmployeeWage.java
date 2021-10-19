package com.bridgelabz.employeewage;

public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_MONTHLY_HRS = 100;
	
	public static void ComputeEmployeeWage() {
		//Variables
		int Emp_Hrs=0; 
		int Total_Working_Days = 0; 
		int Total_Working_Hrs = 0;

		while ( Total_Working_Hrs != MAX_MONTHLY_HRS &&
				Total_Working_Days < MAX_WORKING_DAYS ) {

			Total_Working_Days++;
			double Emp_Check = Math.floor(Math.random() *10 )%3;

			//Switch expression
			switch((int) Emp_Check){

			//Case statements
			case IS_FULL_TIME:
				Emp_Hrs=8;
				break;
				
			case IS_PART_TIME:
				Emp_Hrs=4;
				break;

				//Default case statement
			default:
				Emp_Hrs=0;
				break;
			}

			Total_Working_Hrs += Emp_Hrs;
			System.out.println("Day:" + Total_Working_Days + " Emp Hr: " + Emp_Hrs);
		}

		int Monthly_Emp_Wage = Total_Working_Hrs * WAGE_PER_HR;
		System.out.println("Total Employee Wage is : " + Monthly_Emp_Wage);
		System.out.println("Total Employee Hours is : " + Total_Working_Hrs);
		System.out.println("Total Employee Days worked : " +Total_Working_Days );
	}
	public static void main(String[] arg){

		ComputeEmployeeWage();			//calling method in main class

	}

}