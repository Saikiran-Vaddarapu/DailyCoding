import java.util.Scanner;
class Insertion{
    public static void InsertionSort(int[] a,int k,int n){
          for(int i=1;i<n;i++){
              int key=a[i];
              int j=i-1;                           
              while(j>=0 && key<a[j]){         
                  a[j+1]=a[j];                 
                  j--;
              }
              a[j+1]=key;
          }
        }
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Sc.nextInt();
        InsertionSort(a,0,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}