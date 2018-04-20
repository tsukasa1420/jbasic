package fundamentals.chapter10.sec2_map;

import java.util.HashMap;
import java.util.Map;

/*
 * Mapクラスを使用してキーに国名（日本語）、対応する値に国名（英語）を入れてください。
 * インデックスを指定してキーに対する値を取得して表示させるプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		Map< String, String > map = new HashMap<>();
		map.put( "日本", "Nippon" );
		map.put( "伊太利亜", "ROMA!!!!!!!!!!!!!!!!!!!" );
		map.put( "独逸", "German" );
		for( String str : map.values() ) {
			System.out.println( str );
		}
//		System.out.println( map.get( "独逸" ) );
	}
}