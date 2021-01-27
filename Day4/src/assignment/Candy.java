package assignment;

public class Candy extends DessertItem {
	
	int weights;
	double price = 0.05;
	
	@Override
	public int cost() {
		
		int value = (int)price*weights;
		return value;
	}
	

}
