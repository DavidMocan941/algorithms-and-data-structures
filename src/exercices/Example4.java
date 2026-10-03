package exercices;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
    public static Map<Character, Integer> countDigitsFromANumber(int number) {
        String digits = Integer.toString(number);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length(); i++) {
            map.put(digits.charAt(i), map.getOrDefault(digits.charAt(i), 0) + 1);
        }
        return map;
    }
}
