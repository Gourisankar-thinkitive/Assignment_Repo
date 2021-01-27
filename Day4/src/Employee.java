
public class Employee {
	
	int empId;
	String empName;
	
	public Employee(int i, String n) {
		
		this.empId = i;
		this.empName = n;
	}
	
	@Override
	public String toString() {
		
		return " : " + empId + " " + "Name" + " : " + empName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		
		if(this.empId == e.empId)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return this.empId;
	}
	
}
