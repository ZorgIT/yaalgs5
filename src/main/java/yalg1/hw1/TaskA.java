package yalg1.hw1;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tRoom = sc.nextInt(); //-50 50
        int tWish = sc.nextInt(); //-50 50
        String workMode = sc.nextLine(); //workmode

        int result = calculateTemp(tRoom, tWish, workMode);
        System.out.println(result);
    }

    static int calculateTemp(int tRoom, int tWish, String workMode) {
        int result = 80;
        switch (workMode) {
            case "freeze":
                result = (tRoom >= tWish) ? tWish : tRoom;
                break;
            case "heat":
                result = (tRoom <= tWish) ? tWish : tRoom;
                break;
            case "auto":
                result = tWish;
                break;
            case "fan":
                result = tRoom;
                break;
        }
        return result;
    }
}

/*
Код на котлин
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tRoom = sc.nextInt() // -50 50
    val tWish = sc.nextInt() // -50 50
    val workMode = sc.next() // workmode

    val result = calculateTemp(tRoom, tWish, workMode)
    println(result)
}

fun calculateTemp(tRoom: Int, tWish: Int, workMode: String): Int {
    var result = 80
    when (workMode) {
        "freeze" -> result = if (tRoom >= tWish) tWish else tRoom
        "heat" -> result = if (tRoom <= tWish) tWish else tRoom
        "auto" -> result = tWish
        "fan" -> result = tRoom
    }
    return result
}
 */
