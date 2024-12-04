package org.example.sudoku;
/**
 * Represents a player in the Sudoku game with functionality to manage games and login.
 */
public class Player {
    private String name;
    private String password;
    private int rank;

    /**
     * Constructs a Player with the specified name, password, and rank.
     *
     * @param name the name of the player
     * @param password the password of the player
     * @param rank the rank of the player
     */
    public Player(String name, String password, int rank) {
        this.name = name;
        this.password = password;
        this.rank = rank;
    }

    /**
     * Simulates the login process for the player.
     *
     * @return true if login is successful, false otherwise
     */
    public boolean login() {
        return true; // Dummy implementation
    }

    /**
     * Creates a new game for the player.
     */
    public void createNewGame() {
        System.out.println("New game created");
    }

    /**
     * Restores a previously saved game for the player.
     */
    public void restoreGame() {
        System.out.println("Game restored");
    }

    /**
     * Saves the current game for the player.
     */
    public void saveGame() {
        System.out.println("Game saved");
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getRank() {
        return rank;
    }
}

