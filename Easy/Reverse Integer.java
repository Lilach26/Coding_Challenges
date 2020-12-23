
public class ReverseInteger 
{
	public int reverse(int x)
	{
		int result = 0, modulu;
		
		while (x != 0)
		{
            modulu = x % 10;
            
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && modulu >= 8)
                return 0;
            if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && modulu < -9)
                return 0;
            
            result = (result * 10) + modulu;
			x /= 10;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		ReverseInteger sol = new ReverseInteger();
		System.out.print(sol.reverse(0));
	}
}
