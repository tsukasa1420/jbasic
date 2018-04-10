package fundamentals.chapter2.sec3_array;

/*
 * 3人のテスト結果がそれぞれ84点、74点、92点でした。
 * 点数を配列に入れるため、配列の宣言と領域の確保、及び初期化を行って下記の様に出力するプログラムを作成してください。
 * ▼出力結果
 * 1人目：84
 * 2人目：74
 * 3人目：92
 */
public class No001 {
	public static void main(String[] args) {
		int[] testResult = { 84, 74, 92 };
		for( int i = 0; i < testResult.length; i++ ) {
			System.out.println( i + 1 + "人目：" + testResult[i] );
		}
	}
}
