package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * 2つの引数（int key , String value）を持つメソッドputMapを作成してください。
 * 引数で受け取った値は、HashMapクラスを使用して格納して戻り値として返すようにしてください。
 * mainメソッド内でそのメソッドを使用し、最後に値を表示するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		Hash m = new Hash();
		HashMap< Integer, String > map;
		m.putMap( 1, "くま" );
		m.putMap( 2, "いぬ" );
		m.putMap( 3, "ねこ" );
		m.putMap( 4, "うし" );
		m.putMap( 5, "うま" );
		map = m.putMap( 6, "さる" );
		m.display(map);
	}
}
class Hash{
	HashMap< Integer, String > sam = new HashMap<>();
	void display( HashMap<Integer, String> map ) {
		for( String str : map.values() ) {
			System.out.println( str );
		}
	}
	HashMap< Integer, String > putMap( int key, String value ){
		sam.put( key, value );
		return sam;
	}
}