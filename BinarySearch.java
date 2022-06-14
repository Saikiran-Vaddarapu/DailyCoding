/* Given such an array, find the index of the element in the array 
in faster than linear time. If the element doesn't exist in the array,  return null.
Assuming array to be ascending sorted  */

import java.util.Scanner;
public class BinarySearch {
    static int binarySearch(int[] ar,int n,int key)
    {
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(ar[mid] == key)
            return mid;
            else if(ar[mid] > key)
            high = mid - 1;
            else if(ar[mid] < key )
            low = mid + 1;
        }
        return -1;
    }
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[] ar = new int[n];
      for(int i=0;i<n;i++)
      ar[i] = s.nextInt();
      int key = s.nextInt();
      int result = binarySearch(ar,n,key);
      if(result != -1)
      System.out.println(key +" found at "+result+ " index");
      else
      System.out.println(key + " not found");
      s.close();
    }
}
