package week1.day2;

//to use array value import the array

import java.util.Arrays;

public class HomeworkDuplicate {

	
	public static void main(String[] args) {

        //Type 1 array syntax: datatype[] arrayname=range;
		
		System.out.println("----Finding the duplicate values using Array concept----");
		
		int[] nums= {2,5,7,7,5,9,2,3};
 
         Arrays.sort(nums); // To sort the values using function first sort the values
         
         //for(initialize, condiition, increment)
         
         for(int i=0; i < nums.length-1; i++) {
        	 
        	
        		 if(nums[i]==nums[i+1]) { 
        			 
        			 System.out.println(nums[i]);
        		 }
        		 
        		 
        	 
         }
         System.out.println("----End----");      
	}

}
