/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

SOLUTION NOTE: This problem is easily solved by squaring 999 (the largest 3-digit number) and iterating down
until we arrive at a palindrome.
 */

package euler.solutions;

import static java.lang.Math.sqrt;

public class P004 {
    public static void main(String[] args){
        System.out.println(highestPalindrome());
    }
    public static boolean isPalindrome(int value) {
        String candidate = String.valueOf(value);

        for (int i = 0, j = candidate.length() - 1; i < j; i++, j--) {
            if (candidate.charAt(i) != candidate.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static int highestPalindrome(){
        int max = 0;

        for(int i = 999; i > 0; i--){
            for(int j = 999; j > 0; j--){
                if(isPalindrome(i * j) && ((i * j) > max)){
                    max = i * j;
                }
            }
        }
        return max;
    }
}
