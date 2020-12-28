/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:
Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
*/

public class AddDigits 
{
	public int addDigits(int num)
	{
		int result = 0;
		
		while (num > 9)
		{
			result += num % 10;
			num /= 10;
			
			if (num == 0 && result > 9)
			{
				num = result;
				result = 0;
			}
		}
		return num;
	}
	
	public static void main(String[] args)
	{
		AddDigits sol = new AddDigits();
		System.out.print(sol.addDigits(38));
	}
}
