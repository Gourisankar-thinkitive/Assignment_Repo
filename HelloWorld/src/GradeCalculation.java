
public class GradeCalculation {
	
	public static void main(String arg[]) {
			
		int[] arr = {6,5,1,7,9,12,54,67};
		
		for(int data: arr)
		{
			boolean p = checkPrime(data);
			if(p)
				System.out.println(data);
		}
		
		int arr2[] = {67,5,1,7,9,12,5,6};
		
		System.out.println(checkSame(arr,arr2)?"Same":"Not Same");
		
	}
	
	static boolean checkSame(int[] arr1, int arr2[])
	{
		int count = 0;
		for(int data: arr1)
		{
			for(int d: arr2)
			{
				if(d == data) 
				{
					count++;
					break;
				}
			}
		}
		
		if(count == arr1.length)
			return true;
		
		
		return false;
	}
	
	
	static boolean checkPrime(int n)
	{
		if(n == 0 || n == 1)
		{
			return false;
		}
		
		if(n == 2 || n == 3)
			return true;
			
		
		for(int i = 2; i<n; i++)
		{
			if(n%i == 0) return false;
		}
		
		return true;
	}

}
