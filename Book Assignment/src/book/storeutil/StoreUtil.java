package book.storeutil;
import assignment.book.Book;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil {
	
	
	static List<Book> bookRecords;
	
	public StoreUtil() {
		bookRecords = new ArrayList<Book>();
	}
	
	public void addRecocrds(Book book)
	{
		bookRecords.add(book);
	}
	
	public List<Book> getRecords()
	{
		return bookRecords;
	}
	
	public int getNumOfRecords()
	{
		return bookRecords.size();
	}
	
	

}
