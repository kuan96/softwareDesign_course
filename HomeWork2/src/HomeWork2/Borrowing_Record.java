package HomeWork2;

import java.util.ArrayList;
import java.util.List;


public class Borrowing_Record {
    private String borrowDate;
    private String returnDate;
    private Book book;
    private Reader reader;
    
    public Borrowing_Record() {};

    public void addRecord() {
    	this.book.addRecord(this);
    	this.reader.addRecord(this);
    	this.reader.addBook(this.book);
    }
}
