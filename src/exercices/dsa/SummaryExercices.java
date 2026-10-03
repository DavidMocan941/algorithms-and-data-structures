package exercices.dsa;

public class SummaryExercices {
    static int sumUsingLoop(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }
        return result;
    }

    static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

   // static int findClosesNumber(int n, int m) { // 12 13 14 15 16 17 18 19  4
        // 15 / 4 = 3    3 * 4 = 12

     //   int q = n / m;
      //  int n1 = q * m;
       // int n2 =
   // }
}
