package week1.day2;

public class ConverPositiveNegative {

	public static void main(String[] args) {
		
		System.out.println("-----Convert the number neither positive nor negative---"+ "\n");

		int i=56;
		int j;
		if (i<0) {
		    j=i*-1;
			System.out.println("The given number is:" +i + " Changed as:"+j);
		}
		else if(i>0) {
			
		    j=i*-1;
			System.out.println("The given number is:" +i + " Changed as:"+j);
		}
		else
			System.out.println("It's a neutral");
	}

}
