/* Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.*/


import java.util.Scanner;
import java.util.Arrays;
public class MissingPositive {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        ar[i] = Sc.nextInt();
        Arrays.sort(ar);
        int c = 1;
        for(int i=0;i<n;i++){
            if(ar[i]<=0)
            continue;
            if(i!= n-1 && ar[i]==c && ar[i+1] !=c)
            c++;
            else
            break;
        }
        System.out.println(c);
        Sc.close();
    }
}
