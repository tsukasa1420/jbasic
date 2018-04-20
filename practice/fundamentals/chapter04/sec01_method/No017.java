package fundamentals.chapter04.sec01_method;
/*
 * 2つの整数の足し算を行うメソッドと引き算を行うメソッドを作成してください。
 * 足し算を行った結果と任意の数値を引き算メソッドに使用して、結果を表示させるプログラムを作成してください。
 */
public class No017 {
	public static void main(String[] args) {
		System.out.println( Calc.sub(Calc.sum(10, 35), 40) );
	}
}
