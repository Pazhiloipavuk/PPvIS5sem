package storage;

import java.util.ArrayList;
import java.util.List;

import data.RecordInVisitorCounting;

public class VisitorsCounting implements DataStorage {

	public List<RecordInVisitorCounting> accounting = new ArrayList<>();

	@Override
	public void add(Object obj) {
		accounting.add((RecordInVisitorCounting) obj);
	}

	@Override
	public void delete(Object obj) {
		accounting.remove((RecordInVisitorCounting) obj);
	}
	
	public void change(Object obj) {
		int i = accounting.indexOf((RecordInVisitorCounting) obj);
	}
	
	public List<RecordInVisitorCounting> getAccounting() {
		return accounting;
	}

}
