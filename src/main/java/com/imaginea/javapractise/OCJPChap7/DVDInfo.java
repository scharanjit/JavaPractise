package OCJPChap7;

public class DVDInfo {
	String title;
	String genre;
	String leadActor;
	
	DVDInfo(String t, String g, String a) {
	}
	public String toString() {
	return title + " " + genre + " " + leadActor + "\n";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	
	

}