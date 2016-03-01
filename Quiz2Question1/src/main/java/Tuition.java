//Christine Celona Quiz 2 Question 1

import java.util.Scanner;

public class Tuition {
	
	//int data field
	private int initialCost;
	private int year2Percentage;
	private int year3Percentage;
	private int year4Percentage;
	private int APR;
	private int APRrate;
	
	//Asking for inputs
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial tuition cost per semester: ");
		double initialCost = input.nextInt(); 
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter percentage increase for Year 2: ");
		double year2Percentage = input2.nextInt(); 

		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter percentage increase for Year 3: ");
		double year3Percentage = input3.nextInt(); 
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter percentage increase for Year 4: ");
		double year4Percentage = input4.nextInt(); 
		
		Scanner input5 = new Scanner(System.in);
		System.out.println("Enter the repayment APR (loan interest rate): ");
		double APR = input5.nextInt(); 
		
		Scanner input6 = new Scanner(System.in);
		System.out.println("Enter APR term in years: ");
		double APRterm = input6.nextInt(); 
	
		
	//Calculations
	
	double CostPerYear = initialCost*2;
	double APRrate = APR/100;
	double year2 = (CostPerYear*(year2Percentage/100))+CostPerYear;
	double year3 = (year2*(year3Percentage/100))+year2;
	double year4 = (year3*(year4Percentage/100))+year3;

	//P is the loan amount
	double P = CostPerYear + year2 + year3 + year4;

	//r is the interest rate/12
	double r = APRrate/12;

	//n is the period in months
	double n = APRterm*12;
	
	//EMI is the Equated Monthly Installment
	double exp = 1;
	for (double i=1; i <=n; i++)
	{
		exp = exp*(1+r);
	}

	double EMI = (P*r*exp)/(exp-1);
	
	//TotalCost is the total cost of tuition to complete college degree
	double TotalCost = EMI*n;

	System.out.printf("The Equated Monthly Installment is $%.2f.", EMI);
	System.out.printf("\n The total cost of tuition is $%.2f.", TotalCost);
	} 

}

