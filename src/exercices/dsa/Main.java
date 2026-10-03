package exercices.dsa;

public class Main {
    public static void main(String[] args) {
        System.out.println(DigitsCounter.countNumbOfDigitsUsingLogarithms(47324732));
        System.out.println(DigitsCounter.countNumbOfDigitsUsingModulo(12313213));
        System.out.println(DigitsCounter.countNumbOfDigitsUsingString(12413413));
        DigitsExtractorPattern.extractingDigitsFromBeginning(3123);
        DigitsExtractorPattern.extractingDigitsFromEnd(459548);
        System.out.println();
        System.out.println(EvenOrOdd.checkWhetherNumbIsEvenOrOdd(21312));
        System.out.println();
        System.out.println(SummaryExercices.sumUsingRecursion(4));
    }
}
