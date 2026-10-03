package exercices.dsa;

public class TwoPointers {
    public static void main(String[] args) {

    }

    static boolean isSubsequence(String s, String t) {
        int index = 0;
        if (s.equals("") || s.equals("") && t.equals("")) return true;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
            if (index == s.length()) {
                return true;
            }
        }
        return false;
    }
}
