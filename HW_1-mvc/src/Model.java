public class Model {

    private String word_1;
    private String word_2;
    private String sentence;

    public String getWord_1() {
        return word_1;
    }

    public String getWord_2() {
        return word_2;
    }

    public void setWord_1(String word_1) {
        this.word_1 = word_1;
    }

    public void setWord_2(String word_2) {
        this.word_2 = word_2;
    }

    public void setSentence() {
        this.sentence = this.word_1 + " " + this.word_2;
    }

    public String getSentence() {
        return sentence;
    }
}
