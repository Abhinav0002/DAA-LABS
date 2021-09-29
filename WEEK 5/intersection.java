import java.util.*;
import java.io.*;
public class intersection {
    static void printUnion(int[] a, int n,
                       int[] b, int m)
{
    Map<Integer,
        Integer> mp = new HashMap<Integer,
                                  Integer>();
     
    // Inserting array elements in mp
    for(int i = 0; i < n; i++)
    {
        mp.put(a[i], i);
    }
    for(int i = 0; i < m; i++)
    {
        mp.put(b[i], i);
    }
     
    for(Map.Entry mapElement : mp.entrySet())
    {
        System.out.print(mapElement.getKey() + " ");
         
        // mp will contain only distinct
        // elements from array a and b
    }
}
 
// Driver Code
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
    int m,n;
    m=sc.nextInt();
    int a[] = new int[m];
    for(int i=0;i<m;i++)
    {
        a[i]=sc.nextInt();
    }
    n=sc.nextInt();

    int b[] = new int[n];
    for(int j=0;j<n;j++)
    {
        b[j]=sc.nextInt();
    }
     
    printUnion(a, m, b, n);
}  
}
