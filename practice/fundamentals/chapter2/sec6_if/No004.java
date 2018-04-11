package fundamentals.chapter2.sec6_if;

/*
 * int型変数x、yに対し、x÷yの演算が割り切れるかどうかを判定するプログラムを作成してください。
 */
public class No004 {

	public static void main(String[] args) {
		int x = 6;
		int y = 3;
		division( x, y );

		x = 23;
		y = 48;
		division( x, y );

		x = 0;
		y = 0;
		division( x, y );
	}

	static void division( int x, int y ) {
		if( y == 0 ) {
			System.out.println( "Error" );
			return;
		}
		if( x % y != 0 ) System.out.println( "Indivisible" );
		else if( x % y == 0 ) System.out.println( "Divisible" );
		else System.out.println( "Error" );
	}
}
