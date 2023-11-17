package com.google.drive.classes;

public class Human {
    public static int humanCounter = 0;
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        humanCounter++;
    }

    public void walk() {
        System.out.println("I'm walking!");
        this.name = this.name + "_moonwalker";
        this.age += 1;
    }

    public void speak() {
        System.out.println("Bla Bla Bla Bla Bla Bla Bla Bla ");
    }

    public String giveAnAdvice() {
        return "Совет свой себе посоветуй!";
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age + '}';
    }
}
