package model;

public class Multiplication implements Action {
    public Multiplication() {
    }

    @Override
    public int doAction(int a, int b) {
        return a * b;
    }
}
