package fundamentals.chapter02.sec3_array;
/*
 * int型の配列を作成し、10,20,30,40,50を代入し、
 * 配列から値を1つずつ取り出して出力するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		int[] iArray = { 10, 20, 30, 40, 50 };
		for( int i = 0; i < iArray.length; i++ ) {
			System.out.println( iArray[i] );
		}
	}
}
