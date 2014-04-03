package elementary_programming;

import java.util.Scanner;

public class loanamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("enter anual interest rate: ");
		double annualrate = input.nextDouble();
		
		double monthlyrate = annualrate / 1200;
		
		System.out.print("enter number of years as a integer: ");
		
		int numberOfYears = input.nextInt();
		
		double loanamount = input.nextDouble();
		
		double monthlypayment = loanamount * monthlyrate / (1 - 1 / Math.pow(1 + monthlyrate, numberOfYears * 12));
		
		double totalPayment = monthlypayment * numberOfYears * 12;
		
		System.out.println(" the monthly cost is $" + (int)(monthlypayment * 100) / 100.0);
		System.out.println("the total payment is: " + (int)(totalPayment * 100) / 100.0);
		
		
		
		
		}

}
