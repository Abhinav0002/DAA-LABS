/*Abhinav Mohan Bhatia B.Tech CSE SE 2015044

*/
import java.util.Scanner;
public class DuplicateElements 
{

	 public static void main(String[] args)
	 {
	     Scanner sc = new  Scanner(System.in);
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
	                Duplicate_elements(arr,n);
	     }
	     sc.close();
	  }

	public static void Duplicate_elements(int arr[],int n)
	 {
		 for(int i = 0; i < n; i++)
		 {  
	            for(int j = i + 1; j < n; j++) 
	            {  
	                if(arr[i] == arr[j])  
		            {
		            System.out.println("Yes");
		            return;
		            }
	                
		    }
		 
	  }
		 System.out.println("No");
   }
}
