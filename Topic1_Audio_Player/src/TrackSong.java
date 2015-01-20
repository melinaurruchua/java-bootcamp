
public class trackSong {
	private String name;
	private String author;
	private int durationInSec;
	private String album;
	
	public trackSong(String name,String author,int durationInSec,String album){
		this.setName(name);
		this.setAuthor(author);
		this.setDurationInSec(durationInSec);
		this.setAlbum(album);
	}

	public int getDurationInSec() {
		return durationInSec;
	}

	public void setDurationInSec(int durationInSec) {
		this.durationInSec = durationInSec;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}
