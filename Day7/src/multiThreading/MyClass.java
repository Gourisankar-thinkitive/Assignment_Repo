package multiThreading;

public class MyClass extends Thread {
	
	Table t;
	
	public MyClass(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.table(9);
	}
}
