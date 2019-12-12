package storage;

import java.util.ArrayList;
import java.util.List;

import data.PlaceInBookStorage;

public class BookStorage implements DataStorage {
	
	public List<PlaceInBookStorage> storage = new ArrayList<>();

	public void addPlace(PlaceInBookStorage placeInBookStorage) {
		storage.add(placeInBookStorage);
	}
	
	public void deletePlace(PlaceInBookStorage placeInBookStorage) {
		storage.remove(placeInBookStorage);
	};
	
	public List<PlaceInBookStorage> getStorage() {
		return storage;
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
