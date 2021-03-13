package ex3;
public class Video extends MediaItem {

	public Video(int id, String title, int numCopy) {
		super(id, title, numCopy);
		// TODO Auto-generated constructor stub
	}

	private String director;
	private int year;
	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void print() {
		System.out.println("Display info about Video: ");
		super.print();
	}
}
