package collection;

import java.util.List;
import java.util.ArrayList;

public class MyStack<E> {
	
	List<E> l = new ArrayList<>();
	
	void push(E x)
	{
		l.add(x);
	}
	
	E pop()
	{
		if(l.size()>0)
		{
			E x = l.get(l.size()-1);
			l.remove(l.size()-1);
					
			return x;
		}
		else
		{
			System.out.println("Underflow");
			return null;
		}
	}
	
	void print()
	{
		System.out.println(l);
	}

}
