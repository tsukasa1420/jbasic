package fundamentals.chapter5.sec1_multiarray;
/*
 * int型の2次元配列の作成と初期化をまとめて行い、
 * 配列中の任意の値を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		int[][] arrayInt = {
				{ 10,	20,		30,		40 },
				{ 2,		4,		6,		8 },
				{ 3,		6,		9,		12 },
				{ 4,		8,		12,		16 }
		};

		for( int i = 0; i < arrayInt[0].length; i++ ) {
			for( int j = 0; j < arrayInt.length; j++ ) {
				System.out.print( arrayInt[i][j] + "\t");
			}
			System.out.println();
		}
	}
}