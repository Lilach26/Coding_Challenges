/*
Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0
 

Constraints:
-231 <= x <= 231 - 1
*/

public class ReverseInteger 
{
	public int reverse(int x)
	{
		int result = 0, modulu;
		
		while (x != 0)
		{
		    modulu = x % 10;

		    if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && modulu >= 8)
			return 0;
		    if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && modulu < -9)
			return 0;

		    result = (result * 10) + modulu;
		    x /= 10;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		ReverseInteger sol = new ReverseInteger();
		System.out.print(sol.reverse(0));
	}
}
