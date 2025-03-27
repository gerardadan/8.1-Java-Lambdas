package org.ex5;

import org.Months;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        printList(Months.getMonths());
    }

    public static void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}