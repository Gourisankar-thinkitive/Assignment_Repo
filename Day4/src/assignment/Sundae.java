package assignment;

public class Sundae extends IceCream {
	
	double costOfIceCream;
	double costofTopping;
	
	public int cost()
	{
		return (int)(costOfIceCream + costofTopping);
	}

}
