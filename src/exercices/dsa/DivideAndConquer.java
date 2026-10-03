package exercices.dsa;

import java.util.Arrays;

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] sorted = mergeSort(new int[]{7, 10, 3, 9, 5});
        Arrays.stream(sorted).forEach((val) -> System.out.print(val + " "));

    }

    static int[] mergeSort(int[] array) {
        int n = array.length;
        if (n == 1) {
            return array;
        }
        int middle = n / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, n);
        int[] array1 = mergeSort(left);
        int[] array2 = mergeSort(right);
        int[] sorted = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j != array2.length & i != array1.length) {//Two pointers pattern we used here
            if (array2[j] <= array1[i]) {                //Compare two elements and add the smaller one
                sorted[k] = array2[j];
                j++;
            } else if (array1[i] <= array2[j]) {
                sorted[k] = array1[i];
                i++;
            }
            k++;
        }
        while (j != array2.length) {
            sorted[k] = array2[j];
            k++;
            j++;
        }
        while (i != array1.length) {
            sorted[k] = array1[i];
            k++;
            i++;
        }
        return sorted;
    }
}
