package exercices;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(raiseAtAPower(2));
        System.out.println(hw(2));
        System.out.println(findClosestNumber(-13, 4));
    }

    public static int raiseAtAPower(int x) {
        int result = x;
        for (int i = 1; i < 3; i++) {
            result *= x;
        }
        return result;
    }

    public static int hw(int x) {
        int p = x;
        int d = 1;
        int s = p / d;
        for (int i = 2; i < 7; i++) {
            p *= x;
            d *= i;
            s += p / d;
        }
        return s;
    }

    static int findClosestNumber(int n, int m) {
        int q = n / m;
        int n1 = q * m;
        int n2 = (q > 0) ? m * (q + 1) : m * (q - 1);
        // the first expression will be executed only if n & m have same signs
        // the second expression will be executed only if n & m have different signs
        if (Math.abs(n - n1) < Math.abs(n - n2)) return n1;
        return n2;//if the distance is equal then the maximum absolute value will be returned which is n2
    }
}
