package com.bridgelabz.employeewage;

public class EmployeeWage {


	public static void main(String[] args) {

		//Constants declared

		int Wage_Per_Day = 20;

		int Full_Day_Hr = 8;

		int Is_Part_Time = 2;

		int Is_Present = 1;

		int Part_Day_Hr = 4;

		int Monthly_Wage = 0;

		//check condition for 20 days and get monthly salary

		for(int i=1;i<=20;i++){

			double Emp_Check = Math.floor(Math.random() *10 )%3;

			//Switch Case Statement used

			switch((int) Emp_Check){

			case 1: {

				int Emp_Wage = Wage_Per_Day * Full_Day_Hr;

				Monthly_Wage+=Emp_Wage;

			}
			break;

			case 2: {

				int Emp_Wage = Wage_Per_Day * Part_Day_Hr;

				Monthly_Wage+=Emp_Wage;

			}
			break;

			default:

				break;


			}

		}

		System.out.println("Monthly Wage Of Employee Is " + Monthly_Wage);

	}
}