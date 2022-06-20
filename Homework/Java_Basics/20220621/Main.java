package com.telran.berlin.practice;

public class Main {
    public static void main(String[] args) {
        char c = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        float f = 4.7333436F;
        double d = 4.355453532;
        long l = 12121L;

        System.out.println("My char is " + c);
        System.out.println("My integer is " + i);
        System.out.println("My byte is " + b);
        System.out.println("My short is " + s);
        System.out.println("My float is " + f);
        System.out.println("My double is " + d);
        System.out.println("My long is " + l);

        System.out.println("===================================");

        Cat barsik = new Cat();

        barsik.setName("Barsik");
        barsik.setAge(2);
        barsik.setBreed("Home Cat");
        barsik.setColour("dark gray");
        barsik.setWeight(4);
        barsik.setOwnersName("Roman");
        barsik.setFed(false);

        System.out.println("Cat's name is " + barsik.getName());
        System.out.println("Cat's age: " + barsik.getAge() + " years");
        System.out.println("Cat's breed is a " + barsik.getBreed());
        System.out.println("Cat's colour is " + barsik.getColour());
        System.out.println("Cat's weight is " + barsik.getWeight() + " kg");
        System.out.println("Cat owner's name is " + barsik.getOwnersName());
        System.out.println("Cat is fed? " + (barsik.isFed() ? "Yes" : "No"));
    }
}