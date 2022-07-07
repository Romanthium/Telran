package com.telran.berlin.practice.homework0707;

import java.util.Scanner;

public class Squirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cones did the squirrel gather in the forest?: ");
        int cones = scanner.nextInt();
        System.out.print("How many nuts are in one cone?: ");
        int nuts = scanner.nextInt();
        System.out.print("How many nuts does a squirrel need for food in winter?: ");
        int winter = scanner.nextInt();

        System.out.println((cones*nuts) < winter ? "NO" : "YES");

        scanner.close();
    }
}
