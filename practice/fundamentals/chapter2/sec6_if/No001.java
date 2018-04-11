package fundamentals.chapter2.sec6_if;

/*
 * int型の変数xに対し、xに代入された数値が正か負かを判定するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		int x = 10;
		decide( x );

		x = -10;
		decide( x );

		x = 0;
		decide( x );
	}

	static void decide( int x ) {
		if( x < 0 )System.out.println( "MINUS" );
		else if( x > 0 )System.out.println( "PLUS" );
		else System.out.println( "Not decide" );
	}
}
