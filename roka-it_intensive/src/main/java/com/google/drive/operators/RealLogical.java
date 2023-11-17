package com.google.drive.operators;

public class RealLogical {
    public static void main(String[] args) {
        // | & ^
        int a = 5;
        int b = -5;
        int c = -6;
        int c2 = -6;
        int c3 = -6;
        int c4 = -6;
        int c5 = -6;

//        if(userRegistered(username) && isPositiveBalance(username) && )

        if (a > 0 || b > 0 || c > 0 || c2 > 0 || c3 > 0 || c4 > 0 || c5 > 0) {
            System.out.println("At least one positive");
        }

        if (a > 0 && b > 0 && c > 0 && c2 > 0 && c3 > 0 && c4 > 0 && c5 > 0) {
            System.out.println("At least one positive");
        }

//
//        if (a > 0 & b > 0 & c > 0) {
//            System.out.println("All positive");
//        } else {
//            System.out.println("NOT All positive");
//        }


    }
}
