package storage;

import java.util.ArrayList;
import java.util.List;

import data.Visitor;

public class VisitorsProfile implements DataStorage {

	public List<Visitor> accounting = new ArrayList<>();
	
	public void addVisitor(Visitor visitor) {
		accounting.add(visitor);
	}

	public void deleteVisitor(Visitor visitor) {
		accounting.remove(visitor);
	}
	
	public void change(Visitor visitor) {
		int i = accounting.indexOf(visitor);
	}

	public List<Visitor> getAccounting() {
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
