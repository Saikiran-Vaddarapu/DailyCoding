import java.util.Scanner;
class Selection{
    public static void SelectionSort(int[] a,int k,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            int j;
            for(j=i+1;j<n;j++){
                if(a[j]<a[min])
                min=j;
               }
           if(min!=i){
              int t=a[min];
              a[min]=a[i];
              a[i]=t;      
            }
            }
        }
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Sc.nextInt();
        SelectionSort(a,0,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}