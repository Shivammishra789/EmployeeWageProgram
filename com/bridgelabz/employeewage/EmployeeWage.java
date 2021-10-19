package com.bridgelabz.employeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		int Wage_Per_Day = 20;
		int Full_Day_Hr = 8;
		int Is_Present = 1;

		double Emp_Check = Math.floor(Math.random() *10 )%2;

		if (Emp_Check == Is_Present ) {


			int Emp_Wage = Wage_Per_Day * Full_Day_Hr;

			System.out.println("Employee daily wage is " + Emp_Wage);

		}

		else {

			System.out.println("Employee daily wage is 0 " );


		}
	}
}