package com.google.drive.rt;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RTExceptions {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int a = sc.nextInt();
//        int b;

//        try {
//            boolean gitConnectionReady = new InputStreamReader(new URL("https://github.com").openStream()).ready();
//            if(gitConnectionReady) {
//                //gitConnect()
//            }
//        } catch (Exception e) {
//            System.out.println("Чета пошло нитак! :(");
//        }
//

//        try {
//            System.out.println("Division result: " + a / b);
//        } catch (ArithmeticException e) {
//
//        }

        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '*';
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] != '*') {
                    board[i][j] = 'O';
                }
            }
            System.out.println();
        }

//        for (int i = 0; i < 3; i++) {
//            System.out.println("Enter a divider for the number:");
//            b = sc.nextInt();
//            try {
//                System.out.println("Result: " + a / b);
//                break;
//            } catch (ArithmeticException e) {
//                System.out.println("Division by zero is not allowed!");
//            }
//        }

    }
}
