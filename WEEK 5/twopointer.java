
import java.util.Arrays;
import java.util.Scanner;
public class twopointer {
    static String hasArrayTwoCandidates(
        int A[],
        int arr_size, int sum)
    {
        int l, r;
        String pair="";
 
        /* Sort the elements */
        Arrays.sort(A);
 
        /* Now look for the two candidates
        in the sorted array*/
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
            {
                pair=pair+A[l]+","+A[r];
                pair=pair+" ";
            }
            else if (A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
        return pair;
    }
 
    // Driver code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x;
        n=sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        x=sc.nextInt();
        int arr_size = A.length;

        String res=hasArrayTwoCandidates(A, arr_size,x);

        // Function calling
        if (res.length()!=0)
            System.out.println(res);
        else
            System.out.println("Array doesn't have "
                               + "two elements with given sum");
        sc.close();
    }
    
}
