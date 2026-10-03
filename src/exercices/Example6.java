package exercices;

public class Example6 {
    public static void main(String[] args) {
        int number = findFibonacciNumber(5);
        System.out.println(number);
    }

    public static int findFibonacciNumber(int n) {
        if (n == 1) return 1;
        int sum = 0;
        int x = 1;
        int y = 0;
        for (int i = 2; i <= n; i++) {
            sum = x + y;
            y = x;
            x = sum;
        }
        return sum;
    }
}
