
//import utility scanner
import java.util.Scanner;

public class price {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("enter the sale percentage");

double salePercentage = input.nextDouble();

        Scanner input = new Scanner(System.in);
        
        System.out.print("enter your price");

double price = input.nextDouble();

double total = price / salePercentage;

System.out.println("your final price will be " + total);

}

    }


