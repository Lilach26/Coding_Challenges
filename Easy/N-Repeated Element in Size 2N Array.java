/*
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
Return the element repeated N times.

Example 1:
Input: [1,2,3,3]
Output: 3

Example 2:
Input: [2,1,2,5,3,2]
Output: 2

Example 3:
Input: [5,1,5,2,5,3,5,4]
Output: 5
 
Note:
4 <= A.length <= 10000
0 <= A[i] < 10000
A.length is even
*/

import java.util.HashMap;

public class RepeatedElementSize2NArray 
{
	public int repeatedNTimes(int[] A)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int index = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			if (map.containsKey(A[i]))
			{
				index = A[i];
				break;
			}
			
			map.put(A[i], 1);
		}
		return index;
	}
	
	public static void main(String[] args)
	{
		RepeatedElementSize2NArray sol = new RepeatedElementSize2NArray();
		int[] arr = new int[] {5,1,5,2,5,3,5,4};
		System.out.print(sol.repeatedNTimes(arr));
	}
}
