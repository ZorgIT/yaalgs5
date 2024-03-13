package yalg1.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static yalg1.hw1.TaskC.isExist;

class TaskCTest {
    @Test
    public void testFromTask1() {
        String result = isExist("8(495)430-23-97", "8-495-430");
        assertEquals("YES", result);
        result = isExist("+7-4-9-5-43-023-97", "8-495-430");
        assertEquals("YES", result);
        result = isExist("4-3-0-2-3-9-7", "8-495-430");
        assertEquals("NO", result);
    }

    @Test
    public void testFromTask3() {
        String result = isExist("+78047952807", "88047952807");
        assertEquals("YES", result);
        result = isExist("+78047952807", "88047952807");
        assertEquals("YES", result);
        result = isExist("+76147514928", "88047952807");
        assertEquals("NO", result);
    }

}