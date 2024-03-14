package yalg1.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static yalg1.hw1.TaskC.isExist;
import static yalg1.hw1.TaskD.solve;

class TaskDTest {
    @Test
    public void testFromTask1() {
        String result = solve(1, 0, 0);
        assertEquals("0", result);
    }

    @Test
    public void testFromTask2() {
        String result = solve(1, 2, 3);
        assertEquals("7", result);
    }

    @Test
    public void testFromTask3() {
        String result = solve(1, 2, -3);
        assertEquals("NO SOLUTION", result);
    }

}