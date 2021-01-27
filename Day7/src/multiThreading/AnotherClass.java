package multiThreading;

public class AnotherClass extends Thread{
	
	Table t;
	
	public AnotherClass(Table t) {
		
		this.t = t;
	}
	@Override
	public void run() {
		
		t.table(10);
	}

}
