package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListに数値を代入し、出力するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		ArrayList< Integer > i = new ArrayList<>();
		i.add( 100 );
		i.add( 200 );
		i.add( 10 );
		i.add( 20 );
		i.add( 1 );
		i.add( 2 );
		ArrayOut.print( i, 0 );
	}
}
