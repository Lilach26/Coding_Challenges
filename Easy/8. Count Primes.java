/*
Count the number of prime numbers less than a non-negative number n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0

Constraints:
0 <= n <= 5 * 106
*/


public class CountPrimes 
{
	public int countPrimes(int n)
	{
		int i, count = 0;
		
		for (i = 2; i < n; i++)
		{
			if (isPrime(i))
				count++;
		}
		return count;
	}
	
	public boolean isPrime(int num)
	{
		if (num <= 1)
			return false;
		if (num <= 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i <= num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		CountPrimes sol = new CountPrimes();
		System.out.print(sol.countPrimes(11));
	}
}
