package interfec;

public class demo{
	
	
	public static void main(String[] args) {
		
		
		PerformAction add = (a,b) -> a+b;
		PerformAction sub = (a,b) -> a-b;
		PerformAction mul = (a,b) -> a*b;
		PerformAction div = (a,b) -> a/b;
		
		
		
		System.out.println(add.Action(4,5));
		System.out.println(mul.Action(4, 5));
		System.out.println(sub.Action(4, 5));
		System.out.println(div.Action(5, 4));
	}
	
	

	
	
	

}
