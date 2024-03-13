package yalg1.hw1;

import java.util.*;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> phonebook = new LinkedList<>();
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        String lookup = sc.nextLine();
        phonebook.add(line1);
        phonebook.add(line2);
        phonebook.add(line3);
        lookup = normalize(lookup);

        for (String line : phonebook) {
            System.out.println(isExist(line, lookup));
        }

    }

    static String isExist(String line, String lookup) {
        String normalizedLookup = normalize(lookup);
        int length = normalizedLookup.length();
        String normalizedLine = normalize(line).substring(0, length);
        String result = normalizedLine.equals(normalizedLookup) ? "YES"
                : "NO";
        return result;
    }

    static String normalize(String line) {
        String result = line.replaceAll("\\+7", "8");
        result = result.replaceAll("\\D", "");
        return result;

    }
}

/*
kotlin
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val phonebook = LinkedList<String>()
    val line1 = sc.nextLine()
    val line2 = sc.nextLine()
    val line3 = sc.nextLine()
    var lookup = sc.nextLine()
    phonebook.add(line1)
    phonebook.add(line2)
    phonebook.add(line3)
    lookup = normalize(lookup)

    for (line in phonebook) {
        println(isExist(line, lookup))
    }
}

fun isExist(line: String, lookup: String): String {
    val normalizedLookup = normalize(lookup)
    val length = normalizedLookup.length
    val normalizedLine = normalize(line).substring(0, length)
    return if (normalizedLine == normalizedLookup) {
        "YES"
    } else {
        "NO"
    }
}

fun normalize(line: String): String {
    var result = line.replace("+7", "8")
    result = result.replace("\\D".toRegex(), "")
    return result
}

 */
