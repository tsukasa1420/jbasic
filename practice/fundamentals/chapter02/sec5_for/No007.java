package fundamentals.chapter02.sec5_for;

import java.util.Scanner;

/*
 * 次のように画面に表示するプログラムをfor文を使って作成してください。
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class No007 {
	public static void main(String[] args) {
		int cntSpace = 0;
		int cntStar = 1;
		int layer = 0;

		Scanner scan = new Scanner( System.in );
		System.out.print( "数値入力 : " );
		layer = scan.nextInt();
		scan.close();

		// 行ごとのカウンタ 「cntSpace」は行番号を指す同時にスペースの数を指している
		while( cntSpace < layer ){

			// スペースを表示する
			for( int displaySpace = ( layer - 1 ); displaySpace > cntSpace; displaySpace-- ){
				System.out.print( " " );
			}

			// アスタリスクを表示
			for( int displayStar = 0; displayStar < cntStar; displayStar++ ){
				System.out.print( "*" );
			}
			System.out.println();
			cntSpace += 1;
			cntStar += 2;
		}
	}
}
