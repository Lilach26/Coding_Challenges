/*
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Example 3:
Input: s = "a"
Output: "a"

Example 4:
Input: s = "ac"
Output: "a"

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case),
*/

class Solution 
{
    int resultStart = 0;
    int resultLength = 0;
    
    public String longestPalindrome(String s) 
    {
        int len = s.length();
        
        if (len < 2)
        {
            return s;
        }
        
        for (int i = 0; i < len - 1; i++)
        {
            expandRange(s, i, i);
            expandRange(s, i, i + 1);
        }
        
        return s.substring(resultStart, resultStart + resultLength);
    }
    
    public void expandRange(String s, int begin, int end)
    {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end))
        {
            begin--;
            end++;
        }
        
        if (resultLength < end - begin - 1)
        {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
