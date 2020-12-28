/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:
Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
*/

class Solution 
{
    public int addDigits(int num) 
    {
        int result = 0;
		
	while (num > 0)
	{
		result += num % 10;
		num /= 10;
			
		if (num == 0 && result > 9)
		{
			num = result;
			result = 0;
		}
	}
	return result;    
    }
}
