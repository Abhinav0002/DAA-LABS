/*Abhinav Mohan Bhatia B.Tech CSE SE 2015044

*/
import java.util.Scanner;
public class SelectionSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of test cases: ");
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
		  Selectionsort(arr,n);
		}
		sc.close();
	}
	public static void Selectionsort(int arr[] , int n)
	{
		int min,t,c=0,s=0;
	    for(int i=0;i<n-1;i++){
	        min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[min])
	                min=j;
	            c++;
	        }
	        t=arr[min];
	        arr[min]=arr[i];
	        arr[i]=t;
	        s++;
	    }
	    for(int i = 0; i<n; i++)
	    {
	    	System.out.println(arr[i] + " ");
	    }
	    System.out.println("\ncomparisons " +c);
	    System.out.println("\nSwaps " +s);
	    System.out.println();
	}

}