package fundamentals.chapter02.sec5_for;
/*
 * 整数1から10までを降順で表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		int[] no002 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for( int cnt_no2 = no002.length - 1; cnt_no2 >= 0; cnt_no2-- ) {
			System.out.println( no002[ cnt_no2 ] );
		}
	}

}
