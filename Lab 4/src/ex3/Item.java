package ex3;
abstract class Item {
	private int idNum;
	private String title;
	private int numCopies;

	public Item() {
		super();
		idNum = 0;
		title = "";
		numCopies = 0;
	}

	public Item(int idNum, String title, int numCopies) {
		super();
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumCopies() {
		return numCopies;
	}

	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}

	public void checkIn() {
		numCopies = numCopies + 1;
	}

	public void checkOut() {
		numCopies = numCopies - 1;
	}

	public void addItem(int idNum, String str, int n) {
		setIdNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

	public String toString() {
		return "ID:" + idNum + "Titlt:" + title + "Number of Copies:" + numCopies;
	}

	public void print() {
		System.out.println("title: " + title);
		System.out.println("Id: " + idNum);
		System.out.println("Number of Copies: " + numCopies);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Item otherItem = (Item) obj;
		return idNum == otherItem.idNum && title == otherItem.title && numCopies == otherItem.numCopies;
	}

	public void addItem() {
		numCopies++;
	}
}
