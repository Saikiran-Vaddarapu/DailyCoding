/* 
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
*/

import java.util.Scanner;
import java.util.ArrayList;
public class AutoComplete {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        String queryString = s.next();
        int length = queryString.length();
        String[] searchList = new String[3];
        for(int i = 0 ; i < 3;i++){
               searchList[i] = s.next();
               String substr = searchList[i].substring(0,length);
               if(queryString.equals(substr))
               ar.add(searchList[i]);
        }
        System.out.println(ar);
        s.close();
    }
}
