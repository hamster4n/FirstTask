package util;

import model.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static util.Util.getActions;

public class UtilTest {

    private final int a = 6;
    private final int b = 7;
    private final int zero = 0;
    private String d = "6";
    private String f = "7";
    ArrayList<Action> actions = getActions();


    @Test
    public void functionIntUseAddition() throws Exception {
        Action action = new Addition();
        int actual = Util.function(a, b, action);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void functionIntUseSubtraction() throws Exception {
        Action action = new Subtraction();
        int actual = Util.function(a, b, action);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void functionIntUseMultiplication() throws Exception {
        Action action = new Multiplication();
        int actual = Util.function(a, b, action);
        int expected = 42;
        assertEquals(expected, actual);
    }

    @Test
    public void functionIntUseDivisionWithNoZeroDivider() throws Exception {
        Action action = new Division();
        int actual = Util.function(a, b, action);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void functionIntUseDivisionWithZeroDividerMustThrowException() throws Exception {
        Action action = new Division();
        String actual = "";
        try {
            int actualZero = Util.function(a, zero, action);
        } catch (ArithmeticException e) {
            actual = e.getClass().toString();
        }
        String expected = "class java.lang.ArithmeticException";
        assertEquals(expected, actual);
    }

    @Test
    public void functionString() throws Exception {
        Action action = new Addition();
        String actual = Util.function(d, f, action);
        String expected = "67";
        assertEquals(expected, actual);
    }

    @Test
    public void functionStringMustGiveExceptionWhithWrongAction() throws Exception {
        Action wrongAction = new Division();
        String actual = "";
        try {
            actual = Util.function(d, f, wrongAction);
        } catch (Exception e){
            actual = e.getClass().toString();
        }
        String expected = "class java.lang.Exception";
        assertEquals(expected, actual);
    }

}