package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int no =34343;
		
		int temp;
		temp=no;
		
		int r,i;
		
		System.out.println("The original no  is:" +no);
		
		
		
       for( i =0; no!=0; no/=10) {
	
		    
		   	r=no%10;
			//temp=r;
			
	        // no=sum;  
			i=i*10+r;
			
	         
			//System.out.print(i);
			
			
		}
		
	if(temp==i) {
		System.out.println("It's palindrome");
	}
		else {
			System.out.println("It's not a palindrome");
	}
	}
	
}
