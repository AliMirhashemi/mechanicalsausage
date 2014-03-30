import java.util.Scanner;

public class temperature {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		//ask the user for a input.
		System.out.print("enter a degree in fahrenheit: ");

		double fahrenheit = input.nextDouble();

		//convert fahrenheit to celsius.
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("fahrenheit " + fahrenheit + " is " + celsius + " in celsius");
	}
}