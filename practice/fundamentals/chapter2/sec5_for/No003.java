package fundamentals.chapter2.sec5_for;
/*
 * 1から100までの整数を10間隔で表示させるプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		// int配列 no003 に1～100までを格納
		int[] no003 = new int[100];
		for( int cnt_no3 = 0; cnt_no3 < no003.length; cnt_no3++ ) {
			no003[ cnt_no3 ] = cnt_no3 + 1;
			//System.out.println( no003[ cnt_no3 ] );
		}

		for( int cnt_no3 = 0; cnt_no3 < no003.length; cnt_no3++ ) {
			if( no003[ cnt_no3 ] % 10 == 0 ) System.out.println( no003[ cnt_no3 ] );
		}
	}
}