package compare;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getEmpSalary()>e2.getEmpSalary())
		{
			return 1;
		}
		else if(e1.getEmpSalary()<e2.getEmpSalary())
		{
			return -1;
		}
		
		return 0;
	}
	
	

}
