package storage;

import java.util.ArrayList;
import java.util.List;

import data.RecordInBookCatalog;

public class BookCatalog implements DataStorage {
	
	private List<RecordInBookCatalog> accounting = new ArrayList<>();

	@Override
	public void add(Object obj) {
		accounting.add((RecordInBookCatalog) obj);
	}

	@Override
	public void delete(Object obj) {
		accounting.remove((RecordInBookCatalog) obj);
	}

	public List<RecordInBookCatalog> getAccounting() {
		return accounting;
	}

}
