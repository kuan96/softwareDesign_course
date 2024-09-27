package HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private int publicationYear;
    private int availableQuantity;
    
    private List<Borrowing_Record> records = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    
    void addRecord(Borrowing_Record record) {
    	records.add(record);
    }
    
    public Book() {}
}
