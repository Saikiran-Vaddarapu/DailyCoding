/* Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8] 

 */

import java.util.Scanner;
public class MaxInSubArrays {
    static void maxSubArray(int[] ar, int k,int n)
    {
       for(int i = 0; i< n-k+1; i++)
       {
           int max = Integer.MIN_VALUE;
           for(int j=i; j<i+k ;j++)
           {
               max = Math.max(max,ar[j]);
           }
           System.out.print(max + " ");
       }
       System.out.println();
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        ar[i] = Sc.nextInt();

        System.out.println("Enter k ");
        int k = Sc.nextInt();

        maxSubArray(ar,k,n);
        Sc.close();
    }
}
