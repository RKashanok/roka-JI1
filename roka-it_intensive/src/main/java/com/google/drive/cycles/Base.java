package com.google.drive.cycles;

import jdk.jfr.consumer.RecordedThread;

import java.util.Scanner;

public class Base {

    public static void main(String[] args) throws InterruptedException {

//        int i =10;
//        for (/*counter*/; i >0 ;/*increment*/) {
//            System.out.println("hello Java!" + i);
//            i--;
//        }

        Scanner sc = new Scanner(System.in);

        boolean interrupt = false;
        while(!interrupt) {
            System.out.println("hello Java!");
            Thread.sleep(1000);
            System.out.println("Want to interrupt? Y / N");
            String wantToInterrupt = sc.next();
            if(wantToInterrupt.equalsIgnoreCase("y")) {
                interrupt = true;
            }
        }


    }

}
