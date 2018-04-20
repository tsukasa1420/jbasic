package fundamentals.chapter04.sec01_method;

import java.util.Scanner;

/*
 * キーボード入力により受け取った値が負であれば「-1」を返し、
 * 0であれば「0」、正であれば「1」を返すメソッド「signOf」を作成してmainメソッド内で使用してください。
 */
public class No007 {
	public static void main(String[] args) {
		int key = scanning();
		System.out.println( signOf( key ) );

		key = scanning();
		System.out.println( signOf( key ) );

		key = scanning();
		System.out.println( signOf( key ) );

		key = scanning();
		System.out.println( signOf( key ) );
	}
	static int scanning() {
		System.out.print( "整数を入力してください : " );
		int inputInt = 0;
		Scanner scanInt = new Scanner( System.in );
		inputInt = scanInt.nextInt();
		scanInt.close();
		return inputInt;
	}
	static String signOf( int key ) {
		if( key == 0 ) return "「0」";
		else if( key < 0 ) return "「-1」";
		else if( key > 0 ) return "「1」";
		else return "Error";
	}
}
