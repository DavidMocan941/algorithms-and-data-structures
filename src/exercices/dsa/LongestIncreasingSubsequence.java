package exercices.dsa;

import java.util.*;

public class LongestIncreasingSubsequence {

    private static int findLIS(int[] array) {
        int arrayLength = array.length;
        if (arrayLength == 0) {
            return 0;
        }
        int[] lengths = new int[array.length];
        Arrays.fill(lengths, 1);
        int lis = 1;
        for (int i = 1; i < arrayLength; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && lengths[j] >= lengths[i]) {
                    lengths[i] = lengths[j] + 1;
                }
            }
            if (lengths[i] > lis) {
                lis = lengths[i];
            }
        }
        return lis;
    }


    static void findTwoNumbersWithSumK(int[] numbs, int k) {
        int n = numbs.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; i++) {
                if (numbs[i] + numbs[j] == k) {
                    System.out.print(numbs[j] + ", " + numbs[i]);
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        findTwoNumbersWithSumK(new int[]{1, 2, 3, 4, 5}, 5);
        System.out.println();
    }
}
