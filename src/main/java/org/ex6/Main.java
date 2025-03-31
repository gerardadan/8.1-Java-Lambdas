package org.ex6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("oooo");
        strList.add("ooooo");
        strList.add("orange");
        strList.add("blue");
        strList.add("a");
        strList.add("oo");
        strList.add("ooo");
        strList.add("yellow");
        strList.add("brown");

        List<String> list = orderStringListByLength(strList, 'o');
        list.forEach(System.out::println);
    }

    public static List<String> orderStringListByLength(List<String> list, char charFilter) {
        return list.stream()
                .sorted((x, y) -> Integer.compare(x.length(), y.length()))
                .toList();
    }
}