package ex3;

public class JournalPaper extends WrittenItem {

	public JournalPaper(int id, String title, int numCopy, String author) {
		super(id, title, numCopy, author);
		// TODO Auto-generated constructor stub
	}

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIdNum() {
		return super.getIdNum();
	}

	public String title() {
		return super.getTitle();
	}

	public int numCopies() {
		return super.getNumCopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public int yearPub() {
		return year;
	}

	public void print() {
		System.out.println("Information of Journal paper:");
		super.print();
		System.out.println("Year published: " + year);
	}

	public void checkIn() {

	}

	public void checkOut() {

	}

	public void addItem(int id, String title, int numCopy) {
		super.addItem(id, title, numCopy);
	}

}
