package multiThreading;

public class RClass  implements Runnable{
	
	@Override
	public void run() {
		
		for(char c = 'A'; c<='Z'; c++)
		{	
			System.out.println(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
