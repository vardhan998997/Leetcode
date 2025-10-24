import java.util.*;

class Solution {
    // Static list to hold all beautiful numbers (generated once)
    private static final List<Integer> beautifulNumbers = new ArrayList<>();

    // Static block runs only once when class loads
    static {
        // generateAllBeautifulNumbers();
        generateBeautifulNumbers("", new int[10]);
        Collections.sort(beautifulNumbers);
    }

    public int nextBeautifulNumber(int n) {
        for (int num : beautifulNumbers) {
            if (num > n) return num;
        }
        return -1;
    }

    // // Generate all beautiful numbers only once
    // private static void generateAllBeautifulNumbers() {
        
    // }

    private static void generateBeautifulNumbers(String current, int[] count) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (isBeautiful(count)) beautifulNumbers.add(num);
        }
        if (current.length() >= 7) return;

        for (int digit = 1; digit <= 7; digit++) {
            count[digit]++;
            generateBeautifulNumbers(current + digit, count);
            count[digit]--;
        }
    }

    private static boolean isBeautiful(int[] count) {
        for (int i = 1; i <= 9; i++) {
            if (count[i] > 0 && count[i] != i) return false;
        }
        return true;
    }
}
