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
