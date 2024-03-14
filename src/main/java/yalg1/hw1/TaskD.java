package yalg1.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //String result = solve(a, b, c);
//        System.out.println(result);
    }


    public static String solve(int a, int b, int c) {
        String result = "";

        if (a == 0) {
            if (b != 0) {
                result = "" + (-c / b);
                System.out.println(result);
                return result;
            }
            if (b == 0 && c == 0) {
                result = "MANY SOLUTIONS";
                System.out.println(result);
                return result;
            }
        } else {
            int discriminant = b * b - 4 * a * c;
            int x1;
            int x2;
            if (discriminant == 0) {
                x1 = -b / (2 * a);
                result = x1 + "";
                System.out.println(result);
                return result;
            } else if (discriminant > 0) {
                x1 = ((int) ((-b - Math.sqrt(discriminant)) / (2 * a)));
                x2 = ((int) ((-b + Math.sqrt(discriminant)) / (2 * a)));
                result = x1 < x2 ? (x1 + " " + x2) : (x2 + " " + x1);
                System.out.println(result);
                return result;
            }
        }
        return "NO SOLUTION";
    }
}
