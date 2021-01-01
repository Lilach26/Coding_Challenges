/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0

Constraints:
1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
*/

import java.util.HashMap;

public class JewelsAndStones 
{
	public int numJewelsInStones(String jewels, String stones)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i, count = 0, sizeJewels = jewels.length(), sizeStones = stones.length();
		
		for (i = 0; i < sizeStones; i++)
		{
			if (!map.containsKey(stones.charAt(i)))
				map.put(stones.charAt(i), 1);
			else
				map.replace(stones.charAt(i), map.get(stones.charAt(i)) + 1);
		}
		
		for (i = 0; i < sizeJewels; i++)
		{
			if (map.containsKey(jewels.charAt(i)))
			{
				count += map.get(jewels.charAt(i));
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		JewelsAndStones sol = new JewelsAndStones();
		System.out.print(sol.numJewelsInStones("bce", "eea"));
	}
}
