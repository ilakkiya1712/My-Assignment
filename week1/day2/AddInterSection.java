package week1.day2;

public class AddInterSection {

	public static void main(String[] args) {
		
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		for(int i=0; i<array1.length; i++) {
		//	System.out.println("The index of :"+ i +" is "+array1[i]);
			for(int j=0; j<array2.length; j++) {
				if(array1[j]==array2[i]) {
					System.out.println(array1[i]);
				}
			}
			
		}
		

	}

}
