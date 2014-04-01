package elementary_programming;



import java.util.Scanner;

public class meters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.print("enter length in meters");
double meters = input.nextDouble();
		
double kilometers = meters / 1000;
System.out.println("your length in kilometers is " + kilometers);

	}

}
