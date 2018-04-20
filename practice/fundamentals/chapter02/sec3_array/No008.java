package fundamentals.chapter02.sec3_array;
/*
 * 7,12,37,	24,2,92,		51を要素に持つ配列を生成し、
 * for文を使用してすべての要素を表示させるプログラムを作成してください。
 */

//18年4月19日
public class No008 {
	public static void main(String[] args) {
		int[] array = { 7, 12, 37, /**/ 24, 2, 92, /**/ 51 };
		for( int i : array ) {
			System.out.println( i );
		}
	}
}
