package model;

public class Addition implements Action {
    public Addition() {
    }

    @Override
    public int doAction(int a, int b) {
        return a + b;
    }
}
