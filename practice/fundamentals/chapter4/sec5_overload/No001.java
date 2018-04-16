package fundamentals.chapter4.sec5_overload;
/*
 * 2つのint型a,bの最小値、3つのint型abcの最小値を求める以下のメソッドを定義して、
 * mainメソッドで使用するプログラムを作成してください。
 * ・int min(int a,int b)
 * ・int min(int a,int b,int c)
 */
public class No001 {
	public static void main(String[] args) {
		int a = 10, b = 65, c = 9;
		System.out.println( "a : " + a + " / b : " + b + " / c : " + c );
		System.out.println( "min : " + min( a, b ) );
		System.out.println( "min : " + min( a, b, c ) );
	}
	static int min( int num01, int num02 ) {
		if( num01 < num02 ) return num01;
		else return num02;
	}
	static int min( int num01, int num02, int num03 ) {
		return min( min( num01, num02 ), num03 );
	}
}
