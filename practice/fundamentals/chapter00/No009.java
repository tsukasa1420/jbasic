package fundamentals.chapter00;

import java.util.function.Function;

/*
 * java.util.functionのインターフェース（Function<T,R>）を使用して
 * 「Hello10000」を表示させるプログラムを作成してください。
 * ※ラムダ式で記述すること
 */
public class No009 {
	public static void main(String[] args) {
		// Function<「引数と同じ値の参照型」,「戻り値と同じ値の参照型」> 「クラス変数名」 = 「引数名」 -> 処理
		Function<Integer, String > func = paraInt -> "Hello" + paraInt;
		System.out.println( func.apply(10000) );
	}
}
