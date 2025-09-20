import java.util.*;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes = new HashSet<>();

        for (int num : nums) {
            while (num % 2 == 0) {
                primes.add(2);
                num /= 2;
            }
            for (int i = 3; i * i <= num; i += 2) {
                while (num % i == 0) {
                    primes.add(i);
                    num /= i;
                }
            }
            if (num > 1) primes.add(num);
        }

        return primes.size();
    }
}
