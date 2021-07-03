import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processInputData() {
        Scanner sc = new Scanner(System.in);
        model.generateRandomNumber();
        view.printMessage(View.INPUT_NUMBER);

        while (model.processInputNumber(inputIntValueWithScanner(sc))) {
            view.printMessage(view.PASSED_NUMBERS);
            view.printPassedNumbers(model.getPassedNumbers());
            view.printMessage(view.CURRENT_RANGE);
            view.printRange(model.getMinLimit(), model.getMaxLimit());
            view.printMessage(view.WRONG_ANSWER);
        }

        view.printMessage(View.WIN + model.getRandomNumber());
        view.printMessage(View.STATISTICS);
        view.printPassedNumbers(model.getPassedNumbers());
    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res;
        while (true) {
            if (!sc.hasNextInt()) {
                view.printMessage(View.INCORRECT_INPUT);
                sc.next();
                continue;
            }

            res = sc.nextInt();

            if (model.isInPassedNumberList(res)) {
                view.printMessage(view.IS_IN_PASSED_NUMBER_LIST);
                continue;
            }

            if (res <= model.getMinLimit() || res >= model.getMaxLimit()) {
                view.printMessage(view.IS_NOT_IN_RANGE);
                continue;
            }
            break;
        }
        return res;
    }


}
