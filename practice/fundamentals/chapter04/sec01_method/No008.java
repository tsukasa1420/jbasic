package fundamentals.chapter04.sec01_method;
/*
 * 3つのint型引数a,b,cの最小値を求めるメソッド「min」を作成して、
 * mainメソッド内で結果を表示させるプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
		int a = 10, b = 65, c = 9;
		System.out.println( "a : " + a + " / b : " + b + " / c : " + c );
		System.out.println( "min : " + min( min( a, b ), c ) );
	}
	static int min( int num01, int num02 ) {
		if( num01 > num02 ) return num01;
		else return num02;
	}
}
