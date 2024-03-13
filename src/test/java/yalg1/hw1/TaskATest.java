package yalg1.hw1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static yalg1.hw1.TaskA.calculateTemp;

class TaskATest {

    @Test
    public void heatMode() {
        int result = calculateTemp(10, 20, "heat");
        assertEquals(20, result);
    }

    @Test
    public void freezeMode() {
        int result = calculateTemp(10, 20, "freeze");
        assertEquals(10, result);
    }

    @Test
    public void autoModeEquals() {
        int result = calculateTemp(10, 10, "auto");
        assertEquals(10, result);
    }

    @Test
    public void autoModeLess() {
        int result = calculateTemp(5, 10, "auto");
        assertEquals(10, result);
    }

    @Test
    public void autoModeGreater() {
        int result = calculateTemp(20, 10, "auto");
        assertEquals(10, result);
    }

    @Test
    public void autoModeBZ() {
        int result = calculateTemp(-20, 10, "auto");
        assertEquals(10, result);
    }

    @Test
    public void fanTest() {
        int result = calculateTemp(10, 20, "fan");
        assertEquals(10, result);
    }

}