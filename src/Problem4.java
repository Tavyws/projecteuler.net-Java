import java.util.ArrayList;
import java.util.Queue;

public class Problem4 {

    public static void main(String[] args) {

/*

        A palindromic number reads the same both ways. The largest palindrome made from
        the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.

*/

        Integer max = 1;

        for(Integer i = 999; i > 100; i--) {
            for(Integer y = 999; y > 100; y--) {
                Integer prod = i * y;
                if(Problem4.isPalindrome(prod) && prod > max) {
                    max = prod;
                }
            }
        }

        System.out.println(max);

    }

    public static boolean isPalindrome(Integer number) {

        ArrayList<Integer> digits = new ArrayList<>();

        while(number > 0) {
            digits.add(digits.size(), number % 10);
            number /= 10;
        }

        for(Integer i = 0; i < (digits.size() / 2); i++) {
            if(!digits.get(i).equals(digits.get(digits.size() - 1 - i)))
                return false;
        }

        return true;
    }

}
