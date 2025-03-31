package org.ex8;

public class Main {
    public static void main(String[] args) {
        TextUtilsInterface textUtils = t -> new StringBuilder(t).reverse().toString();
        System.out.println(textUtils.reverse("hello"));
    }

    @FunctionalInterface
    public interface TextUtilsInterface {
        String reverse(String text);
    }

}