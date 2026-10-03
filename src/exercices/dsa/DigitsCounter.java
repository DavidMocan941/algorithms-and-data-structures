package exercices.dsa;

public class DigitsCounter {
    public static int countNumbOfDigitsUsingLogarithms(int number) {
        return (int) Math.log10(number) + 1;
        // exponent = number of digits after the first digit in a number
    }

    public static int countNumbOfDigitsUsingModulo(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int countNumbOfDigitsUsingString(int number) {
        return Integer.toString(number).length();
    }
}
