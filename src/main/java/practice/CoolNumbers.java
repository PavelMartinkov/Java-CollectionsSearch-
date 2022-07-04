package practice;

import java.util.*;


public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        String[] carLetters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 111; i <= 999; i+= 111) {
            for (String letter1 : carLetters) {
                for (String letter2 : carLetters) {
                    for (String letter3 : carLetters) {
                        for (int reg = 1; reg <= 199; reg++) {
                            if (reg < 10) {
                                 reg = Integer.parseInt("0" + reg);
                            }
                            arrayList.add(String.format("%s%03d%s%s%d", letter1, i, letter2, letter3, reg));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (list.contains(number)) {
            Collections.sort(arrayList);
            long start  = System.nanoTime();
            System.out.println("Поиск перебором: номер найден/не найден, поиск занял " + (System.nanoTime() - start) + " нс");
            return true;
        } else {
            return false;
        }
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        if (sortedList.contains(number)) {
            Collections.binarySearch(arrayList1, number);
            long start  = System.nanoTime();
            System.out.println("Бинарный поиск: номер найден/не найден, поиск занял " + (System.nanoTime() - start) + " нс");
            return true;
        } else {
            return false;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        HashSet<String> hashSet1 = new HashSet<>();
        if (hashSet.contains(number)) {
            hashSet1.add(number);
            long start  = System.nanoTime();
            System.out.println("Поиск в HashSet: номер найден/не найден, поиск занял " + (System.nanoTime() - start) + " нс");
            return true;
        } else {
            return false;
        }
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        if (treeSet.contains(number)) {
            treeSet1.add(number);
            long start  = System.nanoTime();
            System.out.println("Поиск в TreeSet: номер найден/не найден, поиск занял " + (System.nanoTime() - start) + " нс");
            return true;
        } else {
            return false;
        }
    }
}