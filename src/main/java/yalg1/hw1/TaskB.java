package yalg1.hw1;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();

        String result = isTriangle(sideA, sideB, sideC);
        System.out.println(result);
    }

    static String isTriangle(int sideA, int sideB, int sideC) {
        String verdict = "NO";
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            verdict = "NO";
        } else {
            if ((sideA + sideB) > sideC &&
                    (sideA + sideC) > sideB &&
                    (sideB + sideC) > sideA) {
                verdict = "YES";
            }
        }


        return verdict;

    }
}
