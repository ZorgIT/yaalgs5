package org.example.l1.hw1;

import org.junit.jupiter.api.Test;

import static org.example.l1.hw1.Task2.calculateGoalsToWin;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void example1() {
        int goalcaount = calculateGoalsToWin ("0:0", "0:0", true);
        assertEquals(1, goalcaount);
    }
    @Test
    void example2() {
        int goalcaount = calculateGoalsToWin ("0:2", "0:3", true);
        assertEquals(5, goalcaount);
    }
    @Test
    void example3() {
        int goalcaount = calculateGoalsToWin ("0:2", "0:3", false);
        assertEquals(6, goalcaount);
    }

    @Test
    void example5out() {
        int goalcaount = calculateGoalsToWin ("2:2", "1:1", false);
        assertEquals(0, goalcaount);
    }

    @Test
    void example12() {
        int goalcaount = calculateGoalsToWin ("5:4", "3:0", false);
        assertEquals(0, goalcaount);
    }

    @Test
    void example16() {
        int goalcaount = calculateGoalsToWin ("4:3", "2:0", true);
        assertEquals(0, goalcaount);
    }

    @Test
    void example17() {
        int goalcaount = calculateGoalsToWin ("5:2", "2:5", false);
        assertEquals(1, goalcaount);
    }

    @Test
    void example20() {
        int goalcaount = calculateGoalsToWin ("5:2", "0:5", true);
        assertEquals(3, goalcaount);
    }

    @Test
    void example21() {
        int goalcaount = calculateGoalsToWin ("5:2", "0:3", false);
        assertEquals(0, goalcaount);
    }

    @Test
    void example32() {
        int goalcaount = calculateGoalsToWin ("4:5", "5:2", true);
        assertEquals(0, goalcaount);
    }
    @Test
    void example33() {
        int goalcaount = calculateGoalsToWin ("2:2", "3:3", true);
        assertEquals(0, goalcaount);
    }

    @Test
    void example39() {
        int goalcaount = calculateGoalsToWin ("1:3", "5:3", true);
        assertEquals(0, goalcaount);
    }

    @Test
    void example51() {
        int goalcaount = calculateGoalsToWin ("4:3", "0:3", false);
        assertEquals(2, goalcaount);
    }


}