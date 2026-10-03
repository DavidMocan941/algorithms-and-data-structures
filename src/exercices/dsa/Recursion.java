package exercices.dsa;

import java.util.List;

public class Recursion {
    public static void main(String[] args) {

    }


    static boolean isPalindrome(String s, int start) {
        int length = s.length();
        if (start > length / 2) return true;
        if (s.charAt(start) != s.charAt(length - 1 - start)) return false;
        return isPalindrome(s, start + 1);
    }

    static void findSubsequences(int[] arr, List<Integer> list, int index) {//
        if (index >= arr.length) {
            list.stream().forEach((elem) -> System.out.print(elem + " "));
            System.out.println();
            return;
        }
        list.add(arr[index]);
        findSubsequences(arr, list, index + 1);
        list.remove(list.size() - 1);
        findSubsequences(arr, list, index + 1);

    }

    static int findFibonacciNumber(int n, int i, int x, int y) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        if (i == n) return x + y;
        return findFibonacciNumber(n, i + 1, x + y, x);
    }


    static void reverseArray(int[] array, int start) {
        int length = array.length;
        if (start > length - 1 - start) return;
        int target = array[start];
        array[start] = array[length - 1 - start];
        array[length - 1 - start] = target;
        reverseArray(array, start + 1);
    }

    static int findFactorialOfN(int n) {
        if (n == 1) {
            return n;
        }
        return n * findFactorialOfN(n - 1);//1, 2, 6
    }

    static void findFactorialOfN(int n, int factorial) {
        if (n == 1) {
            System.out.println(factorial);
            return;
        }
        findFactorialOfN(n - 1, n * factorial);
    }

    static void reverseArray(int[] array, int start, int end) {
        if (start > end) {
            return;
        }
        int target = array[start];
        array[start] = array[end];
        array[end] = target;
        reverseArray(array, start + 1, end - 1);// 1 (2) 3 (4) 5

    }

    static int sumOfFirstNNumbers(int n) {//Functional
        if (n == 1) {
            return n;
        }
        return n + sumOfFirstNNumbers(n - 1);
    }

    static void sumOfFirstNNumbers(int n, int sum) {//Parametirized
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumOfFirstNNumbers(n - 1, sum + n);
    }

    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("David");
        printName(n - 1);
    }

    static void printName1(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("John");
        printName1(i + 1, n);
    }

    static void printLinearlyFromOneToN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printLinearlyFromOneToN(i + 1, n);
    }

    static void printLinearlyFromNToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printLinearlyFromNToOne(n - 1);
    }

    static void printLinearlyFromOneToNUsingBacktracking(int n) {
        if (n == 0) {
            return;
        }
        printLinearlyFromOneToNUsingBacktracking(n - 1);
        System.out.print(n + " ");
    }

    static void printLinearlyFromNtoOneUsingBacktracking(int i, int n) {
        if (i > n) {
            return;
        }
        printLinearlyFromNtoOneUsingBacktracking(i + 1, n);
        System.out.print(i + " ");
    }

}
