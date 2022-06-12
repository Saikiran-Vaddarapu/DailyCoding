import java.util.Scanner;
class BST
{   
    int data;
    BST left;
    BST right;
    BST(int m){
        data=m;
        left=null;
        right=null;
    }
    public static BST insert(BST root,int d){
          if(root==null)
             return new BST(d);
          if(d<root.data){
              root.left=insert(root.left,d);
          }
          else{
              root.right=insert(root.right,d);
          }
          return root;   
    }
    public static void view(BST root){
        if(root==null) return;
        System.out.println("root "+root.data+" ");
        view(root.left);
        view(root.right);
    }
    public static void preOrder(BST root){
       /* if(root==null) return;
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right); */
    }
    public static void main(String args[]){
       /*BST tr=new BST(10);
       tr.left=new BST(5);
       tr.right=new BST(15); */
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       BST root=null;
       while(x--!=0){
               int n=s.nextInt();
               root=insert(root,n);
       }
       view(root);
    }
}