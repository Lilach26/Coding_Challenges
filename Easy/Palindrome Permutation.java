/*
Given a string s, return true if a permutation of the string could form a palindrome.

Example 1:
Input: s = "code"
Output: false

Example 2:
Input: s = "aab"
Output: true

Example 3:
Input: s = "carerac"
Output: true
 
Constraints:
1 <= s.length <= 5000
s consists of only lowercase English letters.
*/

class Solution {
    public boolean canPermutePalindrome(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (map.containsKey(s.charAt(i)))
			{
				map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		for(char key : map.keySet())
		{
			count += map.get(key) % 2;
		}
		
		return count <= 1;    
    }
}
