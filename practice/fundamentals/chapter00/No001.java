package fundamentals.chapter00;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * APIを使用して日時(XXXX年XX月XX日)を表示するプログラムを作成してください。
 * ※APIは自身で探してみてください
 */
public class No001 {
	public static void main(String[] args) {
		Date day = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy年MM月dd日" );
		System.out.println( sdf.format(day) );
	}
}
