package multiThreading;

public class Test {
	
	public static void main(String[] args) {
		
		Table p = new Table();
		MyClass m1 = new MyClass(p);
		AnotherClass m2 = new AnotherClass(p);

		m1.setName("TABLE1 ");
		m2.setName("TABLE2 ");

		m2.setPriority(10);
		m1.start();
		m2.start();
		
		
		
	}
	

}
