package com.telran.berlin.practice.homework0707;

public class Main {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        stringModifier(str);

    }

    public static void stringModifier(String s) {
        System.out.println("Last character: " + s.charAt(s.length() - 1));
        System.out.println(s.contains("Java") ? "String contains \"Java\"" : "String doesn't contain \"Java\"");
        System.out.println("'a' to 'o': " + s.replace('a', 'o'));
        System.out.println("To upper case: " + s.toUpperCase());
        System.out.println("To lower case: " + s.toLowerCase());
        System.out.println("Cutting \"Java\": " + s.substring(s.indexOf("Java")));
    }

}
