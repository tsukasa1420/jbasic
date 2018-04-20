package fundamentals.chapter04.sec01_method;

import java.util.Scanner;

/*
 * じゃんけんを行うクラスを作成してください。
 * キーボード入力に対して、じゃんけんで「勝ち、負け、あいこ」を表示するプログラムを作成してください。
 */
public class No018 {
	public static void main(String[] args) {
		new Janken();
		/*
		new Janken(0, -1);	// エラーテスト
		new Janken(0, 0);
		new Janken(0, 1);
		new Janken(0, 2);
		new Janken(0, 3);	// エラーテスト
		System.out.println();
		System.out.println();

		new Janken(1, -1);	// エラーテスト
		new Janken(1, 0);
		new Janken(1, 1);
		new Janken(1, 2);
		new Janken(1, 3);	// エラーテスト
		System.out.println();
		System.out.println();

		new Janken(2, -1);	// エラーテスト
		new Janken(2, 0);
		new Janken(2, 1);
		new Janken(2, 2);
		new Janken(2, 3);	// エラーテスト
		*/
	}
}
class Janken{
//	0 : ぐー
//	1 : ちょき
//	2 : ぱー
//	0 : ぐー

	Janken(){
		System.out.println( "0 : ぐー\t1 : ちょき\t2 : ぱー" );
		System.out.println();

		int play = player();
		System.out.println();
		if( play < 0 || 2 < play ) {						// +2
			System.out.println( "不正な入力値です" );
			System.out.println();
			return;
		}

		int nonPlay = nonPlayer();
		if( nonPlay < 0 || 2 < nonPlay ) {					// +2
			System.out.println( "不正な入力値です" );
			System.out.println();
			return;
		}

		if(play == nonPlay) {							// +6
			System.out.println( "あいこ" );
		}
		else if( play == (nonPlay - 1) ) {
			System.out.println( "勝ち" );
		}
		else if( play == (nonPlay + 1) ) {
			System.out.println( "負け" );
		}
		else if( play == (nonPlay + 2) ) {
			System.out.println( "勝ち" );
		}
		else if( play == (nonPlay - 2) ) {
			System.out.println( "負け" );
		}
		else System.out.println( "えらー" );
	}
	int player() {
		Scanner scan = new Scanner(System.in);
		System.out.print( "何を出しますか：" );
		int play = scan.nextInt();
		System.out.println();
		scan.close();
		System.out.println( "自分：" + janJudge( play ) );
		return play;
	}
	int nonPlayer() {
		int nonPlay = (int)(Math.random()*3);
		System.out.println( "相手：" + janJudge( nonPlay ) );
		return nonPlay;
	}
	String janJudge( int hand ) {
		if( hand == 0 ) return "ぐー";					// +4
		else if( hand == 1 ) return "ちょき";
		else if( hand == 2 ) return "ぱー";
		else return "ERROR";
	}

	// テスト用コンストラクタ・メソッド
	Janken( int a, int b ){
		int play = player(a);
		System.out.println();
		if( play < 0 || 2 < play ) {						// +2
			System.out.println( "不正な入力値です" );
			return;
		}

		int nonPlay = nonPlayer(b);
		if( nonPlay < 0 || 2 < nonPlay ) {					// +2
			System.out.println( "不正な入力値です" );
			return;
		}

		if(play == nonPlay) {							// +6
			System.out.println( "あいこ" );
		}
		else if( play == (nonPlay - 1) ) {
			System.out.println( "勝ち" );
		}
		else if( play == (nonPlay + 1) ) {
			System.out.println( "負け" );
		}
		else if( play == (nonPlay + 2) ) {
			System.out.println( "勝ち" );
		}
		else if( play == (nonPlay - 2) ) {
			System.out.println( "負け" );
		}
		else System.out.println( "えらー" );
	}
	int player(int a) {
		Scanner scan = new Scanner(System.in);
		int play = a;
		return play;
	}
	int nonPlayer(int b) {
		int nonPlay = b;
		return nonPlay;
	}
}