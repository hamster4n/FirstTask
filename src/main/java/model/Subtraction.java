package model;

public class Subtraction implements Action {
    public Subtraction() {
    }

    @Override
    public int doAction(int a, int b) {
        return a - b;
    }
}
