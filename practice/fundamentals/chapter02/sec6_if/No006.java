package fundamentals.chapter02.sec6_if;

/*
 * double型変数xに対し、xに代入された数字が整数か少数か判定するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		double x = 9.0;
		number( x );

		x = 5.4;
		number( x );

		x = 0.519;
		number( x );

		x = 3519.0;
		number( x );
	}

	static void number( double x ) {
		double underOne = x;

		while( true ) {
			if( underOne < 1.0 ) break;
			underOne -= 1.0;
		}

		if( underOne == 0.0 ) System.out.println( x + " : integer" );
		else if( underOne > 0.0 )System.out.println( x + " : decimals" );
		else System.out.println( "Error" );
	}
}
