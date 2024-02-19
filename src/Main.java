import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);

        }
        System.out.println("------------");
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);

        }
        System.out.println("------------");
        List<String> listC = new ArrayList<>();
            listC.addAll(listA);
            listC.addAll(listB);
            System.out.println(" Объединение в ListC: " + listC);
            System.out.println("-----------");

            Collections.sort(listC, Comparator.comparingInt(String::length));
            System.out.println("Отсортированный список по длинне слова по нарастанию: " + listC);
        }
    }







        /*List<String> ListA = new ArrayList<>();
        System.out.println("ListA: ");
        ListA.add("A1");
        ListA.add("A2");
        ListA.add("A3");
        ListA.add("A4");
        ListA.add("A5");
        for (int i = 0; i < ListA.size(); i++) {
            System.out.println(ListA);
        }
        List<String> ListB = new ArrayList<>();
        System.out.println("ListB:");
        ListB.add("B1");
        ListB.add("B2");
        ListB.add("B3");
        ListB.add("B4");
        ListB.add("B5");
        for (int i = 0; i < ListB.size(); i++) {
            System.out.println(ListB);
        }
        List<String> ListC = new ArrayList<>();
        System.out.println("ListC");
        ListC.addAll(ListA);
        ListC.addAll(ListB);
        for (int i = 0; i < ListC.size(); i++) {

            System.out.println(ListC);

        }
    }
}*/



