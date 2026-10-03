package exercices.dsa;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowPattern {
    public static void main(String[] args) {
        int result = fetchLengthOfLongestSubstring("abcdbd");
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int secondLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                secondLength++;
            } else {
                if (secondLength > length) {
                    length = secondLength;
                }
                secondLength = 0;
                i = map.get(s.charAt(i));
                map.clear();
            }
        }
        return (secondLength > length) ? secondLength : length;

    }

    public static int fetchLengthOfLongestSubstring(String s) {//This is optimized solution
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(length, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}
