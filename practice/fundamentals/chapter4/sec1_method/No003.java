package fundamentals.chapter4.sec1_method;
/*
 * int型の「年」「月」「日」を受け取り「XXXX年XX月XX日」という形式の日付を出力するメソッドを定義してください。
 * mainメソッドからそのメソッドを使用していくつか日付を表示させてください。
 */
public class No003 {
	public static void main(String[] args) {
		yyyymmdd( 1994, 7, 29 );
		yyyymmdd( 1996, 2, 27 );
		yyyymmdd( 2014, 8, 10 );
		yyyymmdd( 2015, 8, 10 );
		yyyymmdd( 2018, 4, 12 );
	}
	static void yyyymmdd( int yyyy, int mm, int dd ) {
		System.out.println( yyyy + "年" + mm + "月" + dd + "日" );
	}
}
