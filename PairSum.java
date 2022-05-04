/*
 1. Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/
import java.util.*;
class PairSum
{
    static boolean isthereAPair(int[] ar,int k){
        Arrays.sort(ar);
        int low = 0,high = 4;
        while(low <= high ){
            if(ar[low] + ar[high] == k){
            System.out.println("Pairs : "+ar[low]+" "+ar[high]);
            return true;
            }
            else if(ar[low] + ar[high] < k)
            low++;
            else if(ar[low] + ar[high] > k)
            high--;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int[] ar = new int[5];
        for(int i = 0;i< 5;i++)
        ar[i] = Sc.nextInt();
        System.out.println("Enter the value : ");
        int k = Sc.nextInt();
        boolean ans = isthereAPair(ar,k);
        System.out.println("Is there A Pair "+ans);
        Sc.close();
    }
}