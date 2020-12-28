/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/


public class AddBinary 
{
	public String addBinary(String a, String b)
	{
		StringBuilder result = new StringBuilder();
		int aSize = a.length() - 1, bSize = b.length() - 1, carry = 0, sum;
		
		while (aSize >= 0 || bSize >= 0) 
		{
			sum = carry;
			
			if (bSize >= 0)
				sum += b.charAt(bSize--) - '0';
			
			if (aSize >= 0)
				sum += a.charAt(aSize--) - '0';
			
			carry = sum / 2;
			result.append(sum % 2);
		}
		
		if (carry == 1)
			result.append(carry);
		
		return result.reverse().toString();
	}
	
	public static void main(String[] args)
	{
		AddBinary sol = new AddBinary();
		System.out.print(sol.addBinary("1010", "1011"));
	}
}
