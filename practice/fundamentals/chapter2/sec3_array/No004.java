package fundamentals.chapter2.sec3_array;

/*
 * 要素型がdoubleで要素数が5の配列を生成して、その全要素を表示するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		double d[] = { 1, 2, 3, 4, 5 };
		for( int i = 0; i < d.length; i++ ) {
			System.out.println( d );
		}
	}
}
