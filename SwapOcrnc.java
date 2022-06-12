import java.util.Scanner;
class SwapOcrnc{  //swap first,last chars of each word
    public static void main(String args[]){
          Scanner d=new Scanner(System.in);
          String sh=d.nextLine();
          String[] res=sh.split(" ");
          String ds="";
          for(int i=0;i<res.length;i++){
              char[] ch=res[i].toCharArray(); //converting to char array
              // swap 0 and last
              char on=ch[0];
              ch[0]=ch[ch.length-1];
              ch[ch.length-1]=on;
              //
              ds+= new String(ch)+" ";
          }
          System.out.println(ds);
    }
}