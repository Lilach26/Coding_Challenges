/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/

class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List result = new ArrayList<Integer>();
        
        if (matrix.length == 0)
        {
            return result;
        }
        
        int row1 = 0, row2 = matrix.length - 1;
        int col1 = 0, col2 = matrix[0].length - 1;
        
        while (row1 <= row2 && col1 <= col2)
        {
            for (int i = col1; i <= col2; i++)
            {
                result.add(matrix[row1][i]);
            }
            
            for (int j = row1 + 1; j <= row2; j++)
            {
                result.add(matrix[j][col2]);
            }
            
            if (row1 < row2 && col1 < col2)
            {
                for (int i = col2 - 1; i > col1; i--)
                {
                    result.add(matrix[row2][i]);
                }
                
                for (int j = row2; j > row1; j--)
                {
                    result.add(matrix[j][col1]);
                }
            }
            
            row1++;
            row2--;
            col1++;
            col2--;
        }
        
        return result;
    }
}
