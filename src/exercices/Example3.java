package exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example3 {
    public static Map<Character, Integer> countDigitsFromANumber(int number) {
        String str = String.valueOf(number);
        StringBuilder digits = new StringBuilder(str);
        int count = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length(); i++) {
            for (int j = i + 1; j < digits.length(); j++) {
                if (digits.charAt(j) == digits.charAt(i)) {
                    count++;
                    digits.deleteCharAt(j);
                    j--;
                }

            }
            map.put(digits.charAt(i), count);
            count = 1;
        }
        return map;
    }
}
