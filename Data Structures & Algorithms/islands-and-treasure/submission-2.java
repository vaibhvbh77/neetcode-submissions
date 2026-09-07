class Solution {
    public void islandsAndTreasure(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();

        // Put all treasures into queue
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 0) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int count = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            // Process current level
            for (int i = 0; i < size; i++) {

                int[] cell = q.poll();

                int row = cell[0];
                int col = cell[1];

                // UP
                if (row - 1 >= 0 &&
                    grid[row - 1][col] == Integer.MAX_VALUE) {

                    grid[row - 1][col] = count + 1;
                    q.offer(new int[]{row - 1, col});
                }

                // DOWN
                if (row + 1 < grid.length &&
                    grid[row + 1][col] == Integer.MAX_VALUE) {

                    grid[row + 1][col] = count + 1;
                    q.offer(new int[]{row + 1, col});
                }

                // LEFT
                if (col - 1 >= 0 &&
                    grid[row][col - 1] == Integer.MAX_VALUE) {

                    grid[row][col - 1] = count + 1;
                    q.offer(new int[]{row, col - 1});
                }

                // RIGHT
                if (col + 1 < grid[0].length &&
                    grid[row][col + 1] == Integer.MAX_VALUE) {

                    grid[row][col + 1] = count + 1;
                    q.offer(new int[]{row, col + 1});
                }
            }

            count++;
        }
    }
}