
public class Test {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Tapu");
		Employee e2 = new Employee(1,"Tapu");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
	}
}
