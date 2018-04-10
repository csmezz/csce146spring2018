public class Book {
	public String title;
	public String genre;
	public int checkout;
	
	public String getFormatString() {
		return this.title + " " + this.genre + " " + this.checkout + "\n";
	}
}
