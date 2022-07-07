package com.telran.berlin.practice.homework0707;

public class Names {
    public static void main(String[] args) {
        System.out.println("Hello <" + (char)82 + (char)111 + (char)109 + (char)97 + (char)110 + ">");

        String str = "Roman";
        firstCharInString(str);
    }

    public static void firstCharInString (String str) {
        System.out.println(str.charAt(0));
    }
}
