/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

SOLUTION NOTE: I chose to approach this problem similarly to how the sieve of Eratosthenes solves for primes below
a given limit, except in this case the limit is the square root of the number we want to factor, and we must
additionally divide it by any prime factors we discover. This has the advantage that the number we are trying to factor
becomes smaller as iteration proceeds, shortening subsequent steps.

This will factor arbitrarily large numbers and should be passed a runtime argument of 600851475143 to arrive
at the solution to the project euler problem.

 */

package euler.solutions;

import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

public class P003 {
    public static void main(String[] args){
        BigInteger value = new BigInteger(args[0]);
        BigInteger root = value.sqrt();

        BigInteger mostRecentFactor = ZERO;

        // this is semantically equivalent to for(int i = 2; i <= sqrt(value); i++)
        for(BigInteger i = TWO; (i.compareTo(root) <= 0); i = i.add(ONE)){
            if(value.mod(i).equals(ZERO)){
                mostRecentFactor = i;

                while(value.mod(i).equals(ZERO)){
                    value = value.divide(i);
                }
            }
        }

        System.out.printf("The largest prime factor of %s is %s", args[0], mostRecentFactor);
    }
}
