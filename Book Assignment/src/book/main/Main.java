package book.main;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import assignment.book.Book;
import book.printutil.PrintUtil;
import book.sortutils.SortUtils;
import book.storeutil.StoreUtil;

public class Main {
	
	public static void main(String[] args) {
		
		Set<String> authors = new HashSet<String>();
		authors.add("Ravi Sharma");
		authors.add("Albert Einstien");
		
		Book book = new Book(1234, "Elements of Physics", authors, 1889);
		Book book2 = new Book(1235, "Alphabets", authors, 8389);
		Book book3 = new Book(1236, "Directions", authors, 589);
		Book book4 = new Book(1237, "Zebralogy", authors, 789);
		Book book5 = new Book(1238, "Maths", authors, 189);
		
		StoreUtil store = new StoreUtil();
		store.addRecocrds(book);
		store.addRecocrds(book2);
		store.addRecocrds(book3);
		store.addRecocrds(book4);
		store.addRecocrds(book5);
		System.out.println(store.getNumOfRecords());
		List<Book>records = store.getRecords();
		PrintUtil.printRecords(records);
		
		
		SortUtils.sortByName(records);
		records = store.getRecords();
		PrintUtil.printRecords(records);
		
		SortUtils.sortByPrice(records);
		records = store.getRecords();
		PrintUtil.printRecords(records);
		
	}

}
