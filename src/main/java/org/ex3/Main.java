package org.ex3;

import org.Months;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        printList(Months.getMonths());
    }

    public static void printList(List<String> list) {
        list.forEach((x) -> System.out.println(x));
    }
}