package fundamentals.chapter10.sec2_map;

import java.util.HashMap;
import java.util.Map;

/*
 * Mapクラスを使用してキーに国名（日本語）、対応する値に国名（英語）を入れてください。
 * その後、キーに対する値を取得して表示させるプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		Map< String, String > map = new HashMap<>();
		map.put( "日本", "Nippon" );
		map.put( "伊太利亜", "ROMA" );
		map.put( "独逸", "German" );
		System.out.println( map.get( "独逸" ) );
	}
}