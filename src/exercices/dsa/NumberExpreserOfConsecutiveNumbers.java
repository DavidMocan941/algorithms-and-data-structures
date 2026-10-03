package exercices.dsa;

import java.util.HashMap;
import java.util.Map;

public class NumberExpreserOfConsecutiveNumbers {
    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("David");
        printName(n - 1);
    }

    public static void main(String[] args) {
        // int divisor = findGreatestCommonDivisor(476, 232);
        //System.out.println(divisor);
        System.out.println(findGreatestCommonDivisorUsingRecursion(40, 10));
        //printName(5);
    }

    static int findGreatestCommonDivisor(int a, int b) {
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int target;
        while (a % b != 0) {// a = b -> a=4 b=6%4=2  a%b==0 true
            target = a;
            a = b;
            b = target % b;
        }
        return b;
    }

    static int findGreatestCommonDivisorUsingRecursion(int a, int b) {
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return (a % b == 0) ? b : findGreatestCommonDivisorUsingRecursion(b, a % b);
    }

    public static int fetchTheMajorityElement(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        int element = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            count = map.get(array[i]);
            if (count > length / 2) {
                element = array[i];
                break;
            }

        }
        return element;
    }

    public static void printHollowRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == m - 1 || j == 0) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printFloydTriangle1(int n) {
        int numb = 1;
        int numbersInRow = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numbersInRow; j++) {
                System.out.print(numb + " ");
                numb++;
            }
            numbersInRow++;
            System.out.println();
        }
    }

    public static void printFloydTriangle2(int n) {
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val++ + " ");
            }
            System.out.println();
        }
    }


    static boolean expressANumber1(int n) {
        int digit;
        int countDigits = (int) Math.log10(n);
        int divisor = (int) Math.pow(10, countDigits);
        int sum = 0;
        int number = n;
        while (n != 0) {
            digit = n / divisor;
            n = n % divisor;
            divisor = divisor / 10;
            sum += digit;
            if (sum > number) {
                sum = 0;
            } else if (sum == number) {
                return true;
            }
        }
        return false;
    }

    static boolean expressANumber2(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum > n) {
                sum = i;
            } else if (sum == n) {
                return true;
            }
        }
        return false;
    }

    static void expressNumbers(int n, int toLeft, int toRight) {
        for (int i = n - toLeft; i <= n + toRight; i++) {
            System.out.print(i + " ");
        }
    }

    static void solidRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
