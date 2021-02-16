package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	String[] feesh = {"pollo","sandwich","clam","potato","rabbit"};	
		//2. print the third element in the array
	System.out.println(feesh[2]);	
		//3. set the third element to a different value
	feesh[2] = "burger";
		//4. print the third element again
	System.out.println(feesh[2]);	
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	for(int i = 0; i<feesh.length; i++){
		System.out.println(feesh[i]);
	}	
		
		//6. make an array of 50 integers
	int nums [] = new int[50];	
	int smallestNum = nums[0];
	int largestNum = nums[0];
	Random random = new Random();
		//7. use a for loop to make every value of the integer array a random number
	for(int i=0; i<nums.length; i++) {
		nums[i]= random.nextInt(1000)-499;	
	}	
	
		//8. without printing the entire array, print only the smallest number in the array
	for(int i = 0; i<=nums.length; i++) {
		if(nums[i]<smallestNum) {
			smallestNum=nums[i];
		}
	}
	System.out.println("The smallest number is " + smallestNum + ".");
	
		//9 print the entire array to see if step 8 was correct
	for(int x = 0; x<nums.length;x++) {
		System.out.println(nums[x]);
	}
	
		//10. print the largest number in the array.
	for(int i = 0; i<nums.length; i++) {
		if(nums[i]>largestNum) {
			largestNum=nums[i];
		}
	}
	System.out.println("The largest number is " + largestNum + ".");
	}
}
