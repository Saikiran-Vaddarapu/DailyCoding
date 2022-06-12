import java.util.Scanner;
class Bubble{
    public static void BubbleSort(int[] a,int k,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Sc.nextInt();
        BubbleSort(a,0,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}