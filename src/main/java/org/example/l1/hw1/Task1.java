package org.example.l1.hw1;

import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); //start 1
        int v = sc.nextInt(); //length 1
        int q = sc.nextInt(); //start 2
        int m = sc.nextInt(); //length 2
        int result = paintedTree(p, v, q, m);
        System.out.println(result);
    }

    static int paintedTree(int pStart, int vDistance,
                           int qStart, int mDistance) {
        //стартуют в одном месте
        if (pStart == qStart) {
            return (vDistance > mDistance ?
                    vDistance * 2 + 1 :
                    mDistance * 2 + 1);
        }

        //Один отрезок полностью в другом
        boolean pLeft = (pStart - vDistance) < (qStart - mDistance);
        int x1 = pLeft ? pStart - vDistance : qStart - mDistance;
        int x2 = pLeft ? pStart + vDistance : qStart + mDistance;

        int y1 = pLeft ? qStart - mDistance : pStart - vDistance;
        int y2 = pLeft ? qStart + mDistance : pStart + vDistance;
        int result = 0;
        //два не пересекающихся отрезка
        if (x2 < y1) {
            result = (mDistance * 2 + 1) + (vDistance * 2 + 1);
            return result;
        }

        int mincoord = Math.min(Math.min(x1, y1), Math.min(x2, y2));
        int maxcoord = Math.max(Math.min(x1, y1), Math.max(x2, y2));
        return (0 - mincoord) + maxcoord + 1;
    }

    static Set<Integer> fillSet(Set<Integer> inputSet, int Start, int step) {
        for (int i = Start; i <= step; i++) {
            inputSet.add(i);
        }
        return inputSet;
    }
}
