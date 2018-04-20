package fundamentals.chapter05.sec2_arraylist;

import java.util.ArrayList;

/*
 * ArrayListのコンストラクタ「ArrayList(int initialCapacity) 」を使用して、要素数5の配列を作成してください。
 * 作成したArrayListに、任意の値を6個代入して、拡張for文を使用して1つづつ表示するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		ArrayList< String > listStr = new ArrayList< String >(5);
		listStr.add( "山田太郎" );
		listStr.add( "田中二郎" );
		listStr.add( "松下花子" );

		listStr.add( "佐藤勇樹" );
		listStr.add( "鈴木　翔" );
		listStr.add( "谷山浩子" );
		for( String str: listStr ) {
			System.out.println( str + "◆" );
		}
	}
}
