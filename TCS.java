
// TCS Digital Question ~  07-05-2022

import java.util.*;
class TCS
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int[] ar = new int[n];
        int result = 0;
        for(int i=0;i<n;i++)
        {
            ar[i] = s.nextInt();
        }
        Arrays.sort(ar);
        for(int i=0;i<n;i++)
        {
            if(r == ar[i]){
                result = i;
                break;
            }
            if(i!= n-1 && ar[i] < r && ar[i+1] > r){
                result = i+1;
                break;
            }
        }
        System.out.println(result);
        s.close();
    }}