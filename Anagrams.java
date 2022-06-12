import java.util.*;
class Anagrams
{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter Two Equal sized Strings ");
        String s1=Sc.nextLine();
        String s2=Sc.nextLine();
        char s[]=s1.toCharArray();
        char t[]=s2.toCharArray();
        //char s[]={'h','e','l','l','o'};
        //char t[]={'e','l','o','l','h'};
        //char t[]={'e','l','h','h','o'};
        //System.out.println(s);
        for(int i=0;i<s.length;i++){
            for(int j=0;j<t.length;j++){
                if(s[i]==t[j]){
                    t[j]=0;
                    break;
                }
            }
        }
        for(int j=0;j<t.length;j++){
            if(t[j]==0)
            c++;
        }
        if(c==s.length){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}