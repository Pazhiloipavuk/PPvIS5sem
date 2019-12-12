package main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import storage.BookCatalog;
import storage.BookStorage;
import storage.VisitorsCounting;
import storage.VisitorsProfile;
import ui.ExtendedInterface;
import ui.UserInterface;

public class Library {

	public static void main(String[] args) {
		new Library().start();
		
	}

	public void start() {		
		UserInterface userInterface = new UserInterface();
		BookStorage bookStorage = new BookStorage();
		VisitorsProfile visitorsProfile = new VisitorsProfile();
		VisitorsCounting visitorsCounting = new VisitorsCounting();
		BookCatalog bookCatalog = new BookCatalog();
		ExtendedInterface extendedInterface = new ExtendedInterface();
	}
}
