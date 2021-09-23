/* Abhinav Mohan Bhatia B.tech CSE SE 2015044
   
   Question: Given an unsored array of integers, design an algorithm and implement it unsing a program to sort an array of elements by dividing the array into two subarrays and combining these subarraysaber sorting each one of them.
	Your program should also find number of comparisons and inversions during sorting the array.
		Input Format:
			The first line contains number of test cases, T.
			For each test case, there will be two input lines.
			Second line contains space-separated integers describing array
			First line contains n (the size of array)
		Output Format:	
			The output will have T number of lines
			For each test case T, there will be three output lines.
			First line will give the sorted array
			Second line will give total number of comparisons
			Third line will give total number of inversions required.
		Sample Input:
			1
			8
			23 65 21 76 46 89 45 32
		Sample Output:
			21 23 32 45 46 65 76 89
			comparisons = 16
			inversions =
   
 */

import java.util.Scanner;

public class mergesort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i=0 ; i < n ; i++)
		  {
			  arr[i] = sc.nextInt();
		  }
		  mergesort ob = new mergesort();
		  int b=ob.sort(arr , 0 , arr.length-1);
		  System.out.println("\nSorted array");
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
			System.out.println("Comparisons="+b);
		}
	        sc.close();
		

	}
	public static int merge(int arr[] , int l , int m , int r)
	{
		// Merges two sub-arrays of arr[].
	    // First sub-array is arr[l..m]
	    // Second sub-array is arr[m+1..r]
        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;
	  
	        /* Create temp arrays */
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	  
	        //Copy data to temp arrays
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	  
	        // Initial index of merged subarray array
	        int k = l;
		int count =0;
	        while (i < n1 && j < n2) 
	        {
	            if (L[i] <= R[j]) 
	            {
	                arr[k] = L[i];
	                i++;
			    count++;
	            }
	            else
	            {
	                arr[k] = R[j];
	                j++;
			    count++;
	            }
	            k++;
	        }
	  
	        //Copy remaining elements of L[] if any 
	        while (i < n1)
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	  
	        // Copy remaining elements of R[] if any 
	        while (j < n2)
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
		return count;
	    }
	  
	    // Main function that sorts arr[l..r] using merge()
	   int sort(int arr[], int l, int r)
	    {
	        int a=0;
		   if (l < r) 
	        {
	            // Find the middle point
	            int m =l+ (r-l)/2;
	  
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	  
	            // Merge the sorted halves
	            a= merge(arr, l, m, r);
	        }
		   return a;
	    }
}