package exercices.dsa;

public class RecursionAndMemoization {
    public static void main(String[] args) {

    }

    static int findFibonacciNumber(int n, int[] array) {

        if (array[n] != 0) {
            return array[n];
        }
        if (n <= 1) {
            return n;
        }
        int previousSummary = findFibonacciNumber(n - 1, array);
        int previousPreviousSummary = findFibonacciNumber(n - 2, array);
        int result = previousPreviousSummary + previousSummary;
        array[n] = result;
        return result;
    }
}
