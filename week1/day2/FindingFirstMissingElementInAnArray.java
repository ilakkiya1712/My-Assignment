package week1.day2;

import java.util.Arrays;

public class FindingFirstMissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.println("The index of :"+i+" is "+arr[i]);
		}
		
	

	}

}
