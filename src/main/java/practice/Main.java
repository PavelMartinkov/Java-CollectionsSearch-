package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import static practice.CoolNumbers.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    static CoolNumbers coolNumbers = new CoolNumbers();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер:");
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("X") || input.contains("Y") || input.contains("Z") || input.contains("N") || input.contains("R")) {
                System.out.println(coolNumbers.generateCoolNumbers());
            } else {
                ArrayList<String> coolNumbersList = new ArrayList<>(generateCoolNumbers());
                HashSet<String> coolNumbersHashSet = new HashSet<>(generateCoolNumbers());
                TreeSet<String> coolNumbersTreeSet = new TreeSet<>(generateCoolNumbers());
                System.out.println(bruteForceSearchInList(coolNumbersList, input));
                System.out.println(binarySearchInList(coolNumbersList, input));
                System.out.println(searchInHashSet(coolNumbersHashSet, input));
                System.out.println(searchInTreeSet(coolNumbersTreeSet, input));
            }
        }
    }
}
