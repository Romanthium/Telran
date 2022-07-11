package com.telran.berlin.practice.homework0707;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Viktor", 21);
        Student student2= new Student("Otto", 23, "Carl-Miele-Straße 5");



        Rectangle rectangle = new Rectangle(3, 4);
        
        System.out.println("Perimeter of a rectangle is " + rectangle.perimeter());
        System.out.println("Area of a rectangle is " + rectangle.area());
    }
}
