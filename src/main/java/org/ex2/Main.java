package org.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("o");
        strList.add("oo");
        strList.add("ooo");
        strList.add("oooo");
        strList.add("ooooo");
        strList.add("orange");
        strList.add("blue");
        strList.add("yellow");
        strList.add("brown");

        List<String> filterCharAndLengthList = filterCharAndLengthList(strList, 'o', 5);
    }

    public static List<String> filterCharAndLengthList(List<String> list, char charFilter, int stringLength) {
        return list.stream()
                .filter(c -> c.toLowerCase().contains(String.valueOf(charFilter)))
                .filter(c -> c.length() >= stringLength)
                .toList();
    }
}