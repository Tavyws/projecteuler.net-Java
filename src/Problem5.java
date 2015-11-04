public class Problem5 {

    public static void main(String[] args) {


/*
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

        for(Long i = 2520L;;i++) {
            if(Problem5.satisfiesProblem(i)) {
                System.out.println(i);
                break;
            }
        }

    }

    public static boolean satisfiesProblem(Long number) {
        for(Long i = 2L; i <= 20; i++) {
            if(number % i != 0) return false;
        }

        return true;
    }

}
