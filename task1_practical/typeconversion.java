package task1_practical;

public class typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int intVal = 100;
	        double doubleVal = intVal; // int to double automatically

	        System.out.println("Implicit Conversion:");
	        System.out.println("int value: " + intVal);
	        System.out.println("Converted to double: " + doubleVal);

	        // Explicit type conversion (Narrowing) - larger to smaller
	        double originalDouble = 9.78;
	        int convertedInt = (int) originalDouble; // double to int manually

	        System.out.println("\nExplicit Conversion:");
	        System.out.println("double value: " + originalDouble);
	        System.out.println("Converted to int: " + convertedInt);

	}

}
