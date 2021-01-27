package strings;

public class testing {
	
	public static void main(String[] args) {
		
		
		StringBuffer sbuf = new StringBuffer("hi");
		
		sbuf.append(" hello");
		
		System.out.println(sbuf);
		
		
		StringBuilder sb = new StringBuilder("ok");
		
		sb.append(" bye");
		System.out.println(sb);
	}

}
