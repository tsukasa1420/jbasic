package fundamentals.chapter05.sec2_arraylist;

import java.util.ArrayList;

/*
 * ArrayListクラスをインスタンス化し、任意のデータ型で任意の値を格納してください。
 * また、ArrayListクラス内に用意されているメソッドを適当に使用したプログラムを作成してください。
 * ※ArrayListクラスのメソッドは以下URLから検索して使用すること
 * https://docs.oracle.com/javase/jp/8/docs/api/index.html
 */
public class No004 {
	public static void main(String[] args) {
		ArrayList< String > listStr = new ArrayList< String >();
		listStr.add( "山田太郎" );
		listStr.add( "田中二郎" );
		listStr.add( "松下花子" );

		listStr.add( "佐藤勇樹" );
		listStr.add( "鈴木　翔" );
		listStr.add( "谷山浩子" );

		System.out.println( listStr.get(3) + "◆" );
		System.out.println();

		System.out.println( listStr.get(4) + "◆" );
		listStr.remove(4);
		System.out.println( listStr.get(4) + "◆" );
		System.out.println();

		for( String str: listStr ) {
			System.out.println( str + "◆" );
		}
		System.out.println();

		System.out.println( listStr.size() + "◆" );
		System.out.println();

		listStr.clear();
		System.out.println();

		for( String str: listStr ) {
			System.out.println( str + "◆" );
		}
	}
}
