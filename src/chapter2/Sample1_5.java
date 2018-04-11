package chapter2;

public class Sample1_5 {

	public enum Season{ Spring, Summer, Autum, Winter };

	public static void main(String[] args) {
		System.out.println( "=====特定要素の取り出し=====" );

		// Win だけを出力
		Season seasonWin = Season.Winter;
		System.out.println( seasonWin );

		System.out.println( "\n=====全要素の取り出し=====" );

		// 列挙要素の配列？
		Season[] seasonAll = Season.values();
		for( int i = 0; i < seasonAll.length; i++ ) System.out.println( seasonAll[i] );

		// 上の二行と同じ動作をする拡張 for文
		//for( Season seasonAll: Season.values() ){System.out.println( seasonAll );}

		// データ型 変数名1						// 配列でもStringでもOK
		// for( データ型 変数名2 : 変数名1 ){ 処理 }

		System.out.println( "\n=====switch文での使用=====" );
		System.out.println( "冬は" + seasonTerm( Season.Winter ) );
	}

	public static String seasonTerm( Season oneSeason ) {
		switch( oneSeason ) {
			case Spring:		return "3～5月です";
			case Summer:	return "6～8月です";
			case Autum:		return "9～11月です";
			case Winter:		return "12～2月です";
			default :			throw new AssertionError( oneSeason + "はありません" );
		}
	}
}