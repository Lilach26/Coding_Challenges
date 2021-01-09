/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 
Constraints:
1 <= n <= 10^5
*/

public class SubtractProductSumDigitsInteger 
{
	public int subtractProductAndSum(int n)
	{
		int sumProduct = 1, sumSum = 0;
		
		while (n > 0)
		{
			sumProduct *= n % 10;
			sumSum += n % 10;
			n /= 10;
		}
		
		return (sumProduct - sumSum);
	}
	
	public static void main(String[] args)
	{
		SubtractProductSumDigitsInteger sol = new SubtractProductSumDigitsInteger();
		System.out.print(sol.subtractProductAndSum(4421));
	}
}
