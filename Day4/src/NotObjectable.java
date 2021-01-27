
public class NotObjectable {
	
	protected NotObjectable() {
		
		System.out.println("Created");
	}
	
	public void P(){
		System.out.println("hi");
	}

}

class hi{
	
	NotObjectable n = new NotObjectable();
}

