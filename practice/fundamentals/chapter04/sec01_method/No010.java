package fundamentals.chapter04.sec01_method;
/*
 * 1からnまでの全整数の和を求めて返却するメソッドを作成し、
 * mainメソッド内で使用するプログラムを作成してください。
 * ※nはキーボード入力により取得すること
 */
public class No010 {
	public static void main(String[] args) {
		System.out.println( sigma( No007.scanning() ) );
	}

	static int sum = 0;
	static int sigma( int n ) {
		sum += n;
		System.out.println( "sum : " + sum );
		System.out.println( "n : " + n );
		System.out.println(  );
		if( n > 1 ) sigma( n - 1 );
		return sum;
	}
}
