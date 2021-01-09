/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:
Input: "Hello"
Output: "hello"

Example 2:
Input: "here"
Output: "here"

Example 3:
Input: "LOVELY"
Output: "lovely"
*/

public class ToLowerCase 
{
	public String toLowerCase(String str)
	{
		char[] result = new char[str.length()];
		int value;
		
        for (int i=0;i<str.length();i++)
        {
            result[i] = str.charAt(i);
        }
        
        for (int i = 0; i < result.length; i++)
        {
            value = result[i];
            
            if (value >= 65 && value <= 90)
            {
                result[i] += 32;
            }
        }
        return new String(result);
	}
	
	public static void main(String[] args)
	{
		ToLowerCase sol = new ToLowerCase();
		System.out.print(sol.toLowerCase("HELLO"));
	}
}
