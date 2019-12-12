package storage;

import java.util.ArrayList;
import java.util.List;

import data.PlaceInBookStorage;

public class BookStorage implements DataStorage {
	
	public List<PlaceInBookStorage> storage = new ArrayList<>();

	@Override
	public void add(Object obj) {
		storage.add((PlaceInBookStorage) obj);
	}
	
	@Override
	public void delete(Object obj) {
		storage.remove((PlaceInBookStorage) obj);
	};
	
	public List<PlaceInBookStorage> getStorage() {
		return storage;
	}
}
