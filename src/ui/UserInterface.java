package ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import storage.BookCatalog;
import storage.BookStorage;
import storage.VisitorsProfile;

public class UserInterface {
	
	private Display display = new Display();
	private Shell shell = new Shell(this.display, SWT.MAX | SWT.TITLE | SWT.CLOSE | SWT.SHELL_TRIM);
	Button take;
	Button add;
	Button returnBook;
	Button deleteBook;
	Label labelMain;
	
	public UserInterface() {
		shell.setBounds(500, 100, 400, 350);
		shell.open();		
		labelMain = new Label (shell, SWT.NONE);
		labelMain.setText("Добро пожаловать");
		labelMain.setBounds(145, 75, 250, 20);		
		Button library = new Button (shell, SWT.PUSH);
		library.setText("Посетить библиотеку");
		library.setBounds(125, 193, 150, 28);
		library.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				labelMain.setText("Домашняя библиотека");
				labelMain.setBounds(135, 25, 250, 20);
				library.dispose();
				takeBook();
				returnBook();
				deleteBook = new Button (shell, SWT.PUSH);
				deleteBook.setText("Удалить книгу");
				deleteBook.setBounds(215, 183, 150, 28);				
				add = new Button (shell, SWT.PUSH);
				add.setText("Добавить книгу");
				add.setBounds(15, 183, 150, 28);
				add.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent arg0) {
						take.setVisible(false);
						add.setVisible(false);
						returnBook.setVisible(false);
						deleteBook.setVisible(false);
						labelMain.setText("Добавить книгу");
						Label title = new Label (shell, SWT.NONE);
						title.setText("Название");
						title.setBounds(15, 75, 150, 20);		
						Text titleT = new Text (shell, SWT.NONE);
						titleT.setBounds(195, 75, 150, 20);		
						Label author = new Label (shell, SWT.NONE);
						author.setText("Автор");
						author.setBounds(15, 115, 150, 20);		
						Text authorT = new Text (shell, SWT.NONE);
						authorT.setBounds(195, 115, 150, 20);		
						Label year = new Label (shell, SWT.NONE);
						year.setText("Год издания");
						year.setBounds(15, 155, 150, 20);		
						Text yearT = new Text (shell, SWT.NONE);
						yearT.setBounds(195, 155, 150, 20);
						Label publisher = new Label (shell, SWT.NONE);
						publisher.setText("Издатель");
						publisher.setBounds(15, 195, 150, 20);		
						Text publisherT = new Text (shell, SWT.NONE);
						publisherT.setBounds(195, 195, 150, 20);
						Label surnameM = new Label (shell, SWT.NONE);
						surnameM.setText("Фамилия владельца");
						surnameM.setBounds(15, 235, 150, 20);		
						Text surnameMT = new Text (shell, SWT.NONE);
						surnameMT.setBounds(195, 235, 150, 20);
						ExtendedInterface extendedInterface = new ExtendedInterface();
						Button create = new Button (shell, SWT.PUSH);
						create.setText("Добавить");
						create.setBounds(115, 273, 150, 28);
						create.addSelectionListener(new SelectionAdapter() {
							public void widgetSelected(SelectionEvent arg0) {				
								String titleS = titleT.getText();
								String authorS = authorT.getText();
								String yearS = yearT.getText();
								String publisherS = publisherT.getText();	
								String surnameMS = surnameMT.getText();
								create.dispose();
								title.dispose();
								titleT.dispose();
								author.dispose();
								authorT.dispose();
								year.dispose();
								yearT.dispose();
								publisher.dispose();
								publisherT.dispose();
								year.dispose();
								yearT.dispose();
								surnameM.dispose();
								surnameMT.dispose();
								extendedInterface.addBookInCatalog();
								extendedInterface.addBookInStorage();
								take.setVisible(true);
								add.setVisible(true);
								returnBook.setVisible(true);
								deleteBook.setVisible(true);
								labelMain.setText("Домашняя библиотека");
							}
						});
					}
				});
				deleteBook.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent arg0) {
						take.setVisible(false);
						add.setVisible(false);
						returnBook.setVisible(false);
						deleteBook.setVisible(false);
						labelMain.setText("Удалить книгу");
						Label title = new Label (shell, SWT.NONE);
						title.setText("Название");
						title.setBounds(15, 115, 150, 20);		
						Text titleT = new Text (shell, SWT.NONE);
						titleT.setBounds(195, 115, 150, 20);		
						Label surnameM = new Label (shell, SWT.NONE);
						surnameM.setText("Фамилия владельца");
						surnameM.setBounds(15, 165, 150, 20);		
						Text surnameMT = new Text (shell, SWT.NONE);
						surnameMT.setBounds(195, 165, 150, 20);
						ExtendedInterface extendedInterface = new ExtendedInterface();
						Button create = new Button (shell, SWT.PUSH);
						create.setText("Удалить");
						create.setBounds(115, 273, 150, 28);
						create.addSelectionListener(new SelectionAdapter() {
							public void widgetSelected(SelectionEvent arg0) {				
								String titleS = titleT.getText();	
								String surnameMS = surnameMT.getText();
								create.dispose();
								title.dispose();
								titleT.dispose();
								surnameM.dispose();
								surnameMT.dispose();
								extendedInterface.deleteBook();
								extendedInterface.deleteRecordAboutBook();
								extendedInterface.deleteBookFromVisitorsProfile();
								take.setVisible(true);
								add.setVisible(true);
								returnBook.setVisible(true);
								deleteBook.setVisible(true);
								labelMain.setText("Домашняя библиотека");
							}
						});						
					}
				});	
			}
		});
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	
	public void createProfile() {
		take.setVisible(false);
		add.setVisible(false);
		returnBook.setVisible(false);
		deleteBook.setVisible(false);
		labelMain.setText("Создать профиль");
		labelMain.setBounds(135, 25, 250, 20);		
		Label name = new Label (shell, SWT.NONE);
		name.setText("Имя");
		name.setBounds(15, 105, 150, 20);		
		Text nameT = new Text (shell, SWT.NONE);
		nameT.setBounds(195, 105, 150, 20);		
		Label surname = new Label (shell, SWT.NONE);
		surname.setText("Фамилия");
		surname.setBounds(15, 165, 150, 20);		
		Text surnameT = new Text (shell, SWT.NONE);
		surnameT.setBounds(195, 165, 150, 20);		
		Label status = new Label (shell, SWT.NONE);
		status.setText("Статус");
		status.setBounds(15, 225, 150, 20);		
		Text statusT = new Text (shell, SWT.NONE);
		statusT.setBounds(195, 225, 150, 20);
		Button create = new Button (shell, SWT.PUSH);
		create.setText("Создать");
		create.setBounds(125, 263, 150, 28);
		create.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {				
				String nameS = nameT.getText();
				String surnameS = surnameT.getText();			
				create.dispose();
				name.dispose();
				nameT.dispose();
				surname.dispose();
				surnameT.dispose();
				status.dispose();
				statusT.dispose();
				findBook();
			}
		});
	}
	
	public void findBook() {
		take.setVisible(false);
		add.setVisible(false);
		returnBook.setVisible(false);
		deleteBook.setVisible(false);
		labelMain.setText("Поиск книги");
		labelMain.setBounds(135, 25, 250, 20);		
		Label title = new Label (shell, SWT.NONE);
		title.setText("Название книги");
		title.setBounds(15, 135, 150, 20);		
		Text titleT = new Text (shell, SWT.NONE);
		titleT.setBounds(195, 135, 150, 20);		
		Label surname = new Label (shell, SWT.NONE);
		surname.setText("Фамилия посетителя");
		surname.setBounds(15, 195, 150, 20);		
		Text surnameT = new Text (shell, SWT.NONE);
		surnameT.setBounds(195, 195, 150, 20);		
		ExtendedInterface extendedInterface = new ExtendedInterface();
		BookStorage bookStorage = new BookStorage();
		BookCatalog bookCatalog = new BookCatalog();
		Button find = new Button (shell, SWT.PUSH);
		find.setText("Найти");
		find.setBounds(125, 233, 150, 28);
		find.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				find.dispose();
				title.dispose();
				titleT.dispose();
				surname.dispose();
				surnameT.dispose();
				if (bookCatalog.getAccounting().isEmpty()) {
					MessageBox message = new MessageBox(shell, SWT.ICON_ERROR);
					message.setText("ERROR!");
					message.setMessage("Книги нет в каталоге");
					message.open();
					take.setVisible(true);
					add.setVisible(true);
					returnBook.setVisible(true);
					deleteBook.setVisible(true);
					labelMain.setText("Домашняя библиотека");
				}			
				else if(bookStorage.getStorage().isEmpty()) {
					labelMain.setText("Мой профиль");
					Label name = new Label (shell, SWT.NONE);
					name.setText("Имя:");
					name.setBounds(135, 55, 150, 20);			
					Label surname = new Label (shell, SWT.NONE);
					surname.setText("Фамилия:");
					surname.setBounds(135, 115, 150, 20);			
					Label status = new Label (shell, SWT.NONE);
					status.setText("Статус:");
					status.setBounds(135, 165, 150, 20);
					Label toBeRead = new Label (shell, SWT.NONE);
					toBeRead.setText("Прочитанные книги:");
					toBeRead.setBounds(15, 215, 150, 20);			
					Label favouriteBook = new Label (shell, SWT.NONE);
					favouriteBook.setText("Любимые книги:");
					favouriteBook.setBounds(15, 245, 150, 20);
					Button addRead = new Button (shell, SWT.PUSH);
					addRead.setText("Добавить");
					addRead.setBounds(165, 215, 150, 20);
					Button addFavourite = new Button (shell, SWT.PUSH);
					addFavourite.setText("Добавить");
					addFavourite.setBounds(165, 245, 150, 20);
					addRead.addSelectionListener(new SelectionAdapter(){
						public void widgetSelected(SelectionEvent arg0) {
							addBookToListToBeRead();
							name.dispose();		
							surname.dispose();				
							status.dispose();	
							toBeRead.dispose();			
							favouriteBook.dispose();	
							addRead.dispose();	
							addFavourite.dispose();	
							take.setVisible(true);
							add.setVisible(true);
							returnBook.setVisible(true);
							deleteBook.setVisible(true);
							labelMain.setText("Домашняя библиотека");
						}
					});
					addFavourite.addSelectionListener(new SelectionAdapter(){
						public void widgetSelected(SelectionEvent arg0) {
							addBookToFavouriteList();
							name.dispose();		
							surname.dispose();				
							status.dispose();	
							toBeRead.dispose();			
							favouriteBook.dispose();	
							addRead.dispose();	
							addFavourite.dispose();	
							take.setVisible(true);
							add.setVisible(true);
							returnBook.setVisible(true);
							deleteBook.setVisible(true);
							labelMain.setText("Домашняя библиотека");
						}
					});
				}			
				else {
					extendedInterface.createRecordInBookAccounting();
					addBookToReadList();
					take.setVisible(true);
					add.setVisible(true);
					returnBook.setVisible(true);
					deleteBook.setVisible(true);
					labelMain.setText("Домашняя библиотека");
				}
			}
		});
	}

	public void takeBook() {
		take = new Button (shell, SWT.PUSH);
		take.setText("Взять книгу");
		take.setBounds(15, 143, 150, 28);
		VisitorsProfile visitorsProfile = new VisitorsProfile();
		take.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				if (visitorsProfile.accounting.isEmpty()) {
					createProfile();
				} else {
					findBook();
				}
			}
		});
	}
	
	public void rateBook() {}
	
	public void findVisitor() {
		VisitorsProfile visitorsProfile = new VisitorsProfile();
		visitorsProfile.getAccounting();
	}
	
	public void reportTakingBook() {
		MessageBox message = new MessageBox(shell, SWT.ICON_INFORMATION);
		message.setText("Успех!");
		message.setMessage("Книга взята");
		message.open();
	}
	
	public void reportBookReturn() {
		MessageBox message = new MessageBox(shell, SWT.ICON_INFORMATION);
		message.setText("Успех!");
		message.setMessage("Книга возвращена");
		message.open();
	}
	
	public void returnBook() {
		returnBook = new Button (shell, SWT.PUSH);
		returnBook.setText("Вернуть книгу");
		returnBook.setBounds(215, 143, 150, 28);
		returnBook.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				reportBookReturn();
				take.setVisible(false);
				add.setVisible(false);
				returnBook.setVisible(false);
				deleteBook.setVisible(false);
				labelMain.setText("Мой профиль");
				Label name = new Label (shell, SWT.NONE);
				name.setText("Имя:");
				name.setBounds(135, 55, 150, 20);			
				Label surname = new Label (shell, SWT.NONE);
				surname.setText("Фамилия:");
				surname.setBounds(135, 115, 150, 20);			
				Label status = new Label (shell, SWT.NONE);
				status.setText("Статус:");
				status.setBounds(135, 165, 150, 20);
				Label toBeRead = new Label (shell, SWT.NONE);
				toBeRead.setText("Прочитанные книги:");
				toBeRead.setBounds(15, 215, 150, 20);			
				Label favouriteBook = new Label (shell, SWT.NONE);
				favouriteBook.setText("Любимые книги:");
				favouriteBook.setBounds(15, 245, 150, 20);
				Button addRead = new Button (shell, SWT.PUSH);
				addRead.setText("Добавить");
				addRead.setBounds(165, 215, 150, 20);
				Button addFavourite = new Button (shell, SWT.PUSH);
				addFavourite.setText("Добавить");
				addFavourite.setBounds(165, 245, 150, 20);
				addRead.addSelectionListener(new SelectionAdapter(){
					public void widgetSelected(SelectionEvent arg0) {
						addBookToListToBeRead();
						name.dispose();		
						surname.dispose();				
						status.dispose();	
						toBeRead.dispose();			
						favouriteBook.dispose();	
						addRead.dispose();	
						addFavourite.dispose();	
						take.setVisible(true);
						add.setVisible(true);
						returnBook.setVisible(true);
						deleteBook.setVisible(true);
						labelMain.setText("Домашняя библиотека");
					}
				});
				addFavourite.addSelectionListener(new SelectionAdapter(){
					public void widgetSelected(SelectionEvent arg0) {
						addBookToFavouriteList();
						name.dispose();		
						surname.dispose();				
						status.dispose();	
						toBeRead.dispose();			
						favouriteBook.dispose();	
						addRead.dispose();	
						addFavourite.dispose();	
						take.setVisible(true);
						//add.setVisible(true);
						returnBook.setVisible(true);
						//deleteBook.setVisible(true);
						labelMain.setText("Домашняя библиотека");
					}
				});
			}
		});
	}
	
	public void addBookToReadList() {}
	
	public void addBookToListToBeRead() {}
	
	public void addBookToFavouriteList() {}
}
