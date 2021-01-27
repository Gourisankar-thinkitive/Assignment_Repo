package multiThreading;

public class demo {
	public static void main(String[] args) {
		
		
		MyClass m1 = new MyClass(null);
//		AnotherClass a1 = new AnotherClass();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		
		
		t1.start();
		t2.start();
		
	}

}
