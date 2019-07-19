package javaSessions;

import Util.LibraryClass;

public class StudentLib {

	public static void main(String[] args) {
		LibraryClass lib = new LibraryClass();
		System.out.println(lib.totalNumberOfBooks());
		int book = lib.getSubjectBooks("Mathematics");
		System.out.println(book);
	}

}
