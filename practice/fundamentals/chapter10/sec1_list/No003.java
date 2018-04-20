package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListクラスに値を代入し、サイズを出力するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		ArrayList< String > str = new ArrayList<>();
		str.add( "ね" );
		str.add( "うし" );
		str.add( "とら" );
		str.add( "う" );
		str.add( "たつ" );
		str.add( "み" );
		System.out.println( str.size() );
	}
}
