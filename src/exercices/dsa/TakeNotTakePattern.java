package exercices.dsa;

import java.util.ArrayList;
import java.util.List;

public class TakeNotTakePattern {
    public static void main(String[] args) {
        //findSubsequencesWithSumK(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new ArrayList<>(), 30, 0, 0);
        List<List<Integer>> combinationsSum = combinationSum(new int[]{1, 2, 3, 4, 5}, 5);
        //for (List<Integer> combinationSum : combinationsSum) {
        //for (int value : combinationSum) {
        //  System.out.print(value);
        // }
        // System.out.println();
        // }
        combinationsSum.stream().forEach(list -> {
            list.stream().forEach(val -> {
                System.out.print(val + " ");
            });
            System.out.println();
        });

    }

    private static void findSubsequencesWithSumK(int[] numbs, List<Integer> subsequence, int k, int sum, int index) {
        if (index == numbs.length) {
            if (sum == k) {
                subsequence.stream().forEach(System.out::print);
                System.out.println();
            }
            return;
        }
        subsequence.add(numbs[index]);

        findSubsequencesWithSumK(numbs, subsequence, k, sum + numbs[index], index + 1);

        subsequence.remove(subsequence.size() - 1);

        findSubsequencesWithSumK(numbs, subsequence, k, sum, index + 1);
    }

    private static int countSubsequencesWhereSumIsK(int[] numbs, int k, int sum, int index) {
        if (sum > k) return 0;

        if (index == numbs.length) {
            return (sum == k) ? 1 : 0;
        }

        sum += numbs[index];

        int left = countSubsequencesWhereSumIsK(numbs, k, sum, index + 1);
        sum -= numbs[index];

        int right = countSubsequencesWhereSumIsK(numbs, k, sum, index + 1);
        return left + right;
    }

    private static boolean findSubsequenceWithSumK(int[] numbs, List<Integer> subsequence, int k, int sum, int index) {
        if (index == numbs.length) {
            if (sum == k) {
                subsequence.stream().forEach(System.out::print);
                return true;
            }
            return false;
        }
        subsequence.add(numbs[index]);
        if (findSubsequenceWithSumK(numbs, subsequence, k, sum + numbs[index], index + 1)) {
            return true;
        }
        subsequence.remove(subsequence.size() - 1);
        if (findSubsequenceWithSumK(numbs, subsequence, k, sum, index + 1)) {
            return true;
        }
        return false;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinationsToSumTarget(0, candidates, target, new ArrayList<>(), combinations);
        return combinations;
    }

    public static void findCombinationsToSumTarget(int index, int[] array, int target, List<Integer> combination, List<List<Integer>> combinations) {
        int n = array.length;

        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if (index == n) {
            return;
        }
        if (target >= array[index]) {
            combination.add(array[index]);
            findCombinationsToSumTarget(index, array, target - array[index], combination, combinations);
            combination.remove(combination.size() - 1);
        }
        findCombinationsToSumTarget(index + 1, array, target, combination, combinations);
    }
}
