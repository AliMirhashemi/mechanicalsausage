package elementary_programming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//ask user for their weight in kilograms.
		System.out.print("enter your weight in kilograms");
		
		double weight = input.nextDouble();
		
		double kilograms = weight / 0.454;
		
		System.out.println("your weight in pounds is " + format(kilograms));
	}
	
	public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance(); // Get the instance of the number
        format.setRoundingMode(RoundingMode.FLOOR); // Round the number
        format.setMinimumFractionDigits(0); // Set the minimum fraction digits to 0
        format.setMaximumFractionDigits(2); // Set the maximum fraction digits to 2
        return format.format(n); // Return the formatted number
    }

}
