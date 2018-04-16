package fundamentals.chapter4.sec5_overload;
/*
 * 同一の名前を持つメソッドを定義し、それぞれ任意の処理をするプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		func();
		func( "0418" );
	}
	static void func() {
		System.out.println( "===== 引数無し =====" );
	}

	static void func( String a ) {
		System.out.println( "===== 引数あり =====" + a );
	}
}
