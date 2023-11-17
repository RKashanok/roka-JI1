package com.example.tictactoeweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StepResponse {
    char[][] board;
    String error = null;
    boolean isDraw;
    boolean isWinner;
    char currentPlayer;
    CellWrapper currentPoint;

    public StepResponse(char[][] board, boolean isDraw, boolean isWinner, char currentPlayer, CellWrapper currentPoint){
        this.board = board;
        this.isDraw = isDraw;
        this.isWinner = isWinner;
        this.currentPlayer = currentPlayer;
        this.currentPoint = currentPoint;
    }
}
