package StringProblems;

public class FirstLettercapital {
	
	
	public static void main(String[] args) {
		
		String str = "Hello world";
		makeFirstCap(str);
	}
	
	private static void makeFirstCap(String str)
	{
		
		String first = ""+str.charAt(0);
		first = first.toUpperCase();
		String ans = first+""+str.substring(1);
		
		System.out.println(ans);
	}

}
