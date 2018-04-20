package fundamentals.chapter04.sec01_method;

import java.util.Scanner;

/*
 * テストの点数を受け取り、合格か不合格の文字列を返すメソッドを定義してください。
 * mainメソッドからキーボード入力で点数を受け取り、メソッドを使って判定してください。
 * ※80点以上で合格とする。
 */
public class No004 {
	public static void main(String[] args) {
		System.out.print( "点数を入力してください : " );

		Scanner scan = new Scanner( System.in );
		pass( scan.nextInt() );
		scan.close();
	}

	static void pass(int point) {
		if( point < 0 || point > 100 ) {
			System.out.println( "判定不能な値です" );
			//return;
		}
		else if( point >= 80 ) {
			System.out.println( "合格です　合格点に達しました" );
		}
		else {
			System.out.println( "不合格です　合格点に達しませんでした" );
		}

	}
}
