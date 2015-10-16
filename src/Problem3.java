public class Problem3 {

    public static void main(String[] args) {

/*
        The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number 600851475143 ?
*/


        long max = 0, given = 600851475143L;

        for(long i = 2; i <= Math.sqrt(given); i++) {
            if(Problem3.isPrime(i) && given % i == 0)
                max = i;
        }

        System.out.println(max);

    }

    /**
     * Checks if the parameter is prime
     * @param n long
     * @return Boolean
     */
    public static boolean isPrime(long n) {
        for(Integer i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}
