package yalg1.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static yalg1.hw1.TaskB.isTriangle;

class TaskBTest {
    @Test
    public void testFromTask1() {
        String result = isTriangle(3, 4, 5);
        assertEquals("YES", result);
    }

    @Test
    public void testFromTask2() {
        String result = isTriangle(3, 5, 4);
        assertEquals("YES", result);
    }

    @Test
    public void testFromTask3() {
        String result = isTriangle(4, 3, 5);
        assertEquals("YES", result);
    }

    @Test
    public void incorrectInputBZ() {
        String result = isTriangle(-4, 3, 5);
        assertEquals("NO", result);
    }

    @Test
    public void incorrectInputZero() {
        String result = isTriangle(4, 3, 0);
        assertEquals("NO", result);
    }

    @Test
    public void impossibleTriangle1() {
        String result = isTriangle(2, 6, 9);
        assertEquals("NO", result);
    }

    @Test
    public void impossibleTriangle2() {
        String result = isTriangle(7, 2, 4);
        assertEquals("NO", result);
    }


}