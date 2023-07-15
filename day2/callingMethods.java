package week1.day2;
  
import week1.day1.ArithmeticOperations;

public class callingMethods {
public static void main(String[] args) {
	
	//To use the public methods from the previous package to create the object and import the that package name in the current package
	
	ArithmeticOperations ao= new ArithmeticOperations();
	
	
	System.out.println("Adding two numbers:"+ ao.add(5, 10));
	System.out.println();
	System.out.println("Dividing Two Numbers:" +ao.divide(70.9f, 45.2f));
	 
	
}
}
