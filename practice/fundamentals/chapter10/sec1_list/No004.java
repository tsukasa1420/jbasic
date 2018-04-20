package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListを使用して値を代入後、拡張for文を使用して値を順番に表示するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		ArrayList< String > str = new ArrayList<>();
		str.add( "ね" );
		str.add( "うし" );
		str.add( "とら" );
		str.add( "う" );
		str.add( "たつ" );
		str.add( "み" );
		ArrayOut.print(str, "");
	}
}
