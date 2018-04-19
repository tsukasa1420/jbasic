package fundamentals.chapter4.sec1_method;
/*
 * 整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 * また、メソッドの動作を検証できるようにプログラムを作成してください。
 */

// 18 / 4 / 19
public class No012 {
	public static void main(String[] args) {
		System.out.println( Calc.square( 20 ) );
	}
}

class Calc{
	static int square(int sqInt) {
		return sqInt*sqInt;
	}
	static int average( int num1, int num2 ) {
		return ( num1 + num2 ) / 2;
	}
	static void timesTable( int num1 ) {
		for( int i = 1; i <= 9; i++ ) {
			System.out.print( num1 * i + "\t" );
		}
	}
	static int sum( int num1, int num2 ) {
		return num1 + num2;
	}
	static int sub( int num1, int num2 ) {
		return Math.abs( num1 - num2 );
	}
}