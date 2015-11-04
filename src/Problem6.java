import java.math.BigInteger;

public class Problem6 {

    public static void main(String[] args) {

/*
        The sum of the squares of the first ten natural numbers is,
        12 + 22 + ... + 102 = 385

        The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)2 = 552 = 3025

        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 ? 385 = 2640.

        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/


        BigInteger sum = BigInteger.ZERO, sumOfSquares = BigInteger.ZERO;

        for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(100)) <= 0; i = i.add(BigInteger.valueOf(1))) {
            sum = sum.add(i);
            sumOfSquares = sumOfSquares.add(i.pow(2));
        }

        BigInteger diff = sum.pow(2).subtract(sumOfSquares);

        System.out.print(diff);

    }

}
