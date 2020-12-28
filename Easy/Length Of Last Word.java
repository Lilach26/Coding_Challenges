/*
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5

Example 2:
Input: s = " "
Output: 0

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
*/


public class LengthOfLastWord 
{
	public int lengthOfLastWord(String s)
	{
		s = s.trim();
		int i, len = s.length();
        
		if (len == 0)
		    return 0;

		for (i = len-1; i >= 0; i--)
		{
		    if (s.charAt(i) == ' ')
			return len - i - 1;
		}

		return len;
	}
	
	public static void main(String[] args)
	{
		LengthOfLastWord sol = new LengthOfLastWord();
		String str = "a ";
		System.out.print(sol.lengthOfLastWord(str));
	}
}
