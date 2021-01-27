package StringProblems;

public class ReverseEveryWord {
	public static void main(String[] args) {
		
		String str = "Hello how are you";
		
		reverseEveryWord(str);
	}
	
	private static void reverseEveryWord(String str)
	{
		String arr[] = str.split(" ");
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = reverse(arr[i]);
		}
		
		
		for(String s: arr)
		{
			System.out.print(s);
			System.out.print(" ");
		}
	}
	
	private static String reverse(String s)
	{
		int l = 0;
		int r = s.length()-1;
		
		Character arr[] = new Character[r+1];
		for(int i = 0; i<=r; i++)
		{
			arr[i] = s.charAt(i);
		}
		
		while(l<r)
		{
			char temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
			
		}
		
		String ans = "";
		for(char c: arr)
		{
			ans += c+"";
		}
		
		return ans;
	}

}
