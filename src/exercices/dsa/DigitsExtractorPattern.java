package exercices.dsa;

public class DigitsExtractorPattern {
    public static void extractingDigitsFromBeginning(int number) {
        int exponent = (int) Math.log10(number);
        int divisor = (int) Math.pow(10, exponent);
        int first;
        while (number != 0) {
            first = number / divisor;
            System.out.println("quotient: " + first);
            number = number % divisor;
            divisor = divisor / 10;
        }
    }

    public static void extractingDigitsFromEnd(int n) {
        int last;
        while (n > 0) {
            last = n % 10;
            System.out.print(last + " ");
            n = n / 10;
        }
    }
}
