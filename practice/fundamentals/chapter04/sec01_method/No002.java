package fundamentals.chapter04.sec01_method;
/*
 * double型を引数に取る割り算メソッド作成してください。
 * mainメソッドからそのメソッドを使っていくつかの割り算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		div( 10, 2 );
		div( 123, 2 );
		div( 951, 65 );
		div( 76, 3 );
		div( 753, 10 );
	}

	static void div( double num01, double num02 ) {
		System.out.println( num01 / num02 );
	}
}