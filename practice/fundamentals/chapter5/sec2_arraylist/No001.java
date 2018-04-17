package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * ArrayListクラスをインスタンス化し、addメソッドを使用して以下のデータを格納してください。
 * また、格納後に拡張for文を使用して格納したデータを画面に出力するプログラムを作成してください。
 * ・ばなな
 * ・りんご
 * ・ぶどう
 *
 * ※ジェネリックは適当に定義すること
 */
public class No001 {
	public static void main(String[] args) {
		ArrayList< String > listStr = new ArrayList< String >();
		listStr.add( "ばなな" );
		listStr.add( "りんご" );
		listStr.add( "ぶどう" );
		for( String str: listStr ) {
			System.out.println( str + "◆" );
		}
	}
}
