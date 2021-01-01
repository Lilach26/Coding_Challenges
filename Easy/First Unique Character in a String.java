/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:
s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

Note: You may assume the string contains only lowercase English letters.
*/

import java.util.HashMap;

public class FirstUniqueCharacterString 
{
	public int firstUniqChar(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i, size = s.length();
		
		for (i = 0; i < size; i++)
		{
			if (!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 1);
			else
				map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
		
		for (i = 0; i < size; i++)
		{
			if (map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		FirstUniqueCharacterString sol = new FirstUniqueCharacterString();
		System.out.print(sol.firstUniqChar("loveleetcode"));
	}
}
