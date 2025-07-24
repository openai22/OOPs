package task1_skill;

public class Unboxing {

	public static void main(String[] args) {
	    
	    Double number = new Double(169.2);
	    
	    double wrapped_number = number.intValue(); //converting explicitly
	    double converted_number = number; //converting using unboxing
	    
	    System.out.println("Double number : "+number);
	    System.out.println("Explicit Conversion to Integer : "+wrapped_number);
	    System.out.println("Unboxing Conversion: "+converted_number);
	    
	  }
	
}
