package fundamentals.chapter2.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が奇数か偶数かを判定するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		int x = 0;
		odd_even( x );

		x = 11;
		odd_even( x );

		x = 100;
		odd_even( x );
	}

	static void odd_even( int x ) {
		if( x % 2 == 1 )System.out.println( "odd" );
		else if( x % 2 == 0 )System.out.println( "even" );
		else System.out.println( "Error" );
	}
}
