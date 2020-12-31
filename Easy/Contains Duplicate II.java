/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

import java.util.HashMap;

public class ContainsDuplicateTwo 
{
	public boolean containsNearbyDuplicate(int[] nums, int k)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i, size = nums.length;
		
		for (i = 0; i < size; i++)
		{
			if (!map.containsKey(nums[i]))
			{
				map.put(nums[i], i);
			}
			
			else
			{
				if (i - map.get(nums[i]) <= k)
				{
					return true;
				}
				else
				{
					map.replace(nums[i], i);
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		ContainsDuplicateTwo sol = new ContainsDuplicateTwo();
		int[] arr = new int[] {1,2,3,1,2,3};
		System.out.print(sol.containsNearbyDuplicate(arr, 2));
	}
}
