//Code refactoring:
//
//        - refactor the code in OOP-code.
//        - if/else-, switch/case, ?- Operators are forbidden
//        - try to use generics.
//        - create useful junit-test


import model.*;

import java.util.ArrayList;

import static util.Util.function;
import static util.Util.getActions;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Action> actions = getActions();

        System.out.println("result is :"+function(6,4,actions.get(0)));
        System.out.println("result is :"+function(6,4,actions.get(1)));
        System.out.println("result is :"+function(6,4,actions.get(2)));
        System.out.println("result is :"+function(6,4,actions.get(3)));
        System.out.println("result is :"+function("6", "4", actions.get(0)));
    }
}
