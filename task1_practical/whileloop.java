package task1_practical;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // While loop to sum the digits
        while (number != 0) {
            int digit = number % 10;    // get last digit
            sum += digit;               // add digit to sum
            number /= 10;               // remove last digit
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();

	}

}
