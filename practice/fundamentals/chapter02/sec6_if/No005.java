package fundamentals.chapter02.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が2桁の数値かどうかを判断するプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		int x = 9;
		digit( x );

		x = 54;
		digit( x );

		x = 519;
		digit( x );

		x = 3519;
		digit( x );
	}

	static void digit( int x ) {
		if( x / 10 <= 0 ) System.out.println( x + " is single digit" );
		else if( x / 10 > 0 && x / 10 < 10 )System.out.println( x + " is double digit" );
		else if( x / 10 > 10 )System.out.println( x + " is triple digit over" );
		else System.out.println( "Error" );
	}
}
