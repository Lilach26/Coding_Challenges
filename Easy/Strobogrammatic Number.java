/*
Given a string num which represents an integer, return true if num is a strobogrammatic number.
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Example 1:
Input: num = "69"
Output: true

Example 2:
Input: num = "88"
Output: true

Example 3:
Input: num = "962"
Output: false

Example 4:
Input: num = "1"
Output: true

Constraints:
1 <= num.length <= 50
num consists of only digits.
num does not contain any leading zeros except for zero itself.
*/

class Solution 
{
    public boolean isStrobogrammatic(String num) 
    {
        StringBuilder mirror = new StringBuilder();
        char temp;
        
        if (num.length() == 1)
        {
            temp = num.charAt(0);
            
            if (temp == '8' || temp == '1' || temp == '0')
            {
                return true;
            }
            
            return false;
        }
        
        for (int i = num.length() - 1; i >= 0; i--)
        {
            temp = num.charAt(i);
            
            if (temp == '0' || temp == '8' || temp == '1')
            {
                mirror.append(temp);
            }
            else if (temp == '6')
            {
                mirror.append('9');
            }
            else if (temp == '9')
            {
                mirror.append('6');
            }
            else
            {
                return false;
            }
        }
        
        return num.equals(mirror.toString());
    }
}
