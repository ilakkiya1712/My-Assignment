package week1.day2;

public class learnIfElse {
	public static void main(String[] args) {
		int mark=76;
		
		System.out.println(" ------Learning If else statement-----");
		
		if(mark<=35) {
			System.out.println("You are getting the mark is " + mark +"So Your Grade is  D");  
		}
		
		
		else if(mark<=50) {
			System.out.println("You are getting the mark is " + mark +"So Your Grade is  C");
		}
		
		else if(mark<=65) {
			System.out.println("You are getting the mark is " + mark +" "+ "So your Grade B");
		}
		
		else if(mark<=75) {
			System.out.println("Your grade is A");
		}
		
		else {
			System.out.println("Your getting the mark is " +mark+ " "+  "It is Outstanding");
		}
		
		
	}

}
