package com.example.tictactoeweb.controller;

import com.example.tictactoeweb.model.CellWrapper;
import com.example.tictactoeweb.model.StepResponse;
import com.example.tictactoeweb.service.MoveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TicTacToeController {

    private final char player = 'X';
    private final char pc = 'O';

    private final MoveService moveService;

    @PostMapping("/player")
    public StepResponse playMove(@RequestBody CellWrapper point,
                                 @RequestHeader(value = "username", defaultValue = "anonymous") String username) {
        boolean isCorrectTurn = moveService.countPlayerChars(moveService.userBoard.get(username), player);
        if (!isCorrectTurn) {
            return new StepResponse(moveService.userBoard.get(username),
                    "Don't try to full the game...",
                    false,
                    false,
                    player,
                    point);
        }
        int row = point.getRow();
        int col = point.getCol();
        char[][] pb = moveService.userBoard.computeIfAbsent(username, k -> moveService.createNewBoard());
        moveService.playerStep(pb, row, col);
        return moveService.getStepResponse(pb, player, username, player, point);
    }

    @GetMapping("/pc")
    public StepResponse playMove(@RequestHeader(value = "username", defaultValue = "anonymous") String username) {
        boolean isCorrectTurn = moveService.countPlayerChars(moveService.userBoard.get(username), pc);
        if (!isCorrectTurn) {
            return new StepResponse(moveService.userBoard.get(username),
                    "Don't try to full the game...",
                    false,
                    false,
                    pc,
                    new CellWrapper());
        }
        char[][] pb = moveService.userBoard.computeIfAbsent(username, k -> moveService.createNewBoard());
        return moveService.getStepResponse(pb, pc, username, pc, moveService.pcStep(pb));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIllegalArgumentException(IllegalArgumentException ex) {
        return ex.getMessage();
    }
}
