// count of elements greater than its right subarray elements
import java.util.Scanner;
class LeaderCount{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(a[i]>a[j])
                continue;
                else
                break;
            }
            if(j==n)
            count++;
        }
        System.out.println(++count);
    }
}