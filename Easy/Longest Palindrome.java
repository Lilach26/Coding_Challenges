/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1

Example 3:
Input: s = "bb"
Output: 2

Constraints:
1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
*/

class Solution 
{
    public int longestPalindrome(String s) 
    {
        HashMap<Character, Integer> counter = new HashMap<>();
        int maxPalindrome = 0;
        boolean oddNumber = false;
        
        for (int i = 0; i < s.length(); i++)
        {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> object : counter.entrySet())
        {
            if (object.getValue() % 2 == 0)
            {
                maxPalindrome += object.getValue();
            }
            else
            {
                if (!oddNumber)
                {
                    maxPalindrome += object.getValue();
                    oddNumber = true;
                }
                else
                {
                    maxPalindrome += object.getValue() - 1;
                }
            }
        }
        
        return maxPalindrome;
    }
}


// Another solution:

class Solution 
{
    public int longestPalindrome(String s) 
    {
        int[] counter = new int[128];
        int maxPalindrome = 0;
        
        for (char letter : s.toCharArray())
        {
            counter[letter]++;
        }
        
        for (int value : counter)
        {
            maxPalindrome += value / 2 * 2;
            
            if (maxPalindrome % 2 == 0 && value % 2 == 1)
            {
                maxPalindrome++;
            }
        }
        
        return maxPalindrome;
    }
}
