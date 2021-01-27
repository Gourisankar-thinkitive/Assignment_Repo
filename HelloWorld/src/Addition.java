
public class Addition {
	
	public int Add(int... arr)
	{
		int sum = 0;
		for(int val: arr)
		{
			sum += val;
		}
		
		return sum;
	}

}
