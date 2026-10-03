package exercices.dsa;

import java.util.List;

public class TakeNotTakePattern {
    public static void main(String[] args) {

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

    public static void findCombinationsToSumTarget(){// array = 1 2 3 4 5 6 7 8    target = 7
                            //ds = {1,1,1,1,1,1,1}   sum=7
    }

}
