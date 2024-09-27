package HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<>();
	private List<Reader> readers = new ArrayList<>();
	private List<Borrowing_Record> records = new ArrayList<>();
	
	public Library() {}
	
	public void addBook(Book book) 
	{
		books.add(book);
	}
	
	public void addReader(Reader reader) 
	{
		readers.add(reader);
	}
	
	public void addRecord(Borrowing_Record record)
	{
		records.add(record);
	}
	
	public void print_Info()
	{
		
	}
	    
}
