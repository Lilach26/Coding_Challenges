/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0

Example 5:
Input: nums = [1], target = 0
Output: 0
 
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/

public class SearchInsertPosition 
{
	public int searchInsert(int[] nums, int target) 
	{
		int l = 0, r = nums.length - 1;
		int m;
		while (l <= r) 
		{ 
		    m = l + (r - l) / 2; 

		    if (nums[m] == target) 
			return m; 

		    if (nums[m] < target) 
			l = m + 1; 

		    else
			r = m - 1; 
		} 
		return l;
	}
	
	public static void main(String[] args)
	{
		SearchInsertPosition sol = new SearchInsertPosition();
		int[] arr = new int[] {1,3,5,6};
		System.out.print(sol.searchInsert(arr, 6));
	}
}
