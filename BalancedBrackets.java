/*  This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false. */

import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        String exp = Sc.next();
        Stack<Character> s = new Stack<>();
        for(char ch : exp.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            s.push(ch);
            else if(ch == ')'){
                char peek = s.peek();
                if(peek == '(')
                s.pop();
                else
                break;
            }
            else if(ch == '}'){
                char peek = s.peek();
                if(peek == '{')
                s.pop();
                else
                break;
            }
            else if(ch == ']'){
                char peek = s.peek();
                if(peek == '[')
                s.pop();
                else
                break;
            }
        }
        if(s.empty())
        System.out.println("Balanced");
        else
        System.out.println("Not Balanced");
        Sc.close();
    }
}
