package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;
import java.util.List;

/*
 * 次のメソッドを作成してください。
 *
 * <メソッド>
 * 引数：List<Integer>
 * 戻り値：List<String>
 * 処理：引数で受け取ったデータに任意の文字列を足す
 *
 * 作成したメソッドを使用後、コレクション内のデータを1つずつ表示するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>();
		listInt.add(123);
		listInt.add(456);

		Practice07 p07 = new Practice07();

		List<String> liststr = p07.func(listInt);

		for (String string : liststr) {
			System.out.println( string );
		}

	}
}
class Practice07{
	List<String> func( List<Integer> listInt ){
		List<String> liststr = new ArrayList<>();
		for (Integer integer : listInt) {
			liststr.add( "" + integer );
		}
		return liststr;
	}
}