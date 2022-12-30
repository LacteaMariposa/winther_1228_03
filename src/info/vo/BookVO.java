package info.vo;

public class BookVO {
	private int isbn; //도서 번호
	private String bookName; //책이름
	private String publish; // 출판사
	private String author; //저자명
	private int price; //가격
	private String category; //종류
	
	public BookVO() {
		
	}
	
	public BookVO(int isbn, String bookName, String publish, String author, int price, String category) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.publish = publish;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", bookName=" + bookName + ", publish=" + publish + ", author=" + author
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	
}
