package org.example.sudoku;
/**
 * Represents a single cell in the Sudoku grid, with a value and a fixed status.
 */
public class Cell {

    private int value;
    private boolean isFixed;

    /**
     * Constructs a Cell with the specified value and fixed status.
     *
     * @param value the initial value of the cell
     * @param isFixed whether the cell's value is fixed
     */
    public Cell(int value, boolean isFixed) {
        this.value = value;
        this.isFixed = isFixed;
    }

    /**
     * Updates the value of the cell.
     *
     * @param value the new value to set
     */
    public void updateValue(int value) {
        this.value = value;
        System.out.println("Value updated to: " + value);
    }

    /**
     * Clears the value of the cell, setting it to zero.
     */
    public void clearValue() {
        this.value = 0;
        System.out.println("Value cleared");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  /**
     * Checks if the cell's value is fixed.
     *
     * @return true if the cell is fixed, false otherwise
     */
    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }
}

