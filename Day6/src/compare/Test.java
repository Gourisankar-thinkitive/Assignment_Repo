package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
	
	public static void main(String[] args) {
		
		
		Employee e1  = new Employee(1,"Tapu", 25000);
		Address a1 = new Address("Tulasichoura","Baripada","Odisha", "757001");
		e1.address = a1;
		
		Employee e2  = new Employee(2,"Papu", 20000);
		Address a2 = new Address("Tulasichoura","Baripada","Odisha", "757001");
		e2.address = a2;
		
		Employee e3  = new Employee(3,"Gapu", 15000);
		Address a3 = new Address("Tulasichoura","Baripada","Odisha", "757001");
		e3.address = a3;
		
		Employee e4  = new Employee(4,"Sapu", 10000);
		Address a4 = new Address("Tulasichoura","Baripada","Odisha", "757001");
		e4.address = a4;
		
		
		List<Employee> l = new LinkedList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		
		EmpSalaryComparator sal = new EmpSalaryComparator();
		
		Collections.sort(l,sal);
//		Collections.reverse(l);
		
//		Iterator<Employee> itr = l.iterator();
		ListIterator<Employee> litr = l.listIterator();
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
//		System.out.println(l);
		
	}
}
