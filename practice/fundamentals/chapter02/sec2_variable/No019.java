package fundamentals.chapter02.sec2_variable;

import java.util.Scanner;

/*
 * キーボードから読み込んだ整数値の最下位桁を除いた値と、
 * 最下位桁を表示するプログラムを作成してください。
 */

// 18年4月19日
public class No019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		int inputInt = scan.nextInt();
		int stock = inputInt;
		scan.close();
		while( stock > 10 ) {
			stock -= 10;
		}
		System.out.println( "最下位桁 :\t" + stock + "\nそれ以上 :\t" + (inputInt -= stock) );
	}
}
