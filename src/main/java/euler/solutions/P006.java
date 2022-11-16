/*
The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
    3025 - 385 = 2640
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

package euler.solutions;

public class P006 {
    public static void main(String[] args){
        int difference = squareSum(100) - sumSquares(100);
        System.out.printf("The difference between the sum of the squares and the square of the sums is %d", difference);
    }
    // sum all of the squares up to and including max
    public static int sumSquares(int max){
        int sum = 0;
        for(int i = 1; i <= max; i++){
            sum += (i * i);
        }
        return sum;
    }
    // square the sum of all of the digits up to and including max
    public static int squareSum(int max){
        int sum = 0;
        for(int i = 1; i <= max; i++){
            sum += i;
        }
        return sum * sum;
    }
}
