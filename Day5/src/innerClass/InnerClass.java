package innerClass;

public class InnerClass {
	
		
	public static void main(String[] args) {
		
	}
	static private int data = 0;
	
	
	static class inner{
		public inner() {
			System.out.println(data);
		}
		
		public void x()
		{
			System.out.println("hi");
		}
	}
	
	class inner2 extends inner{
		
		inner2 n = new inner2();
	}

}
