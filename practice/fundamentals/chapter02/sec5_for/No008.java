package fundamentals.chapter02.sec5_for;
/*
 * 3の倍数の時に「hoge」、5の倍数の時に「huga」と表示するプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
		for( int i = 0; i < 25; i++ ) {
			System.out.print( i );
			if( i % 3 == 0 ) System.out.print( "\t : hoge◆" );
			if( i % 5 == 0 ) System.out.print( "\t : huga◇" );
			System.out.println();
		}
	}
}