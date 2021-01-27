package StringProblems;

public class EachFirstCapital {
	public static void main(String[] args) {
		
		String str = "hi hello how are you";
		FirstCap(str);
		
	}
	
	private static void FirstCap(String str)
	{
		String arr[] = str.split(" ");
		
		for(int i = 0; i<arr.length; i++)
		{
			String temp = arr[i].charAt(0)+"";
			temp = temp.toUpperCase()+arr[i].substring(1);
			arr[i] = temp;
		}
		
		for(String s: arr)
		{
			System.out.print(s);
			System.out.print(" ");
		}
	}

}
