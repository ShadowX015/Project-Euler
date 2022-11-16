/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package euler.solutions;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class P005 {
    public static void main(String[] args){
        int result = lcm(1, 2);

        for(int i = 3; i <= 20; i++){
            result = lcm(result, i);
        }

        System.out.printf("The LCM of 1..20 is %d", result);
    }
    // LCM = (a * b) / gcd(a, b)
    public static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }
    // recursive implementation of Euclid's Algorithm
    public static int gcd(int a, int b){
        if(a == 0 || b == 0){
            return max(a, b);
        }
        else {
            return gcd(min(a, b), max(a, b) % min(a, b));
        }
    }
}
