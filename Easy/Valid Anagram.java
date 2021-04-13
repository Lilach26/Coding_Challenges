/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
*/


public class Solution 
{
	public boolean isAnagram(String s, String t) 
	{
		int[] counter = new int[26];

		if (s.length() != t.length())
		{
			return false;
		}
		
		for (int i = 0; i < s.length(); i++)
		{
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < counter.length; i++)
		{
			if (counter[i] != 0)
			{
                		return false;
			}
		}
		
		return true;
    }
}
