import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    static class Orange {
        int row, col;
        Orange(int r, int c) {
            this.row = r;
            this.col = c;
        }
    }
    
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<Orange> queue = new LinkedList<>();
        int freshOranges = 0;

        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new Orange(r, c));
                } else if (grid[r][c] == 1) {
                    freshOranges++;
                }
            }
        }

        
        if (freshOranges == 0) {
            return 0;
        }

        int[] rowDirs = {-1, 1, 0, 0};
        int[] colDirs = {0, 0, -1, 1};
        int time = 0;

      
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            for (int i = 0; i < size; i++) {
                Orange orange = queue.poll();
                int row = orange.row;
                int col = orange.col;
                
                
                for (int d = 0; d < 4; d++) {
                    int newRow = row + rowDirs[d];
                    int newCol = col + colDirs[d];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;  
                        queue.add(new Orange(newRow, newCol));
                        freshOranges--;
                        rotted = true;
                    }
                }
            }

            if (rotted) {
                time++;
            }
        }

        
        return freshOranges == 0 ? time : -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {{0, 1, 2}, {0, 1, 2}, {2, 1, 1}};
        int result = sol.orangesRotting(grid);
        System.out.println(result); 
    }
}
