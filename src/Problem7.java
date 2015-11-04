import java.math.BigInteger;

public class Problem7 {

    public static void main(String[] args) {

/*
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

        What is the 10 001st prime number?
*/

        Problem7.isPrime(BigInteger.valueOf(104744));
        BigInteger i, nthPrime = BigInteger.ZERO;
        for(i = BigInteger.valueOf(2); nthPrime.compareTo(BigInteger.valueOf(10001)) < 0; i = i.add(BigInteger.ONE)) {
            if (Problem7.isPrime(i)) {
                nthPrime = nthPrime.add(BigInteger.ONE);
            }
        }
        System.out.print(i);

    }

    /**
     * Checks if the parameter is prime
     * @param n BigInteger
     * @return Boolean
     */
    public static boolean isPrime(BigInteger n) {
        for(BigInteger i = BigInteger.valueOf(2); i.compareTo(n.divide(BigInteger.valueOf(2))) <= 0; i = i.add(BigInteger.ONE)) {
            if(n.remainder(i).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
        }

        return true;
    }

}
