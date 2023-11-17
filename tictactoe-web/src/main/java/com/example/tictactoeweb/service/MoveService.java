package com.example.tictactoeweb.service;

import com.example.tictactoeweb.model.CellWrapper;
import com.example.tictactoeweb.model.StepResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MoveService {

    private final char player = 'X';
    private final char pc = 'O';
    private final char draw = 'D';
    private final char empty = ' ';

    public Map<String, char[][]> userBoard = new HashMap<>();

    public StepResponse getStepResponse(char[][] pb, char player, String username, char currentPlayer, CellWrapper cell) {
        char gameResult = checkIfFinished(pb);
        StepResponse response = new StepResponse(pb,
                gameResult == draw,
                gameResult == player,
                currentPlayer,
                cell);
        if (gameResult == draw || gameResult == player || gameResult == pc) {
            userBoard.put(username, createNewBoard());
        }
        return response;
    }

    public CellWrapper pcStep(char[][] board) {
        List<CellWrapper> availableMoves = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == empty) {
                    availableMoves.add(new CellWrapper(i, j));
                }
            }
        }
        CellWrapper almostRandomCell = availableMoves.get((int) (Math.random() * availableMoves.size()));
        // Pick a random available cell
        int row = almostRandomCell.getRow();
        int col = almostRandomCell.getCol();
        board[row][col] = pc;
        return new CellWrapper(row, col);
    }

    private char checkIfFinished(char[][] board) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
                return board[row][0];
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != ' ') {
                return board[0][col];
            }
        }

        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
            return board[1][1];
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == empty) {
                    return empty;
                }
            }
        }
        return draw;
    }

    public boolean countPlayerChars(char[][] chars, char currentPlayer) {
        return chars == null || countChars(chars, currentPlayer);
    }

    private boolean countChars(char[][] chars, char currentPlayer) {
        int numberOfChars = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (chars[i][j] == currentPlayer) {
                    numberOfChars++;
                } else if (chars[i][j] != ' ') {
                    numberOfChars--;
                }
            }
        }
        return numberOfChars < 1;
    }

    public void playerStep(char[][] board, int row, int col) {
        if (isValidMove(board, row, col) && board[row][col] == ' ') {
            board[row][col] = 'X';
        }
    }

    public boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public char[][] createNewBoard() {
        return new char[][]{
                {empty, empty, empty},
                {empty, empty, empty},
                {empty, empty, empty},
        };
    }

}
