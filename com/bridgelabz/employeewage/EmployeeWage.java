package com.bridgelabz.employeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		//Constants

		int Is_Present = 1;

		//Computation

		double Emp_Check = Math.floor(Math.random() *10 )%2;

		if (Emp_Check == Is_Present )

			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}
}