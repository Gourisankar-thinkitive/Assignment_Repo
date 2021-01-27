package collection;

public class Employee {
	
	private int empid;
	private String ename;
	private double empSalary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid,String ename, double empSalary) {
		super();
		this.ename = ename;
		this.empid = empid;
		this.empSalary = empSalary;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "[ename=" + ename + ", empid=" + empid + ", empSalary=" + empSalary + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	
	

}
