package week1.day2;

public class Fibbonacci {

	public static void main(String[] args) {
		
		
		//int i=34343;
		int n1=0;
		int n2=1;
		
		
		System.out.println(n1); // Printing the value o and 1
		System.out.println(n2);
		
	/*for(int i = 0;i <=10; i++) {
		
		j+=i;
		System.out.println(j);
		
	}*/
		
		for(int n3=2; n3<=100; n3++) { 
			
			n3=n1+n2;
			
					
			System.out.println(n3);	
			
			
			n1=n2;
			n2=n3;
			
			
			
			}

	}

}
