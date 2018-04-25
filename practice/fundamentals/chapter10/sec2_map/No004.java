package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * HashMapを作成し、任意のキーと値を代入してください。
 * その後、コレクションのサイズを取得して表示させるプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		HashMap< String, Integer > str = new HashMap<>();
		str.put( "ね", 1 );
		str.put( "うし", 2 );
		str.put( "とら", 3 );
		str.put( "う", 4 );
		str.put( "たつ", 5 );
		str.put( "み", 6 );

		System.out.println( str.size() );
	}
}
