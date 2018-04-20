package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListクラスに文字列を代入し、出力するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		ArrayList< String > str = new ArrayList<>();
		str.add( "ね" );
		str.add( "うし" );
		str.add( "とら" );
		str.add( "う" );
		str.add( "たつ" );
		str.add( "み" );
		ArrayOut.print( str, "" );
	}
}

class ArrayOut{
	static void print( ArrayList<Integer> aList, int non ) {
		for( int i : aList ) System.out.println( i );
	}
	static void print( ArrayList<String> aList, String non ) {
		for( String str : aList ) System.out.println( str );
	}
}