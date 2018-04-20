package fundamentals.chapter04.sec01_method;
/*
 * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
 * このメソッドを使用して、九九表を作成してください。
 */

//18 / 4 / 19
public class No014 {
	public static void main(String[] args) {
		for( int i = 1; i <= 9; i++ ) {
			Calc.timesTable( i );
			System.out.println( "◆" );
		}
	}
}
