package fundamentals.chapter05.sec1_multiarray;
/*
 * int型の3次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※3次元配列の各要素数は3とする。
 */
public class No003 {
	public static void main(String[] args) {
		int[][][] int3d = {
				// 1段目
				{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				// 3段目
				{ { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } },
				// 3段目
				{ { 1, 6, 8 }, { 2, 4, 9 }, { 3, 5, 7 } },
		};

		for( int i = 0; i < int3d[0][0].length; i++ ) {
			for( int j = 0; j < int3d[0].length; j++ ) {
				for( int k = 0; k < int3d.length; k++ ) {
					System.out.print( int3d[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}	// ==================== forループここまで
	}
}
