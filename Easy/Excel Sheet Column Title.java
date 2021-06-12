/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"

Example 4:
Input: columnNumber = 2147483647
Output: "FXSHRXW"

Constraints:
1 <= columnNumber <= 231 - 1
*/

class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder result = new StringBuilder();
        int reminder;
        
        while (columnNumber > 0)
        {
            reminder = columnNumber % 26;
            
            if (reminder == 0)
            {
                result.append('Z');
                columnNumber = (columnNumber / 26) - 1;
            }
            else
            {
                result.append((char)('A' + reminder - 1));
                columnNumber /= 26;
            }
        }
        
        return result.reverse().toString();
    }
}
