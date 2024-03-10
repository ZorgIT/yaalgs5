package org.example.l1.hw1;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.example.l1.hw1.Task1.paintedTree;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void notNearTest() {
        int result = paintedTree(1, 1, 5, 1);
        assertEquals( 6, result);
    }

    @Test
    public void sameStartTest() {
        int result = paintedTree(1, 5, 1, 1);
        assertEquals(11, result);
    }

    @Test
    public void fullInsideRight() {
        int result = paintedTree(1, 1, 2, 5);
        assertEquals(11, result);
    }
    @Test
    public void fullInsideLeft() {
        int result = paintedTree(2, 5, 1, 1);
        assertEquals(11, result);
    }

    @Test
    public void touchTest() {
        int result = paintedTree(1, 1, 2, 1);
        assertEquals(4, result);
    }

    @Test
    public void subZero() {
        int result = paintedTree(-10, 1, -3, 1);
        assertEquals(6, result);
    }


    @Test
    @Ignore
    public void Intersect() {
        int result = paintedTree(3, 3, 6, 2);
        assertEquals(9, result);
    }

    @Test
    public void largNumbers() {
        int result = paintedTree(-100000000, 100000000, 100000000, 100000000);
        assertEquals(400000001, result);
    }


}