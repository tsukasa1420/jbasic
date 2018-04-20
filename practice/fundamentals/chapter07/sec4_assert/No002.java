package fundamentals.chapter07.sec4_assert;

import java.util.Scanner;

/*
 *	キーボード入力によって入力された数値が0~6の間でない場合はエラーを表示させてください。
 *	※エラーはassertを使用して発生させること（エラーメッセージは任意）
 */
public class No002 {
	public static void main(String[] args) {
		System.out.print( "求：キーボード入力：" );
		Scanner scan = new Scanner( System.in );
		int inputInt = scan. nextInt();

		if( 0 <= inputInt  && inputInt <= 6 ) System.out.println( "ゼロからロクだよ" );
//		if( inputInt < 0 || 6 < inputInt ) System.out.println( "範囲外だよ" );
//		assert ( inputInt < 0 || 6 < inputInt ) : "正常終了";
		assert ( inputInt >= 0 && 6 >= inputInt ) : "範囲外だよ";
	}
}