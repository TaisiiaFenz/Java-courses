import java.util.Scanner;

public class Controller {

    public static final String REGEX_WORD_1 = "Hello";
    public static final String REGEX_WORD_2 = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processInputValue() {
        Scanner sc = new Scanner(System.in);
        model.setWord_1(inputCorrectValueWithScanner(sc, REGEX_WORD_1));
        model.setWord_2(inputCorrectValueWithScanner(sc, REGEX_WORD_2));
    }

    public String inputCorrectValueWithScanner(Scanner sc, String regex) {
        view.printMessage(View.INPUT_WORD);
        String word = sc.next();
        while (!(word.equals(regex))) {
            view.printMessage(View.WRONG_INPUT_WORD);
            word = sc.next();
        }
        return word;
    }

    public void createSentence() {
        model.setSentence();
        view.printMessage(View.RESULT_SENTENCE);
        view.printMessage(model.getSentence());
    }
}
