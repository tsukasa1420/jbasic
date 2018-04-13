package fundamentals.chapter2.sec6_if;

import java.util.Scanner;

/*
 * キーボード入力によって入力された数字に対して偶数か奇数を判定するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		System.out.println( "入力 : " );
		Scanner scan = new Scanner( System.in );
		int x = scan.nextInt();
		scan.close();
		odd_even( x );
	}

	static void odd_even( int x ) {
		if( x % 2 == 1 )System.out.println( "odd" );
		else if( x % 2 == 0 )System.out.println( "even" );
		else System.out.println( "Error" );
	}
}
