package baseball.domain;

public class User {

    private int[] inputNum;

    public User(int[] inputNum) {
        this.inputNum = inputNum;
    }

    public int[] getInputNum() {
        return inputNum;
    }

    public void setInputNum(int[] inputNum) {
        this.inputNum = inputNum;
    }
}