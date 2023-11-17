package com.google.drive.classes;

import com.google.drive.classes.points.Point;

import java.lang.Math;
import java.util.Random;

import static java.lang.Math.PI;
import static com.google.drive.classes.points.Point.CS;

public class Clazz {
    public static void main(String [] args) throws InterruptedException {

//        System.out.println(PI);
//        System.out.println(CS);

//        Random rand = new Random();

//        for (int i = 0; i < 5 + rand.nextInt(10); i++) {
//            Human h = new Human("Roma_" + i, 10 + rand.nextInt(30));
//        }
//
//        System.out.println("Всего было создано человеков: " + Human.humanCounter);

        Human h1 = new Human("Roma", 38);
        Thread.sleep(3000);
        h1.age = 39;
        h1.walk();
        h1.speak();

        String advice = h1.giveAnAdvice();
        System.out.println(advice);

    }
}
