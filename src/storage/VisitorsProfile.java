package storage;

import java.util.ArrayList;
import java.util.List;

import data.Visitor;

public class VisitorsProfile implements DataStorage {

	public List<Visitor> accounting = new ArrayList<>();
	@Override
	public void add(Object obj) {
		accounting.add((Visitor) obj);
	}

	@Override
	public void delete(Object obj) {
		accounting.remove((Visitor) obj);
	}
	
	public void change(Object obj) {
		int i = accounting.indexOf((Visitor) obj);
	}

	public List<Visitor> getAccounting() {
		return accounting;
	}
}
