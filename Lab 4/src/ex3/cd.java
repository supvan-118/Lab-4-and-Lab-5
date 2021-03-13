package ex3;
	public class cd extends MediaItem {

		public cd(int id, String title, int numCopy) {
			super(id, title, numCopy);
			// TODO Auto-generated constructor stub
		}

		private String artist;
		private String genre;

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public void print() {
			System.out.println("Display info about a CD ");
			super.print();
		}
	}
