package collection;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class demo {
	public static void main(String[] args) {
		
		List l = new LinkedList();
		
		l.add("hi");
		l.add(true);
		l.add("List");
		l.add(10);
		System.out.println(l);
		
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println(l.size());
		
	}

}
