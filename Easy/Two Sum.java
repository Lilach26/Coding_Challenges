/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum 
{
	public int[] twoSum(int[] nums, int target) 
	{
        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
        int temp;
        
        for (int i = 0; i < nums.length; i++)
        	store.put(nums[i], i);
        
        for (int i = 0; i < nums.length; i++)
        {
        	temp = target - nums[i];
        	if (store.containsKey(temp) && store.get(temp) != i)
        		return new int[] {i, store.get(temp)};
        }
        throw new IllegalArgumentException("No such solution!");
    }
	
	public static void main(String[] args)
	{
		int[] array = new int[] {2, 7, 11, 5};
		TwoSum sol = new TwoSum();
		System.out.print(sol.twoSum(array, 9));
	}
}
