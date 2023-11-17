package com.google.drive;

import com.google.drive.classes.Human;

/**
 * - Числовые
 * - Символьные
 * - Логические
 * - Строковые
 * */

/*
* wlfgknefojhng oejs
* */

// kgsdnjfsknbg

public class HelloWorld {
    public static void main(String[] args) {
        // byte, short, int, long, float, double
        float a = 1.0F;
        double b = 1.0;


        // char
        char name = 'R';

        //String
        String sname = "Roma";
        String ssurname = "Kashanok";
        String fullName = sname + " " + ssurname;

        System.out.println(fullName);

        //boolean
        boolean isJavaFun = false;
        boolean isJavaEasy = false;
        boolean somethingTrue = true;
        boolean result = (2+2 == 5);

        //Если условие правдиво(true), то делаем флоу1, если ложно(false), то вдаем ошибку
        if(result){
            // flow 1
            System.out.println("Congratulations! Sanitars is going for you!");
        } else {
            // flow 2
            System.out.println("Correct! Take a pie from the shelve");
        }

    }
}