package exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static int[] countNumberOfDigits(int number) {//123

        String num = String.valueOf(number);

        int[] array = new int[10];
        //ArrayList<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
//            array[Character.getNumericValue(num.charAt(i))]++;
//            arrayList.add(Character.getNumericValue(num.charAt(i)), +1);
            if (map.containsKey(Character.getNumericValue(num.charAt(i)))) {
                int count = map.get(Character.getNumericValue(num.charAt(i)));
                map.put(Character.getNumericValue(num.charAt(i)), count + 1);
            }
            map.put(Character.getNumericValue(num.charAt(i)), +1);
        }

        return array;


        //123 % 10 = 12.3|remainder is 3
        //number  = 123/10 = 12
        //12 % 10 = 1.2|remainder is 2
        //number = 12 / 10 = 1
        //1 % = 10 = 0.1| remainder is 1
//        int[] frequency = new int[10];
//        int digit;
//        while (number > 0) {//12
//            digit = number % 10;//3 // 2 // 1
//            frequency[digit] = frequency[digit] + 1;
//            number = number / 10;//12 // 1 //
//        }
//        return frequency;
    }

    public static void main(String[] args) {
        int[] in = countNumberOfDigits(12548856);

        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }
}
