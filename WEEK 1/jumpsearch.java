/*Abhinav Mohan Bhatia B.Tech CSE Section SE 2015044
	Jump Search is a searching algorithm for sorted arrays. Here, we try to search fewer number of elements compared to linear search algorithm which can be done by skipping some fixed number of array elements or jumping ahead by fixed number of steps in every iteration.
	Approach: We find a block/jump size(m) and then start searching from index 0, then 'm', then '2m', and do on.
		  Optimal size of 'm' is 'n^(1/2)'.
		  We find a range where target can lie, and then perform linear search in that range.
	Complexity: O(n^(1/2))
*/
package prg;
import java.util.Scanner;
public class jumpSearch
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of test cases: ");
       		int t = sc.nextInt();
        	while(t-- > 0)
		{
			System.out.println("Enter array length:");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter array elements:");
			for(int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter element to search:");
			int key = sc.nextInt();
			int result = search(arr,key);
			System.out.println("Present: " + (result+1));
		}
		sc.close();
	}
	public static int search(int [] arr, int key)
	{
		int n = arr.length;
		int steps = (int)Math.floor(Math.sqrt(n));
		int prev = 0;
		while(arr[Math.min(steps, n)-1] < key)
		{
			prev = steps;
			steps += (int)Math.floor(Math.sqrt(n));
			if(prev >= n)
				return -1;
		}
		while(arr[prev] < key)
		{
			prev++;
			if(prev == Math.min(steps, n))
				return -1;
		}
		if(arr[prev] == key)
			return prev;
		return -1;
	}	
}
