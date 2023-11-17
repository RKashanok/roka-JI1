package com.google.drive.operators;

public class Logical {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;

        if(a == c) {
            System.out.println("a == c");
        } else if (a == 5) {
            System.out.println("a == 5");
        } else if (a > c) {
            System.out.println("a > c");
        } else {
            System.out.println("a < c");
        }

        switch (a) {
            case 5 -> printAllIfAEqFive();
            case 6 -> System.out.println("a is 6");
            case 7 -> System.out.println("a is 7");
            default -> System.out.println("a is not 5, 6 or 7");
        }

    }

    private static void printAllIfAEqFive() {
        System.out.println("a is 5");
        System.out.println("a is 6");
    }
}
