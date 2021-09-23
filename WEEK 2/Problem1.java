/*Abhinav Mohan Bhatia B.Tech CSE Section SE 2015044
  Given a sorted array of positive integers containing few duplicate elements, design an algorithm
and implement it using a program to find whether the given key element is present in the array
or not. If present, then also find the number of copies of given key. (Time Complexity = O(log n))
We can perform a linear search on the array and count the number of occurrences of the given element. 
We can use binary search algorithm and find indices of first and last occurrences of the given number and return ONE more than the difference between the two indices.

*/

package prg;
import java.util.Scanner; 
class Problem1
{
    public static int binarySearch(int[] A, int x, boolean searchFirst)
    {
        int left = 0;
        int right = A.length - 1;
        int result = -1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (x == A[mid])
            {
                result = mid;
                if (searchFirst)
                {
                    right = mid - 1;
                }
                else 
                {
                    left = mid + 1;
                }
            }
            else if (x < A[mid]) 
            {
                right = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter number of test cases: ");
       	int t = sc.nextInt();
        while(t-- > 0)
	{
    		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		System.out.println("Enter element to search: ");
		int key = sc.nextInt();
        	int first = binarySearch(A, key, true);
        	int last = binarySearch(A, key, false);
        	int c = last - first + 1;
        	if (first != -1) 
        	{
            		System.out.println(key + " Present " + c + " times");
        	}
        	else 
        	{
            		System.out.println("Not Present");
        	}
	}
        sc.close();
    }
}
