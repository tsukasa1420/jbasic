package fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った整数を引数に取り、
 * その中央値を求めるメソッド「med」を作成してmainメソッド内で使用するプログラムを作成してください。
 */
public class No009 {
	static int reqNum = 5;
	static int intArray[] = new int[ reqNum ];

	public static void main(String[] args) {
		for( int forInt = 0; forInt < reqNum; forInt++ ) {
			intArray[ forInt ] = No007.scanning();
			System.out.println( intArray[ forInt ] );
			System.out.println();
		}
	}
}
/*forに入力機能を持ってくるとエラーが吐かれる*/