//2. Find the Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the missing number
import java.util.*;
public class DistinctNumber 
{
	    public static void main(String args[]) 
	    {
	        
	        int[] a = {0, 1, 3, 4};

	        // Calculate n (the length of the array)
	        int n = a.length;

	        // Calculate the total sum of numbers from 0 to n
	        int totalSum = n * (n + 1) / 2;

	        // Calculate the sum of the given array
	        int arrSum = 0;
	        for (int num : a) {
	            arrSum += num;
	        }

	        // The missing number is the difference between the total sum and the array sum
	        int missingNumber = totalSum - arrSum;

	        // Print the result
	        System.out.println("The missing number is: " + missingNumber);
	    }
	}