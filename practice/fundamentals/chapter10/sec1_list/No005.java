package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * 次のBookをインスタンス化した際にコンストラクタでタイトルと価格を設定して3冊の本を作成してください。
 * ただし、今回はArrayListのaddメソッド内でコンストラクタを呼び出すようにしてください。
 * その後、3冊のタイトルと価格を出力するプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		ArrayList< Book > str = new ArrayList<>();
		str.add( new Book( "こゝろ", 1000 ) );
		str.add( new Book( "銀河鉄道の夜", 700 ) );
		str.add( new Book( "斜陽", 500 ) );
		for( Book book : str ) System.out.println( book.getTitle() + " : " + book.getPrice() + "yen" );
	}
}

class Book {
	String title;    // タイトル
	int price;       // 価格

	// コンストラクタ
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
/*
public class No008 {

}

class Book {
	String title;    // タイトル
	int price;       // 価格

	// コンストラクタ
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
*/