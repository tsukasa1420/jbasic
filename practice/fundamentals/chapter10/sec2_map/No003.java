package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * HashMapを使用してキーに文字列、値に数値を代入してコレクションを作成してください。
 * その後、任意のキーを指定して値を取得して表示するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		HashMap< String, Integer > str = new HashMap<>();
		str.put( "ね", 1 );
		str.put( "うし", 2 );
		str.put( "とら", 3 );
		str.put( "う", 4 );
		str.put( "たつ", 5 );
		str.put( "み", 6 );

		System.out.println( str.get("ね") );
	}
}
