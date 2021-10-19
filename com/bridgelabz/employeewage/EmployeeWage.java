package com.bridgelabz.employeewage;
package com.bridgelabz.employeewage;

public class EmployeeWage {

	//Constant variables

	public static final int Is_Full_Time = 1;

	public static final int Is_Part_Time = 2;

	public static final int Wage_Per_Hr = 20;

	public static final int Max_Working_Days = 20;

	public static final int Max_Monthly_Hrs = 100;


	public static void main(String[] args) {

		int Emp_Hrs=0;


		int Total_Working_Days = 0;

		int Total_Working_Hrs = 0;


		System.out.println("Day wise working hours");


		//Loop used to check till 100 hours or 20 days


		while ( Total_Working_Hrs <= Max_Monthly_Hrs &&

				Total_Working_Days < Max_Working_Days ) {

			Total_Working_Days++;

			double Emp_Check = Math.floor(Math.random() *10 )%3;

			//Switch Case Used

			switch((int) Emp_Check){

			case Is_Full_Time:
				Emp_Hrs=8;

				break;

			case Is_Part_Time:
				Emp_Hrs=4;

				break;

			default:
				Emp_Hrs=0;

				break;

			}

			//Stores total working hours

			Total_Working_Hrs+=Emp_Hrs;

			System.out.println("Day:" + Total_Working_Days + " = " + Emp_Hrs);

		}
		//Get monthly employee wage

		int Monthly_Emp_Wage =Total_Working_Hrs*Wage_Per_Hr;

		System.out.println("Total Employee Wage is : " + Monthly_Emp_Wage);

	}

}