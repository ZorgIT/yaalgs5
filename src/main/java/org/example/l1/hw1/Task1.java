package org.example.l1.hw1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
    distance between trees - 1 meter
    start position for vasya and masha locked

    Task 1 How many trees can you paint?
===========
    vasya parameters
    tree number - P,
    distance to paint dries - V
    ===========
    masha parameters
    tree number - Q
    distance to paint dries - M
===========
===========
       (-max)-P -P -2 -1 |0|  1  2 Q Q+M(max)
===========
===========
===========
1 000 000 00 = 10^8 - maxlength
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt(); //start 1
//        int v = sc.nextInt(); //length 1
//        int q = sc.nextInt(); //start 2
//        int m = sc.nextInt(); //length 2
        int p = 0;
        int v = 7;
        int q = 12;
        int m = 5;
        int result = paintedTree(p, v, q, m);
        System.out.println(result);
    }

    private static int paintedTree(int pStart, int vDistance,
                                   int qStart, int mDistance) {
        if (pStart == qStart) {
            return (Math.abs(vDistance) > Math.abs(mDistance) ?
                    Math.abs(vDistance) * 2 :
                    Math.abs(mDistance) * 2) + 1;
        }
        Set<Integer> result = new HashSet<>();
        fillSet(result, pStart, vDistance);
        fillSet(result, qStart, mDistance);
        return result.size();
    }

    static Set<Integer> fillSet(Set<Integer> inputSet, int Start, int step) {
        for (int i = Start - step; i <= Start + step; i++) {
            inputSet.add(i);
        }
        return inputSet;
    }
}
