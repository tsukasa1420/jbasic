package fundamentals.chapter2.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が10の倍数かそうでないかを判定するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		int x = 0;
		multiple( x );

		x = 11;
		multiple( x );

		x = 100;
		multiple( x );
	}

	static void multiple( int x ) {
		if( x % 10 == 0 )System.out.println( "*10" );
		else System.out.println( "Error" );
	}
}
