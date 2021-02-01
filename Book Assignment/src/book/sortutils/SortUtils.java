package book.sortutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import assignment.book.Book;

public class SortUtils {
	class sortBYN implements Comparator<Book>{

		@Override
		public int compare(Book A, Book B) {
			// TODO Auto-generated method stub
			return A.getBookName().compareTo(B.getBookName());
		}
		
	}
	
	class sortBYP implements Comparator<Book>{

		@Override
		public int compare(Book A, Book B) {
			// TODO Auto-generated method stub
			return (int) (A.getPrice()-B.getPrice());
		}
		
	}
	
	public static void sortByName(List<Book> book)
	{	SortUtils s = new SortUtils();
		Collections.sort(book, s.new sortBYN());
	}
	
	public static void sortByPrice(List<Book> book)
	{
		SortUtils s = new SortUtils();
		Collections.sort(book, s.new sortBYP());
	}

}

