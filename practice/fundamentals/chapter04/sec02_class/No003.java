package fundamentals.chapter04.sec02_class;
/*
 * No003クラスとは別に、四角形を表すクラスを定義してください。
 * フィールドに縦と横の長さをint型で持つようにします。
 * メソッドとして面積を返すメソッドを定義してください。
 * No003クラスのmainメソッドで四角形クラスをインスタンス化し、面積を表示させるプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		Square sq = new Square();
		sq.setArea( 5, 20 );
		System.out.println( sq.getArea() );
	}
}
class Square{
	int wid = 0;
	int hei = 0;
	void setArea( int wid, int hei ) {
		this.wid =	wid;
		this.hei =	hei;
	}
	int getArea() {
		return this.wid * this.hei;
	}
}