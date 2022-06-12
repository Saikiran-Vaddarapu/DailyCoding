import java.util.Scanner;
class Diagonal{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println(a[0][0]+" ");
        for(int k=1;k<=2*c;k++){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i+j==k)
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
        }
    }
}