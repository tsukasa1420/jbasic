package fundamentals.chapter4.sec7_override;

/*
 * Bookクラスを継承した漫画クラス、小説クラス、雑誌クラスを作成してください。
 * showPriceメソッドをオーバーライドして、
 * それぞれ以下の価格で表示されるようにメソッド内の処理を書き換えてください。
 * 最後に、mainメソッド内でそれぞれの価格を表示させてください。
 *
 * <価格設定>
 * 漫画：Bookの価格 - 200
 * 小説：Bookの価格 - 100
 * 雑誌：Bookの価格 + 100
 */
public class No002 {
	public static void main(String[] args) {
		Comic c = new Comic();
		c.showPrice();
		Novel n = new Novel();
		n.showPrice();
		Magazin m = new Magazin();
		m.showPrice();
	}
}
class Comic extends Book{
	@Override
	void showPrice() {
		System.out.println((price-200) + "円");
	}
}

class Novel extends Book{
	@Override
	void showPrice() {
		System.out.println((price-100) + "円");
	}
}

class Magazin extends Book{
	@Override
	void showPrice() {
		System.out.println((price+100) + "円");
	}
}

class Book {
	int price = 500;  // 価格
	void showPrice() {
		System.out.println(price + "円");
	}
}
/*
public class No002 {
	public static void main(String[] args) {

	}
}

class Book {
	int price = 500;  // 価格
	void showPrice() {
		System.out.println(price + "円");
	}
}
*/