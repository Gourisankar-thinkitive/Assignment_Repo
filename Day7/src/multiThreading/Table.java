package multiThreading;

public class Table {
	
	public synchronized void table(int n)
	{
		for (int i = 1; i <= 10; i++) {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + " :" + (n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
