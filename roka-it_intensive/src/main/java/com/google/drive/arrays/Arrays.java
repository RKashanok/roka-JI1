package com.google.drive.arrays;

public class Arrays {
    static int b;

    public static void main(String[] args) {
        int[]mathMarks = new int[5];
        int length = mathMarks.length;

        for (int i = 0; i < mathMarks.length; i++) {
            System.out.println(mathMarks[i]);
            mathMarks[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < mathMarks.length; i++) {
            System.out.println(mathMarks[i]);
        }


        char[][] arr = new char[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
