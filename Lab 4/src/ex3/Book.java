package ex3;



	public class Book extends WrittenItem {

		public Book(int id, String title, int numCopy, String author) {

			super(id, title, numCopy, author);
			// TODO Auto-generated constructor stub
		}

		public int getIdNum() {
			return super.getIdNum();
		}

		public String getTitle() {
			return super.getTitle();
		}

		public int getNumCopies() {
			return super.getNumCopies();
		}

		public String getAuthor() {
			return super.getAuthor();
		}

		public void print() {
			System.out.println("Information about a book: ");
			super.print();
		}

		public void checkIn() {
			super.checkIn();
		}

		public void checkOut() {
			super.checkOut();
		}

		public void addItem(int id, String title, int numCopy) {
			super.addItem(id, title, numCopy);
		}

	}

