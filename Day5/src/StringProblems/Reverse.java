package StringProblems;

public class Reverse {
	
	public static void main(String[] args) {
		String str = "Hello World";
		
		reverse(str);
	}
	
	private static void reverse(String str)
	{
		String arr[] = str.split(" ");
		
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<hi)
		{
			String temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
		
		for(String s: arr)
		{
			System.out.print(s);
			System.out.print(" ");
		}
	}

}
