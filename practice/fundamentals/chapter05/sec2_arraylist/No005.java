package fundamentals.chapter05.sec2_arraylist;

import java.util.ArrayList;

/*
 * データ数が5以上のArrayListを作成し、もしArrayListのサイズが3より大きい場合は、
 * 要素数1~3以外に入っているデータをすべて出力するプログラムを作成してください。
 *
 */
public class No005 {
	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt.add(10);		listInt.add(20);		listInt.add(50);
		listInt.add(100);		listInt.add(150);		listInt.add(180);
		listInt.add(360);		listInt.add(365);		listInt.add(1024);

		if( listInt.size() > 3 ) System.out.println( "リストの要素数：" + listInt.size() );
		for( int i = 3; i < listInt.size(); i++ ) {
			System.out.println(listInt.get(i) + "◆");
		}
	}
}
