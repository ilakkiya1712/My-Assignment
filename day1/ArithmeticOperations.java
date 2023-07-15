package week1.day1;

public class ArithmeticOperations {

	// Pseudo code for add
	// begin
	// get two inputs from the user (should be rational values).
	// use add operator to add the both valid values.
	// return the value
	// end 
	public int add(int a, int b) {
	return(a+b);
	}
	
	private int mul(int a, int b) {
		return(a*b);
	}
	
	public float divide(float a, float b) {
		return(a/b);
		
	}
	public static void main(String[] args) {
		
		// get the result by calling class using the objects in the main class.
	        //Syntax for object creation	
            //className obj=new classname();
		ArithmeticOperations ao= new ArithmeticOperations();
		System.out.println("Addition of two numbers");
		System.out.println("The result is:"+""+ ao.add(10, 12) );
		// To segregate the next operation by using line space
		System.out.println();
		System.out.println("Multiplying of two numbers");
		System.out.println("The result is"+" "+ ao.mul(16, 12));
		System.out.println();
		System.out.println("Dividing of decimal numbers");
		System.out.println("The result is:"+" "+ ao.divide(16.3f, 12.6f));
	}

}
