import java.util.Scanner;
class Prims
{
    public static void main(String args[]){
        int a[][]=new int[10][10];
        int visited[]=new int[10];
        int min=Integer.MAX_VALUE,mincost=0,ne=1;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter no of vertices : ");
         int n=sc.nextInt();
         System.out.println("Enter cost matrix : ");
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 a[i][j]=sc.nextInt();
                 if(a[i][j]==0)
                 a[i][j]=Integer.MAX_VALUE;
             }
         }
    visited[0]=1;
    //while(ne<=n){
        for(int i=0;i<n;i++){
            int u=0,v=0;
            for(int j=0;j<n;j++){
                if(a[i][j]<min){
                    if(visited[i]!=0){
                        min=a[i][j];
                        u=i;v=j;
                    }}}
                if(visited[u]==0 || visited[v]==0){
                  System.out.println("Edge "+ne+" "+i+" -> "+j+" : cost : "+min);
                  ne++;
                  visited[j]=1;
                  mincost+=min;
                }
            a[u][v]=a[v][u]=Integer.MAX_VALUE;
            min=Integer.MAX_VALUE;
        }
        System.out.println(" Minimum Cost : "+mincost);
    }
    }