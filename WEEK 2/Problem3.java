/* Abhinav Mohan Bhatia B. Tech CSE Section SE 2015044
 Given an array of nonnegative integers, design an algorithm and a program to count the number
of pairs of integers such that their difference is equal to a given key, K. */

package prg;
import java.util.Scanner;
public class Problem3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of test cases: ");
	    int t = sc.nextInt();
	    while(t-- > 0)
		{
	    	System.out.println("Enter array length: ");
	    	int n = sc.nextInt();
	    	int arr[] = new int[n];
	    	System.out.println("Enter array elements: ");
	    	for(int i = 0; i < n; i++)
	    	{
	    		arr[i] = sc.nextInt();
	    	}
	    	System.out.println("Enter key: ");
	    	int key = sc.nextInt();
	    	System.out.println("Number of pairs with difference " + key + "are: " + count(arr,n,key));
	    }
	    sc.close();
	}
	static int count(int arr[], int n, int key)
	{
		int c = 0;
		for(int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
                if (arr[i] - arr[j] == key || arr[j] - arr[i] == key)
                    c++;
        }
        return c;
	}
}


