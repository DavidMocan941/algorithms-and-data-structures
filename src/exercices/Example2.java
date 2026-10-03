package exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static Map<Character, Integer> countDigitsFromANumber(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            arrayList.add(digits[i]);
        }
        int count = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) == arrayList.get(i)) {
                    count++;
                    arrayList.remove(j);
                    j--;
                }
            }
            map.put(arrayList.get(i), count);
            count = 1;
        }
        return map;
    }
}
