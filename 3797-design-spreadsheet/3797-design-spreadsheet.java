import java.util.*;

class Spreadsheet {
    private int[][] grid; // 2D array to store values
    private int rows;

    public Spreadsheet(int rows) {
        this.rows = rows;
        this.grid = new int[rows][26]; // 26 columns (A-Z)
    }
    
    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }
    
    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }
    
    public int getValue(String formula) {
        // Remove '=' and split by '+'
        formula = formula.substring(1);
        String[] parts = formula.split("\\+");

        return getCellValue(parts[0]) + getCellValue(parts[1]);
    }
    
    private int getCellValue(String s) {
        // If it is a number, parse and return it
        if (Character.isDigit(s.charAt(0))) {
            return Integer.parseInt(s);
        }
        // Otherwise, it's a cell reference
        int[] pos = parseCell(s);
        return grid[pos[0]][pos[1]];
    }

    private int[] parseCell(String cell) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1)) - 1; // Convert 1-based to 0-based index
        return new int[]{row, col - 'A'}; // Row and Column indices
    }
}
