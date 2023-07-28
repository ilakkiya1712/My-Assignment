package week1.day2;

public class ActivityForLoop {
	
	public void findOdd() {
              for(int i=0; i<20; i++) {
			
			     if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("-----Printing ODD numbers from 1 to 20----");
		ActivityForLoop fo=new ActivityForLoop();
		fo.findOdd();
		
		
		
	}

}
