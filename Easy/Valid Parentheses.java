/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses 
{
	public boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		char c, poped;
		
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		
		for (int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			
			if (map.containsKey(c))
			{
				poped = stack.empty() ? '!' : stack.pop();
				
				if (poped != map.get(c))
				{
					return false;
				}
			}
			
			else
			{
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
