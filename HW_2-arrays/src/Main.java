public class Main {
    public static void main(String[] args) {
        Model model = new Model(Utils.MIN_LIMIT, Utils.MAX_LIMIT);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processInputData();
    }
}
