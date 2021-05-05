/*
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/


import java.util.HashSet;

public class LeetCode 
{
	public int[] intersection(int[] nums1, int[] nums2)
	{
		HashSet<Integer> numsOneSet = new HashSet<>();
		HashSet<Integer> numsTwoSet = new HashSet<>();
		
		for (Integer i : nums1)
		{
			numsOneSet.add(i);
		}
		
		for (Integer j : nums2)
		{
			numsTwoSet.add(j);
		}
		
		numsOneSet.retainAll(numsTwoSet);
		int[] intersection = new int[numsOneSet.size()];
		int i = 0;
		
		for (int j : numsOneSet)
		{
			intersection[i] = j;
			i++;
		}
		
		return intersection;
	}
}
