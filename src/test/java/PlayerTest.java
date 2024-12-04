/**
 * Unit tests for the {@link Player} class, ensuring its methods and behaviors function as expected.
 */
import org.example.sudoku.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    /**
     * Tests the initialization of a Player object to ensure its attributes are set correctly.
     */
    @Test
    void testPlayerInitialization() {
        Player player = new Player("John", "password123", 1);
        assertEquals("John", player.getName(), "Player name should be set correctly.");
        assertEquals(1, player.getRank(), "Player rank should be set correctly.");
    }

    /**
     * Tests the login functionality of the Player class.
     */
    @Test
    void testLogin() {
        Player player = new Player("John", "password123", 1);
        assertTrue(player.login(), "Login method should return true for the dummy implementation.");
    }

    /**
     * Tests the methods related to game management to ensure they execute without throwing exceptions.
     */
    @Test
    void testGameMethods() {
        Player player = new Player("John", "password123", 1);
        assertDoesNotThrow(player::createNewGame, "Creating a new game should not throw an exception.");
        assertDoesNotThrow(player::restoreGame, "Restoring a game should not throw an exception.");
        assertDoesNotThrow(player::saveGame, "Saving a game should not throw an exception.");
    }
}
