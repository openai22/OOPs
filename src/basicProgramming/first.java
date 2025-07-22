package basicProgramming;

import java.util.Scanner; 

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		
		int no = in.nextInt();
		
		if (no % 2 == 0) 
		{
			  System.out.println("Even No");
		}
		else
		{
			System.out.println("Odd No");
		}
		
	}

}
