import java.util.ArrayList;
import java.util.List;

public class Model {

    private int randomNumber;

    private int minLimit;
    private int maxLimit;

    private List<Integer> passedNumbers = new ArrayList<>();

    public Model(int minLimit, int maxLimit) {
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(int minLimit) {
        this.minLimit = minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public List<Integer> getPassedNumbers() {
        return passedNumbers;
    }

    public void setPassedNumbers(List<Integer> passedNumbers) {
        this.passedNumbers = passedNumbers;
    }

    public void generateRandomNumber() {
        randomNumber = (int)Math.ceil(Math.random()*(maxLimit - minLimit - 1) + minLimit);
    }

    public boolean isInPassedNumberList(int value) {
        return passedNumbers.contains(value);
    }

    public boolean processInputNumber(int value) {
        passedNumbers.add(value);
        if (value == randomNumber) {
            return false;
        } else if (value > randomNumber) {
            maxLimit = value;
        } else {
            minLimit = value;
        }
        return true;
    }

}
