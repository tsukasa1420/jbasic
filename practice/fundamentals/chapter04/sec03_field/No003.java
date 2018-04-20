package fundamentals.chapter04.sec03_field;
/*
 * インスタンス変数「int x = 10;」を持つクラス「Hoge」を作成し、
 * No003クラスでその変数を表示させるプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		Hoge h = new Hoge();
		System.out.println( h.x );
	}
}

class Hoge{
	int x = 456;
}