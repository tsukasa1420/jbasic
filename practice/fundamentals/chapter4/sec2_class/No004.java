package fundamentals.chapter4.sec2_class;
/*
 * No004クラスとは別に以下内容で本クラスを作成してください
 * また、mainメソッドから本クラスのオブジェクトを1つ生成して
 * それぞれの本の情報を表示するプログラムを作成してください。
 *
 * <フィールド>
 * ・本のタイトル
 * ・著者
 * ・価格
 *
 * <メソッド>
 * ・本のタイトル取得
 * ・著者情報取得
 * ・価格取得
 *
 */
public class No004 {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println( book.bookFunc( "こゝろ", "夏目漱石", 600 ) );
	}
}
class Book{
	String bookName = "";
	String bookAuther = "";
	int bookPrice = 0;
	String bookFunc( String bookName, String bookAuther, int bookPrice ) {
		this.bookName = bookName;
		this.bookAuther = bookAuther;
		this.bookPrice = bookPrice;
		return "書名：" + this.bookName + "\n著者：" + this.bookAuther + "\n値段：" + this.bookPrice;
	}

}