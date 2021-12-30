/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0

Example 3:
Input: grid = [[1,-1],[-1,-1]]
Output: 3

Example 4:
Input: grid = [[-1]]
Output: 1

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int result = 0, last = grid.length - 1;
        
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] < 0) {
                result += cols;
                continue;
            }
            
            if (grid[i][cols - 1] > 0) {
                continue;
            }
            
            int left = 0, right = cols - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (grid[i][mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            result += cols - left;
            last = left;
        }
        
        return result;
    }
}
