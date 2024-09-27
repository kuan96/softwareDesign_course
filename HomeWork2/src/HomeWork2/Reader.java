package HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Reader {
	private String name;
	private String readerID;
	private String registrationDate;
	private String contactPhone;
	
	public Reader() {}
	
	private List<Borrowing_Record> records = new ArrayList<>();
	private List<Book> books = new ArrayList<>();
    
    void addRecord(Borrowing_Record record) {
    	records.add(record);
    }
    
    void addBook(Book book) {
    	books.add(book);
    }
}
