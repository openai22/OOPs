package task1_practical;

public class Datatypes {

	public static void main(String[] args) {
		//Primitive Data Types 
		
		// Integer types
        byte byteVar = 100;           // 1 byte
        short shortVar = 10000;       // 2 bytes
        int intVar = 100000;          // 4 bytes
        long longVar = 10000000000L;  // 8 bytes (L at the end is important)

        // Floating point types
        float floatVar = 5.75f;       // 4 bytes (f at the end is important)
        double doubleVar = 19.99;     // 8 bytes

        // Character type
        char charVar = 'A';           // 2 bytes (stores a single character)

        // Boolean type
        boolean booleanVar = true;    // 1 bit (true or false)

        // Printing all values
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
        
        //Non primitive
        String s = "Messi";
        
        System.out.println(s);
	}

}
