/*Abhinav Mohan Bhatia B.Tech CSE Section SE 2015044
  Given an array of sorted integers, design a linear algorithm and implement it using a program to find whether given key element is present in the array or not.
  Also, find total number of comparisons for each input case.
  (Time Complexity = O(n), where n is the size of input) 
  */
  package prg;
  import java.util.Scanner;
  class sortedsearch
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
          System.out.println("Enter elements of array: ");
          for(int i = 0; i < n; i++)
          {
              arr[i] = sc.nextInt();
          }
          System.out.println("Enter element to search: ");
          int x = sc.nextInt();
          int res = binarySearch(arr,x);
          if(res == -1)
              System.out.print("Element is not present in array");
          else
              System.out.print("Present " + (res+1));
      }
      sc.close();
     }
   private static int binarySearch(int arr[], int x)
      {
          int i;
          if(arr == null || arr.length < 0)
          {
              System.out.print("Not Present ");
          }
          int end = arr.length-1;
          for( i = 0; i <=end;)
          {
              int mid = i + (end-i)/2;
              if(x == arr[mid])
              { 
                  return mid;
              }
              else if(x>arr[mid])
              {
                  i++;
              }
              else if(x<arr[mid])
              {
                  end--;
              }
          }
          return -1;
      }
  }
  