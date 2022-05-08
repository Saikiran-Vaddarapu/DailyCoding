
// TCS Digital 2nd question

import java.util.*;
public class Second {

    static int max(char ch)
    {
        int h = (int)ch;
        int res = 0;
        while(h!=0){
            int rem = h%10;
            res = Math.max(res,rem);
            h/=10;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String k = s.next();
        int sum = 0;
        char[] ch = k.toCharArray();
        for(int i = 0;i<ch.length;i++)
        {
            if(ch[i] <= 90 && ch[i] >= 65)
            sum += max(ch[i]);
            else if(ch[i] <= 122 && ch[i] >= 97)
            sum += max(ch[i]);
            else if(ch[i]<= 57 && ch[i] >= 48){
                sum += (int)ch[i] - 48;
            }
        }
        System.out.println(sum);
        s.close();
    }
}
