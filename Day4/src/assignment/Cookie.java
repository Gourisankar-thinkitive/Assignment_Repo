package assignment;

public class Cookie extends DessertItem{
	
	int units;
	double price = 10/12;
	
	@Override
	public int  cost() {
		// TODO Auto-generated method stub
		return (int)(units*price);
	}

}
