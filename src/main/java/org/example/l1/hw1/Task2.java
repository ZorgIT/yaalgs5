package org.example.l1.hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        boolean firstHome = Integer.parseInt(line3) == 1 ? true : false;

        System.out.println(calculateGoalsToWin(line1, line2, firstHome));
        sc.close();
    }

    public static int calculateGoalsToWin(String l1, String l2, boolean firstHome) {
        int goalsToWin = 0;
        String[] match1 = l1.split(":");
        String[] match2 = l2.split(":");
        int x1 = Integer.parseInt(match1[0]);
        int x2 = Integer.parseInt(match2[0]);
        int y1 = Integer.parseInt(match1[1]);
        int y2 = Integer.parseInt(match2[1]);

        if ((x1 + x2) > (y1 + y2)) {
            // если счет в обоих матчах больше - доп голов не нужно
            return goalsToWin;
        }
        if ((x1 == y1) && (x2 == y2)) {
            //счет равный в обоих матчах - нужен 1 гол в текущем
            if (x1 < y2 && firstHome) {
                return goalsToWin;
            } else
                goalsToWin = firstHome ? 1 : 0;
            return goalsToWin;
        }

        if ((x1 + x2) < (y1 + y2)) {
            if (firstHome && x1 > y1) {
                int goaltowinChek = (y1 + y2) - (x1 + x2);
                goalsToWin = goaltowinChek + (firstHome ? 0 : 1) + 1;
            } else if (!firstHome && x1 > y1) {
                goalsToWin = (y1 + y2) - (x1 + x2);
            }else {
                goalsToWin = (y1 + y2) - x1 - x2 + (firstHome ? 0 : 1);
            }
            return goalsToWin;
        } else if ((x1 + x2) == (y1 + y2)) {
            if (!firstHome && x1 > y2) {
                return goalsToWin;
            } else if (firstHome && y1 < x2) {
                return goalsToWin;
            } else {
                return ++goalsToWin;
            }
        } else {
            int firstRound = y1 - x1;
            goalsToWin = y2 - x2 + firstRound + 1;
            return goalsToWin;
        }
    }
}
