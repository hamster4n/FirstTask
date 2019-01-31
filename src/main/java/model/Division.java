package model;

public class Division implements Action {
    public Division() {
    }

    @Override
    public int doAction(int a, int b) {
        return a / b;
    }
}
