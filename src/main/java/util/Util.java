package util;

import model.*;

import java.util.ArrayList;

public class Util {

    public static int function(int a, int b, Action action) throws Exception
    {
        return action.doAction(a,b);
    }

    public static String function(String a, String b, Action action) throws Exception
    {
        if (action.getClass().equals((new Addition()).getClass())){
            return a + b;
        } else {
            throw new Exception();
        }
    }

    public static ArrayList<Action> getActions() {
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Addition());
        actions.add(new Subtraction());
        actions.add(new Multiplication());
        actions.add(new Division());
        return actions;
    }
}
