package storage;

import java.util.ArrayList;
import java.util.List;

import data.RecordInBookCatalog;

public class BookCatalog implements DataStorage {
	
	private List<RecordInBookCatalog> accounting = new ArrayList<>();

	public void add(RecordInBookCatalog recordInBookCatalog) {
		accounting.add(recordInBookCatalog);
	}

	public void delete(RecordInBookCatalog recordInBookCatalog) {
		accounting.remove(recordInBookCatalog);
	}

	public List<RecordInBookCatalog> getAccounting() {
		return accounting;
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

}
