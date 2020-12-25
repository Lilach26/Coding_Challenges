import java.util.HashMap;

public class SingleNumber 
{
	public int singleNumber(int[] nums)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i, size = nums.length, number = 0;
		
		for (i = 0; i < size; i++)
		{
			if (map.containsKey(nums[i]))
				map.replace(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}
		
		for (i = 0; i < size; i++)
		{
			if (map.get(nums[i]) == 1)
			{
				number = nums[i];
				break;
			}
		}
		return number;
	}
	
	public static void main(String[] args)
	{
		SingleNumber sol = new SingleNumber();
		int[] arr = new int[] {2, 2, 1, 1};
		System.out.print(sol.singleNumber(arr));
	}
}
