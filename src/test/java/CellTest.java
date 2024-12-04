/**
 * Unit tests for the {@link Cell} class, ensuring its methods and behaviors function as expected.
 */
import org.example.sudoku.Cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    /**
     * Tests the initialization of a Cell object to ensure its attributes are set correctly.
     */
    @Test
    void testCellInitialization() {
        Cell cell = new Cell(5, true);
        assertEquals(5, cell.getValue(), "Cell value should be set correctly during initialization.");
        assertTrue(cell.isFixed(), "Cell fixed status should be set correctly during initialization.");
    }

    /**
     * Tests the updateValue method to ensure the cell's value can be updated correctly.
     */
    @Test
    void testUpdateValue() {
        Cell cell = new Cell(0, false); // Create a non-fixed cell
        cell.updateValue(8);           // Update value
        assertEquals(8, cell.getValue(), "Cell value should be updated correctly.");
    }

    /**
     * Tests the clearValue method to ensure the cell's value is reset to zero.
     */
    @Test
    void testClearValue() {
        Cell cell = new Cell(9, false); // Create a non-fixed cell
        cell.clearValue();              // Clear the value
        assertEquals(0, cell.getValue(), "Cell value should be cleared to 0.");
    }

    /**
     * Tests the fixed status of a cell to ensure it is correctly identified as fixed.
     */
    @Test
    void testFixedCell() {
        Cell cell = new Cell(7, true); // Create a fixed cell
        assertTrue(cell.isFixed(), "Cell should be marked as fixed.");
    }
}
