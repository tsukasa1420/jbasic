package fundamentals.chapter4.sec1_method;
/*
 * 2つのint型を引数に取る足し算メソッドを作成してください。
 * mainメソッドからそのメソッドを使っていくつかの足し算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		add( 10, 20 );
		add( 15, 85 );
		add( 40, 60 );
		add( 123, 543 );
	}

	static void add( int num01, int num02 ) {
		System.out.println( num01 + num02 );
	}
}