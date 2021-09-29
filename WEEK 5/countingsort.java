import java.util.*;
public class countingsort 
{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n,i,t;
        t=sc.nextInt(); //Total number of test cases
        while(t!=0){
            n=sc.nextInt();//Size of array
            char arr[]=new char[n];
            //Elements of array
            for(i=0;i<n;i++)
            {
                arr[i]=sc.next().charAt(0);
            }
            int freq[]=new int[26];
            for(i=0;i<n;i++)
            {
                freq[arr[i]-'a']++;
            }
            int max=0,in=0;
            for(i=0;i<26;i++)
            {
                if(freq[i]>max)
                {
                    max=freq[i];
                    in=i;
                }
            }
            if(max>1)
            System.out.println((char)('a'+in)+" : "+max);
            else
            System.out.println("No Duplicates Present");
            t=t-1;
    }
}
            
}
