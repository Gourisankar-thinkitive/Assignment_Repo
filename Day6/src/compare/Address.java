package compare;

public class Address {
	
	
	String Area;
	String Town;
	String State;
	String pin;
	public Address(String area, String town, String state, String pin) {
		super();
		Area = area;
		Town = town;
		State = state;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return  Area + "," + Town + "," + State + "," + pin;
	}
	
	

}
