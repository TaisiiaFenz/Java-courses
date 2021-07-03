import java.util.List;

public class View {
    public final static String INPUT_NUMBER = "Enter INT number: ";
    public final static String IS_IN_PASSED_NUMBER_LIST = "Input number is already in list!\n";
    public static final String IS_NOT_IN_RANGE = "Input number is not in range!\n";
    public final static String INCORRECT_INPUT = "Wrong input! Repeat please!\n";
    public final static String PASSED_NUMBERS = "Passed numbers:\n";
    public final static String CURRENT_RANGE = "Current range is: ";
    public final static String WRONG_ANSWER = "Wrong answer! Try again!\n";
    public final static String WIN = "That's the right number! You win: ";
    public final static String STATISTICS = "\nStatistics:\n";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printPassedNumbers(List list) {
        System.out.println(list);
    }

    public void printRange(int minLimit, int maxLimit) {
        System.out.println("[" + minLimit + "; " + maxLimit + "]");
    }
}
