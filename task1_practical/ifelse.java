package task1_practical;
import java.util.Scanner;

public class ifelse {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for input
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Check leap year condition
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scanner.close();

	}

}
