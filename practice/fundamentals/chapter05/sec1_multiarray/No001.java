package fundamentals.chapter05.sec1_multiarray;
/*
 * int型の2次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※2次元配列の要素数は任意とする。
 */
public class No001 {
	public static void main(String[] args) {
		int[][] arrayInt = new int[4][4];
		arrayInt[0][0] = 10;	arrayInt[0][1] = 20;	arrayInt[0][2] = 30;	arrayInt[0][3] = 40;
		arrayInt[1][0] = 2;		arrayInt[1][1] = 4;		arrayInt[1][2] = 6;		arrayInt[1][3] = 8;
		arrayInt[2][0] = 3;		arrayInt[2][1] = 6;		arrayInt[2][2] = 9;		arrayInt[2][3] = 12;
		arrayInt[3][0] = 4;		arrayInt[3][1] = 8;		arrayInt[3][2] = 12;	arrayInt[3][3] = 16;

		for( int i = 0; i < arrayInt[0].length; i++ ) {
			for( int j = 0; j < arrayInt.length; j++ ) {
				System.out.print( arrayInt[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
