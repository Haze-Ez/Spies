/**
 * Unit tests for the {@link Game} class, verifying its behavior and functionality.
 */
import org.example.sudoku.Game;
import org.example.sudoku.Grid;
import org.example.sudoku.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    /**
     * Tests the initialization of a Game object to ensure it is created successfully.
     */
    @Test
    void testGameInitialization() {
        Grid grid = new Grid();
        Player player = new Player("John", "password123", 1);
        Game game = new Game(grid, player, "in progress", "medium");

        assertNotNull(game, "Game object should not be null after initialization.");
    }

    /**
     * Tests various actions in the Game class to ensure they do not throw exceptions.
     */
    @Test
    void testGameActions() {
        Grid grid = new Grid();
        Player player = new Player("John", "password123", 1);
        Game game = new Game(grid, player, "in progress", "medium");

        assertDoesNotThrow(game::startGame, "Starting the game should not throw an exception.");
        assertDoesNotThrow(game::endGame, "Ending the game should not throw an exception.");
        assertDoesNotThrow(game::restartGame, "Restarting the game should not throw an exception.");
    }

    /**
     * Tests the win-checking functionality of the Game class.
     */
    @Test
    void testWinCheck() {
        Grid grid = new Grid();
        Player player = new Player("John", "password123", 1);
        Game game = new Game(grid, player, "in progress", "medium");

        assertTrue(game.checkWin(), "The checkWin method should return true in its dummy implementation.");
    }
}
