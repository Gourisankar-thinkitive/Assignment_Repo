
public class Employee {
	
	int empId;
	String empName;
	double basicSalary;
	double HRA;
	double PF;
	double PT;
	double MedicalAllowence;
	double grossSalary;
	double netSalary;
	static int count = 0;
	    
	Employee()
	{
		PT = 200;
		count++;
	}
	
	Employee(int empId, String empName, int basicSalary, int MedicalAllowence)
	{
		this();
		this.empId = count;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.HRA = basicSalary/2;
		this.PF = (basicSalary/100) * 12;
		this.MedicalAllowence = MedicalAllowence;
		
	}
	
//	public static void acces()
//	{
//		System.out.println(ob );
//		Employee x = new Employee();
//		System.out.println(x.PT);
//	}
	
	public void PrintData()
	{	
		System.out.println("Emp No : "+count);
		System.out.println("ID : "+empId);
		System.out.println("Name : "+empName);
		double gs = basicSalary+HRA+MedicalAllowence;
		System.out.println("basic Salary : "+ basicSalary);
		System.out.println("HRA : "+HRA);
		System.out.println("PF : "+PF);
		System.out.println("PT : "+PT);
		System.out.println("Mediacal Allowence : "+MedicalAllowence);
		System.out.println("Gross Salary : "+gs);
		double ns = gs-PT-PF;
		System.out.println("Net Salary : "+ ns);
	}
}
