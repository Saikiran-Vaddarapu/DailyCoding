/*
 2. Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/

import java.util.*;
public class ProductExceptMe {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prod = 1;
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++){
        int k = s.nextInt();
        ar.add(k);
        prod *= k;
        }
        for(int i : ar)
        System.out.print(prod/i +" ");
        s.close();
    }
}
