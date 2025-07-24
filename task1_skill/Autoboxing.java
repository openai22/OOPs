package task1_skill;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 27;
	    
	    Integer wrapped_num = Integer.valueOf(number); //converting explicitly 
	    Integer converted_num = number; //converting using autoboxing
	    
	    System.out.println("Interger : "+ number);
	    System.out.println("Explicit Conversion :" + wrapped_num);
	    System.out.println("Autoboxing to integer : "+ converted_num);
	}

}
 