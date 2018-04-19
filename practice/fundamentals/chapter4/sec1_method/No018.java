package fundamentals.chapter4.sec1_method;

import java.util.Scanner;

/*
 * じゃんけんを行うクラスを作成してください。
 * キーボード入力に対して、じゃんけんで「勝ち、負け、あいこ」を表示するプログラムを作成してください。
 */
public class No018 {
	public static void main(String[] args) {
		Janken jan = new Janken();
	}
}

class Janken{
	Janken(){
		int play = player();
		int nonPlay = nonPlayer();

		if(play == nonPlay) {
			System.out.println( "あいこ" );
		}
		if(play == nonPlay) {

		}










		if( play == 0 ) {					// ぐー
			System.out.println( "自分：ぐー" );
			if( nonPlay == 0 ) {					// ぐー
				System.out.println( "相手：ぐー" );
				System.out.println( "あいこ" );
			}
			else if( nonPlay == 1 ) {				// ちょき
				System.out.println( "勝ち" );
			}
			else if( nonPlay == 2 ) {				// ぱー
				System.out.println( "相手：ぱー" );
				System.out.println( "負け" );
			}
			else System.out.println( "ERROR" );
		}
		else if( play == 1 ) {				// ちょき
			System.out.println( "自分：ちょき" );
			if( nonPlay == 0 ) {					// ぐー
				System.out.println( "相手：ぐー" );
				System.out.println( "負け" );
			}
			else if( nonPlay == 1 ) {				// ちょき
				System.out.println( "あいこ" );
			}
			else if( nonPlay == 2 ) {				// ぱー
				System.out.println( "相手：ぱー" );
				System.out.println( "勝ち" );
			}
			else System.out.println( "ERROR" );
		}
		else if( play == 2 ) {				// ぱー
			System.out.println( "自分：ぱー" );
			if( nonPlay == 0 ) {					// ぐー
				System.out.println( "相手：ぐー" );
				System.out.println( "勝ち" );
			}
			else if( nonPlay == 1 ) {				// ちょき
				System.out.println( "負け" );
			}
			else if( nonPlay == 2 ) {				// ぱー
				System.out.println( "相手：ぱー" );
				System.out.println( "あいこ" );
			}
			else System.out.println( "ERROR" );
		}
		else System.out.println( "不正な入力値です" );
	}
	int player() {
		System.out.println( "0 : ぐー\t1 : ちょき\t2 : ぱー" );
		Scanner scan = new Scanner(System.in);
		return 0;//scan.nextInt();
	}
	int nonPlayer() {
		return (int)(Math.random()*3);
	}
}