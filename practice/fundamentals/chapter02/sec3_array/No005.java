package fundamentals.chapter02.sec3_array;

/*
 * 要素型がintの配列を生成して、一番最後の要素を表示するプログラムを作成してください。
 * 要素数は3以上であること。
 */
public class No005 {
	public static void main(String[] args) {
		int[] iArray = { 1, 2, 3, 4, 5 };
		int j = 0;
		while( j < iArray.length ) j++;
		System.out.println( iArray[ j - 1 ] + "" );
	}
}
