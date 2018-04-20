package fundamentals.chapter02.sec7_switch;

import java.util.Scanner;

/*
 * キーボード入力により、「春、夏、秋、冬」のどれかを入力し、
 * それぞれに対応する英語名が出力されるプログラムをswitch文を使用して作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		System.out.print( "入力 : " );
		Scanner scan = new Scanner( System.in );
		String str = scan.next();
		scan.close();

		seasonFunc( str );
	}

	static void seasonFunc( String x ) {
		switch(x) {
			case "春":
				System.out.println( "スプリング" );
				break;
			case "夏":
				System.out.println( "サマー" );
				break;
			case "秋":
				System.out.println( "オータム" );
				break;
			case "冬":
				System.out.println( "ウィンター" );
				break;
			default:
				System.out.println( "Error" );
		}
	}
}
