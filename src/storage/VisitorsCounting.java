package storage;

import java.util.ArrayList;
import java.util.List;

import data.RecordInVisitorCounting;

public class VisitorsCounting implements DataStorage {

	public List<RecordInVisitorCounting> accounting = new ArrayList<>();

	public void addRecord(RecordInVisitorCounting recordInVisitorCounting) {
		accounting.add(recordInVisitorCounting);
	}

	public void deleteRecord(RecordInVisitorCounting recordInVisitorCounting) {
		accounting.remove(recordInVisitorCounting);
	}
	
	public void changeRecord(RecordInVisitorCounting recordInVisitorCounting) {
		int i = accounting.indexOf(recordInVisitorCounting);
	}
	
	public List<RecordInVisitorCounting> getAccounting() {
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
