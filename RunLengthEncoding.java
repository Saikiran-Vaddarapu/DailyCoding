
/* Run-length encoding is a fast and simple method of encoding strings. 
The basic idea is to represent repeated successive characters as a single count and character. 
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A". */

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        String val = Sc.next();
        char ch = val.charAt(0);
        int count = 1;
        String ans = "";
        int n = val.length();
        for (int i = 1; i < n ; i++) {
            if (ch == val.charAt(i)) {
                count++;
            } 
            else 
            {
                ans += String.valueOf(count) + String.valueOf(ch);
                ch = val.charAt(i);
                count = 1;
            }
            if(i == n-1)
            {
                ans += String.valueOf(count) + String.valueOf(ch);
                break;
            }
        }
        System.out.println(ans);
        Sc.close();
    }
}
