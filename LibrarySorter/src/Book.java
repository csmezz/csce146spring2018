public class Book {
	public String title;
	public String genre;
	public int checkout;
	
	public Book() {
		title = "";
		genre = "";
		checkout = 0;
	}
	
	public String getFormatString() {
		return this.title + " " + this.genre + " " + this.checkout + "\n";
	}
}
