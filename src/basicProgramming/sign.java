package basicProgramming;

import java.util.Scanner;

public class sign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double no = in.nextDouble();

        if (no == 0) {
            System.out.println("Number is zero: " + no);
        } else if (no < 0) {
            System.out.println("Number is negative: " + no);
        } else {
            System.out.println("Number is positive: " + no);
        }

        in.close();
    }
}
