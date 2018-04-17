package fundamentals.chapter7.sec1_trycatch;
/*

	int型整数を用意して、a / b の計算式を実行した場合にエラーが発生しました。
	try-catch文を使用して例外処理を行ってください。

 */
public class No001 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println( a / b );
		}
		catch ( Exception e ) {
			System.out.println( "ERROR" );
		}
	}
}
/*
public class No001 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
}
*/