package fundamentals.chapter04.sec10_javabeans;
/*
 * 次の本クラスをJavaBeans仕様にしてください。
 */
public class Book implements java.io.Serializable{
	private String bookName;

	public Book() {}
	public Book( String bookName ) {}

	public void setbookName( String bookName ) {
		this.bookName = bookName;
	}
	public String getbookName() {
		return this.bookName;
	}
}
