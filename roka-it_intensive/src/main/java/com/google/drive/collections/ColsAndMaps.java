package com.google.drive.collections;

import com.google.drive.classes.points.Point;

import java.util.*;

public class ColsAndMaps {

    public static Random rand = new Random();

    public static void main(String[] args) {

        //key -> value
        //user as a key
        String username;
        Map<String, char[][]> userMaps;
        boolean isGameFinished = false;
        Scanner sc = new Scanner(System.in);


        char[][] userBoard = new char[3][3];
        char user = 'X';

        fillTheBoard(userBoard);

        while (!isGameFinished) {
            printTheBoard(userBoard);
            System.out.println("Enter row: ");
            int x = sc.nextInt(); // нужна проверка на валидность введенного значения
            System.out.println("Enter column: ");
            int y = sc.nextInt(); // нужна проверка на валидность введенного значения
            Point p = new Point(x, y);
//            if(checkPointNotOccupied(p, userBoard)) {...}

            makeStep(p, userBoard);
//            checkIsGameFinished(userBoard);
            makePCStep(userBoard);
//            checkIsGameFinished(userBoard);

        }
    }

    private static void makePCStep(char[][] userBoard) {
        // is '_' and not 'X'
        List<Point>freePoints = new ArrayList<>();
        for (int i = 0; i < userBoard.length; i++) {
            for (int j = 0; j < userBoard[i].length; j++) {
                if(userBoard[i][j] == '_') {
                    Point p = new Point(i, j);
                    freePoints.add(p);
                }
            }
        }
        Point randomPoint = freePoints.get(rand.nextInt(freePoints.size()));
        userBoard[randomPoint.x][randomPoint.y] = 'O';
    }

    private static void makeStep(Point p, char[][] userBoard) {
        userBoard[p.x][p.y] = 'X';
    }

    private static void printTheBoard(char[][] userBoard) {
        for (int i = 0; i < userBoard.length; i++) {
            for (int j = 0; j < userBoard[i].length; j++) {
                System.out.print(userBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheBoard(char[][] userBoard) {
        for (int i = 0; i < userBoard.length; i++) {
            for (int j = 0; j < userBoard[i].length; j++) {
                userBoard[i][j] = '_';
            }
        }
    }

}
