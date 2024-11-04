public class RectangleCounter {

    public static int countRectangles(String[] grid) {
        int rows = grid.length;
        int cols = grid[0].length();
        int rectangleCount = 0;

        
        for (int row1 = 0; row1 < rows; row1++) {
            for (int col1 = 0; col1 < cols; col1++) {
                if (grid[row1].charAt(col1) == '+') {
                    for (int row2 = row1 + 1; row2 < rows; row2++) {
                        for (int col2 = col1 + 1; col2 < cols; col2++) {
                            if (grid[row2].charAt(col2) == '+' && isRectangle(grid, row1, col1, row2, col2)) {
                                rectangleCount++;
                            }
                        }
                    }
                }
            }
        }
        return rectangleCount;
    }

    private static boolean isRectangle(String[] grid, int row1, int col1, int row2, int col2) {
        
        for (int col = col1 + 1; col < col2; col++) {
            if (grid[row1].charAt(col) != '-' && grid[row1].charAt(col) != '+') return false;
            if (grid[row2].charAt(col) != '-' && grid[row2].charAt(col) != '+') return false;
        }

        
        for (int row = row1 + 1; row < row2; row++) {
            if (grid[row].charAt(col1) != '|' && grid[row].charAt(col1) != '+') return false;
            if (grid[row].charAt(col2) != '|' && grid[row].charAt(col2) != '+') return false;
        }

        return true;
    }

}
