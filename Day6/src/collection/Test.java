package collection;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		MyStack<Integer> st = new MyStack<>();
		
		st.push(18);
		st.push(34);
		
		
		st.print();
		st.pop();
		st.print();
		
	}

}
