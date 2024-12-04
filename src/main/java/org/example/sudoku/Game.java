/**
 * Represents a Sudoku game, managing the grid, player, and game state.
 */
package org.example.sudoku;

import org.example.sudoku.Player;

public class Game {
    private Grid grid;
    private Player player;
    private String status;
    private String difficulty;

    /**
     * Constructs a Game with the specified grid, player, status, and difficulty.
     *
     * @param grid the Sudoku grid
     * @param player the player associated with the game
     * @param status the current status of the game
     * @param difficulty the difficulty level of the game
     */
    public Game(Grid grid, Player player, String status, String difficulty) {
        this.grid = grid;
        this.player = player;
        this.status = status;
        this.difficulty = difficulty;
    }

    /**
     * Starts the game.
     */
    public void startGame() {
        System.out.println("Game started");
    }

    /**
     * Ends the game.
     */
    public void endGame() {
        System.out.println("Game ended");
    }

    /**
     * Restarts the game from the beginning.
     */
    public void restartGame() {
        System.out.println("Game restarted");
    }

    /**
     * Checks if the player has won the game.
     *
     * @return true if the player has won, false otherwise
     */
    public boolean checkWin() {
        return true; // Dummy implementation
    }
}
